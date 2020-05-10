package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of suggestions.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions extends js.Object {
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestionsOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestion]): Self = {
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

