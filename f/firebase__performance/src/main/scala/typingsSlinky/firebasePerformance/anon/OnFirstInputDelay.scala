package typingsSlinky.firebasePerformance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFirstInputDelay extends js.Object {
  var onFirstInputDelay: js.Function = js.native
}

object OnFirstInputDelay {
  @scala.inline
  def apply(onFirstInputDelay: js.Function): OnFirstInputDelay = {
    val __obj = js.Dynamic.literal(onFirstInputDelay = onFirstInputDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFirstInputDelay]
  }
  @scala.inline
  implicit class OnFirstInputDelayOps[Self <: OnFirstInputDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFirstInputDelay(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstInputDelay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

