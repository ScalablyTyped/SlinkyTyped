package typingsSlinky.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTIMESTAMP extends js.Object {
  var TIMESTAMP: AnonSv = js.native
}

object AnonTIMESTAMP {
  @scala.inline
  def apply(TIMESTAMP: AnonSv): AnonTIMESTAMP = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTIMESTAMP]
  }
  @scala.inline
  implicit class AnonTIMESTAMPOps[Self <: AnonTIMESTAMP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTIMESTAMP(value: AnonSv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMESTAMP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

