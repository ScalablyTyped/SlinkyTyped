package typingsSlinky.reactNativeModalPopover

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnPopoverDisplayed extends js.Object {
  var onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}

object AnonOnPopoverDisplayed {
  @scala.inline
  def apply(onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]]): AnonOnPopoverDisplayed = {
    val __obj = js.Dynamic.literal(onPopoverDisplayed = onPopoverDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnPopoverDisplayed]
  }
  @scala.inline
  implicit class AnonOnPopoverDisplayedOps[Self <: AnonOnPopoverDisplayed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPopoverDisplayed(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopoverDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

