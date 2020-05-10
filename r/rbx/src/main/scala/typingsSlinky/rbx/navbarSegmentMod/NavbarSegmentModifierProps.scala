package typingsSlinky.rbx.navbarSegmentMod

import typingsSlinky.rbx.rbxStrings.end
import typingsSlinky.rbx.rbxStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarSegmentModifierProps extends js.Object {
  var align: start | end = js.native
}

object NavbarSegmentModifierProps {
  @scala.inline
  def apply(align: start | end): NavbarSegmentModifierProps = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarSegmentModifierProps]
  }
  @scala.inline
  implicit class NavbarSegmentModifierPropsOps[Self <: NavbarSegmentModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

