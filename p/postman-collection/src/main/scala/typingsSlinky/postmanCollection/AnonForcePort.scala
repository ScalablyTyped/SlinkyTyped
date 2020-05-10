package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForcePort extends js.Object {
  var forcePort: Boolean = js.native
}

object AnonForcePort {
  @scala.inline
  def apply(forcePort: Boolean): AnonForcePort = {
    val __obj = js.Dynamic.literal(forcePort = forcePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForcePort]
  }
  @scala.inline
  implicit class AnonForcePortOps[Self <: AnonForcePort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForcePort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

