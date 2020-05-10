package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceProfileResponse extends js.Object {
  /**
    * A structure containing details about the instance profile.
    */
  var InstanceProfile: typingsSlinky.awsSdk.iamMod.InstanceProfile = js.native
}

object GetInstanceProfileResponse {
  @scala.inline
  def apply(InstanceProfile: InstanceProfile): GetInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileResponse]
  }
  @scala.inline
  implicit class GetInstanceProfileResponseOps[Self <: GetInstanceProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceProfile(value: InstanceProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

