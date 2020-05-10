package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFargateProfileResponse extends js.Object {
  /**
    * The full description of your new Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.native
}

object CreateFargateProfileResponse {
  @scala.inline
  def apply(): CreateFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFargateProfileResponse]
  }
  @scala.inline
  implicit class CreateFargateProfileResponseOps[Self <: CreateFargateProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFargateProfile(value: FargateProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFargateProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfile")(js.undefined)
        ret
    }
  }
  
}

