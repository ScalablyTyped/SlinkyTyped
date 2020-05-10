package typingsSlinky.activexDiskquota

import typingsSlinky.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPUser extends js.Object {
  val pUser: DIDiskQuotaUser = js.native
}

object AnonPUser {
  @scala.inline
  def apply(pUser: DIDiskQuotaUser): AnonPUser = {
    val __obj = js.Dynamic.literal(pUser = pUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPUser]
  }
  @scala.inline
  implicit class AnonPUserOps[Self <: AnonPUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPUser(value: DIDiskQuotaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pUser")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

