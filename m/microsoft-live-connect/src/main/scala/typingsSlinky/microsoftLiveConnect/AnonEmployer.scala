package typingsSlinky.microsoftLiveConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmployer extends js.Object {
  var employer: AnonName = js.native
}

object AnonEmployer {
  @scala.inline
  def apply(employer: AnonName): AnonEmployer = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmployer]
  }
  @scala.inline
  implicit class AnonEmployerOps[Self <: AnonEmployer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmployer(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("employer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

