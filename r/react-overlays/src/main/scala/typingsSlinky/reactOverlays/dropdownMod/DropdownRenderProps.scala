package typingsSlinky.reactOverlays.dropdownMod

import typingsSlinky.reactOverlays.anon.OnKeyDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownRenderProps extends js.Object {
  var props: OnKeyDown = js.native
}

object DropdownRenderProps {
  @scala.inline
  def apply(props: OnKeyDown): DropdownRenderProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownRenderProps]
  }
  @scala.inline
  implicit class DropdownRenderPropsOps[Self <: DropdownRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProps(value: OnKeyDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

