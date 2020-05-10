package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsSuggestion extends js.Object {
  /**
    * The text shown the in the suggestion chip. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of suggestion chips.
    * Max 25 chars
    * Required
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsSuggestion {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsSuggestion]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsSuggestionOps[Self <: GoogleActionsV2UiElementsSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

