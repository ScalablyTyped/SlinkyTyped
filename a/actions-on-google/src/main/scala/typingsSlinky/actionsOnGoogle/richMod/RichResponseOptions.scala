package typingsSlinky.actionsOnGoogle.richMod

import typingsSlinky.actionsOnGoogle.suggestionMod.Suggestions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsLinkOutSuggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichResponseOptions extends js.Object {
  /**
    * Ordered list of either SimpleResponse objects or BasicCard objects.
    * First item must be SimpleResponse. There can be at most one card.
    * @public
    */
  var items: js.UndefOr[js.Array[RichResponseItem]] = js.native
  /**
    * Link Out Suggestion chip for this rich response. Optional.
    * @public
    */
  var link: js.UndefOr[GoogleActionsV2UiElementsLinkOutSuggestion] = js.native
  /**
    * Ordered list of text suggestions to display. Optional.
    * @public
    */
  var suggestions: js.UndefOr[js.Array[String] | Suggestions] = js.native
}

object RichResponseOptions {
  @scala.inline
  def apply(): RichResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichResponseOptions]
  }
  @scala.inline
  implicit class RichResponseOptionsOps[Self <: RichResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[RichResponseItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: GoogleActionsV2UiElementsLinkOutSuggestion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[String] | Suggestions): Self = {
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

