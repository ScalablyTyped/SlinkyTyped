package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchUpdateEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequest extends js.Object {
  /**
    * The collection of entity types to update or create.
    */
  var entityTypeBatchInline: js.UndefOr[SchemaGoogleCloudDialogflowV2EntityTypeBatch] = js.native
  /**
    * The URI to a Google Cloud Storage file containing entity types to update
    * or create. The file format can either be a serialized proto (of
    * EntityBatch type) or a JSON object. Note: The URI must start with
    * &quot;gs://&quot;.
    */
  var entityTypeBatchUri: js.UndefOr[String] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entity_types`. If
    * not specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequestOps[Self <: SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypeBatchInline(value: SchemaGoogleCloudDialogflowV2EntityTypeBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypeBatchInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchInline")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypeBatchUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypeBatchUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchUri")(js.undefined)
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
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

