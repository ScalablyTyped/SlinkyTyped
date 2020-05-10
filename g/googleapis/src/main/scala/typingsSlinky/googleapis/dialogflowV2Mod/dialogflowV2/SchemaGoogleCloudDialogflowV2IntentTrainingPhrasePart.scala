package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a part of a training phrase.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart extends js.Object {
  /**
    * Optional. The parameter name for the value extracted from the annotated
    * part of the example. This field is required for annotated parts of the
    * training phrase.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Optional. The entity type name prefixed with `@`. This field is required
    * for annotated parts of the training phrase.
    */
  var entityType: js.UndefOr[String] = js.native
  /**
    * Required. The text for this part.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Optional. Indicates whether the text was manually annotated. This field
    * is set to true when the Dialogflow Console is used to manually annotate
    * the part. When creating an annotated part with the API, you must set this
    * to true.
    */
  var userDefined: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePartOps[Self <: SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefined")(js.undefined)
        ret
    }
  }
  
}

