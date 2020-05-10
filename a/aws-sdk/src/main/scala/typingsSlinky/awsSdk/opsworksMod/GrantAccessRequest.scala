package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantAccessRequest extends js.Object {
  /**
    * The instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: String = js.native
  /**
    * The length of time (in minutes) that the grant is valid. When the grant expires at the end of this period, the user will no longer be able to use the credentials to log in. If the user is logged in at the time, he or she automatically will be logged out.
    */
  var ValidForInMinutes: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ValidForInMinutes] = js.native
}

object GrantAccessRequest {
  @scala.inline
  def apply(InstanceId: String): GrantAccessRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantAccessRequest]
  }
  @scala.inline
  implicit class GrantAccessRequestOps[Self <: GrantAccessRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidForInMinutes(value: ValidForInMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidForInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidForInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidForInMinutes")(js.undefined)
        ret
    }
  }
  
}

