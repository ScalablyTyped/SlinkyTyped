package typingsSlinky.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wait extends js.Object {
  @JSName("wait")
  var wait_FWait: Double = js.native
}

object Wait {
  @scala.inline
  def apply(wait: Double): Wait = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wait]
  }
  @scala.inline
  implicit class WaitOps[Self <: Wait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

