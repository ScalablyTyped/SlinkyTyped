package typingsSlinky.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWait extends js.Object {
  @JSName("wait")
  var wait_FAnonWait: Double = js.native
}

object AnonWait {
  @scala.inline
  def apply(wait: Double): AnonWait = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWait]
  }
  @scala.inline
  implicit class AnonWaitOps[Self <: AnonWait] (val x: Self) extends AnyVal {
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

