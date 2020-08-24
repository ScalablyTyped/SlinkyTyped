package typingsSlinky.reactMdMenu.useItemVisibilityMod

import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactMdMenu.useVisibilityMod.VisibilityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemVisibilityOptions extends VisibilityOptions {
  var horizontal: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.native
}

object ItemVisibilityOptions {
  @scala.inline
  def apply(): ItemVisibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemVisibilityOptions]
  }
  @scala.inline
  implicit class ItemVisibilityOptionsOps[Self <: ItemVisibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLLIElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLLIElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
  
}

