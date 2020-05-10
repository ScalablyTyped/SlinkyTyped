package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of suggestions.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageSuggestions extends js.Object {
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageSuggestions {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSuggestions]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageSuggestionsOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
  }
  
}

