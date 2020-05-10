package typingsSlinky.reactOverlays.dropdownToggleMod

import typingsSlinky.reactOverlays.AnonAriaexpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownToggleRenderProps extends js.Object {
  var props: AnonAriaexpanded = js.native
  var show: Boolean = js.native
  def toggle(show: Boolean): Unit = js.native
}

object DropdownToggleRenderProps {
  @scala.inline
  def apply(props: AnonAriaexpanded, show: Boolean, toggle: Boolean => Unit): DropdownToggleRenderProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[DropdownToggleRenderProps]
  }
  @scala.inline
  implicit class DropdownToggleRenderPropsOps[Self <: DropdownToggleRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProps(value: AnonAriaexpanded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggle(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

