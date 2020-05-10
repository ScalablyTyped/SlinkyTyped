package typingsSlinky.reactstrap.popoverMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UncontrolledPopoverProps extends PopoverProps {
  var defaultOpen: js.UndefOr[Boolean] = js.native
}

object UncontrolledPopoverProps {
  @scala.inline
  def apply(target: String | HTMLElement | ReactRef[HTMLElement]): UncontrolledPopoverProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledPopoverProps]
  }
  @scala.inline
  implicit class UncontrolledPopoverPropsOps[Self <: UncontrolledPopoverProps] (val x: Self) extends AnyVal {
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
  }
  
}

