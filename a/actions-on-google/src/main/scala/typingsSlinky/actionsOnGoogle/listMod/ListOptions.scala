package typingsSlinky.actionsOnGoogle.listMod

import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItem
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItems
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsListSelectListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOptions extends js.Object {
  /** @public */
  var items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem] = js.native
  /** @public */
  var title: js.UndefOr[String] = js.native
}

object ListOptions {
  @scala.inline
  def apply(items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]): ListOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
  @scala.inline
  implicit class ListOptionsOps[Self <: ListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
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

