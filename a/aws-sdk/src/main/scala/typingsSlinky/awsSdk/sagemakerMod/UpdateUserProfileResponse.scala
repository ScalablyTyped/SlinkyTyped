package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserProfileResponse extends js.Object {
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserProfileArn] = js.native
}

object UpdateUserProfileResponse {
  @scala.inline
  def apply(): UpdateUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserProfileResponse]
  }
  @scala.inline
  implicit class UpdateUserProfileResponseOps[Self <: UpdateUserProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserProfileArn(value: UserProfileArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileArn")(js.undefined)
        ret
    }
  }
  
}

