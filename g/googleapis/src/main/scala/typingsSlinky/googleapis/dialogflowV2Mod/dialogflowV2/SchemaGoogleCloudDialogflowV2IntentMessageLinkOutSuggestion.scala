package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suggestion chip message that allows the user to jump out to the app or
  * website associated with this agent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion extends js.Object {
  /**
    * Required. The name of the app or site this chip is linking to.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * Required. The URI of the app or site to open when the user taps the
    * suggestion chip.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestionOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

