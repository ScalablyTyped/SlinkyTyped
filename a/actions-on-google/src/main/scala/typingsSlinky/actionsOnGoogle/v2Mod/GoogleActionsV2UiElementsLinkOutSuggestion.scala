package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsLinkOutSuggestion extends js.Object {
  /**
    * The name of the app or site this chip is linking to. The chip will be
    * rendered with the title \"Open <destination_name>\". Max 20 chars.
    * Required.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * The URL of the App or Site to open when the user taps the suggestion chip.
    * Ownership of this App/URL must be validated in the Actions on Google
    * developer  console, or the suggestion will not be shown to the user.
    * Open URL Action supports http, https and intent URLs.
    * For Intent URLs refer to:
    * https://developer.chrome.com/multidevice/android/intents
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
  /**
    * Deprecated. Use OpenUrlAction instead.
    */
  var url: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsLinkOutSuggestion {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsLinkOutSuggestion]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsLinkOutSuggestionOps[Self <: GoogleActionsV2UiElementsLinkOutSuggestion] (val x: Self) extends AnyVal {
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
    def withOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenUrlAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlAction")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

