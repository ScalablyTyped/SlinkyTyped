package typingsSlinky.reactNativeTabView.scrollPagerMod

import typingsSlinky.reactNativeTabView.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var initialOffset: AnonX = js.native
}

object State {
  @scala.inline
  def apply(initialOffset: AnonX): State = {
    val __obj = js.Dynamic.literal(initialOffset = initialOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialOffset(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

