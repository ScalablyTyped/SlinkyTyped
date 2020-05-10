package typingsSlinky.reachCombobox.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboboxPopoverProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var portal: js.UndefOr[Boolean] = js.native
}

object ComboboxPopoverProps {
  @scala.inline
  def apply(): ComboboxPopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboboxPopoverProps]
  }
  @scala.inline
  implicit class ComboboxPopoverPropsOps[Self <: ComboboxPopoverProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(js.undefined)
        ret
    }
  }
  
}

