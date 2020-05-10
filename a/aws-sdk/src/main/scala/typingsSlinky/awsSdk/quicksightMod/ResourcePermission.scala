package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePermission extends js.Object {
  /**
    * The action to grant or revoke permissions on, for example "quicksight:DescribeDashboard".
    */
  var Actions: ActionList = js.native
  /**
    * The Amazon Resource Name (ARN) of an Amazon QuickSight user or group, or an IAM ARN. If you are using cross-account resource sharing, this is the IAM ARN of an account root. Otherwise, it is the ARN of a QuickSight user or group. .
    */
  var Principal: typingsSlinky.awsSdk.quicksightMod.Principal = js.native
}

object ResourcePermission {
  @scala.inline
  def apply(Actions: ActionList, Principal: Principal): ResourcePermission = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePermission]
  }
  @scala.inline
  implicit class ResourcePermissionOps[Self <: ResourcePermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: ActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipal(value: Principal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

