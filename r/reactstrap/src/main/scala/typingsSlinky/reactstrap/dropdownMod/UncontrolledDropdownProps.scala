package typingsSlinky.reactstrap.dropdownMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UncontrolledDropdownProps extends DropdownProps {
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var onToggle: js.UndefOr[
    js.Function2[
      /* event */ SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element], 
      /* isOpen */ Boolean, 
      Unit
    ]
  ] = js.native
}

object UncontrolledDropdownProps {
  @scala.inline
  def apply(): UncontrolledDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UncontrolledDropdownProps]
  }
  @scala.inline
  implicit class UncontrolledDropdownPropsOps[Self <: UncontrolledDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(
      value: (/* event */ SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element], /* isOpen */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
  }
  
}

