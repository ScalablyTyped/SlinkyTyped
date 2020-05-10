package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserFromSharedAppleDeviceActionResult extends DeviceActionResult {
  // User principal name of the user to be deleted
  var userPrincipalName: js.UndefOr[String] = js.native
}

object DeleteUserFromSharedAppleDeviceActionResult {
  @scala.inline
  def apply(): DeleteUserFromSharedAppleDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUserFromSharedAppleDeviceActionResult]
  }
  @scala.inline
  implicit class DeleteUserFromSharedAppleDeviceActionResultOps[Self <: DeleteUserFromSharedAppleDeviceActionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
  }
  
}

