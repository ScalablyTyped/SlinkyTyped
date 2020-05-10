package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInstanceProfileResult extends js.Object {
  /**
    * An object that contains information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
}

object UpdateInstanceProfileResult {
  @scala.inline
  def apply(): UpdateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceProfileResult]
  }
  @scala.inline
  implicit class UpdateInstanceProfileResultOps[Self <: UpdateInstanceProfileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceProfile(value: InstanceProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfile")(js.undefined)
        ret
    }
  }
  
}

