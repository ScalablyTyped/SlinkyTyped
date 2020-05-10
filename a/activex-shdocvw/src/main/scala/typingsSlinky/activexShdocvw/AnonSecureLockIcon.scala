package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSecureLockIcon extends js.Object {
  val SecureLockIcon: Double = js.native
}

object AnonSecureLockIcon {
  @scala.inline
  def apply(SecureLockIcon: Double): AnonSecureLockIcon = {
    val __obj = js.Dynamic.literal(SecureLockIcon = SecureLockIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSecureLockIcon]
  }
  @scala.inline
  implicit class AnonSecureLockIconOps[Self <: AnonSecureLockIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecureLockIcon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureLockIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

