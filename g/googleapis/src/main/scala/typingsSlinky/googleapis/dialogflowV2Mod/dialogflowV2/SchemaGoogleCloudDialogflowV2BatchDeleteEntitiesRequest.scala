package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchDeleteEntities.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest extends js.Object {
  /**
    * Required. The canonical `values` of the entities to delete. Note that
    * these are not fully-qualified names, i.e. they don&#39;t start with
    * `projects/&lt;Project ID&gt;`.
    */
  var entityValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequestOps[Self <: SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
  }
  
}

