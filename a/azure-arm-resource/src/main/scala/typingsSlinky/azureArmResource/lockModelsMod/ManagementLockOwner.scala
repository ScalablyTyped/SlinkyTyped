package typingsSlinky.azureArmResource.lockModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementLockOwner extends js.Object {
  /**
    * The application ID of the lock owner.
    */
  var applicationId: js.UndefOr[String] = js.native
}

object ManagementLockOwner {
  @scala.inline
  def apply(): ManagementLockOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementLockOwner]
  }
  @scala.inline
  implicit class ManagementLockOwnerOps[Self <: ManagementLockOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
  }
  
}

