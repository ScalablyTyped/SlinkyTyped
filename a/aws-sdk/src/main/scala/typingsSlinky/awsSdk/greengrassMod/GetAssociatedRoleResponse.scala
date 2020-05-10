package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociatedRoleResponse extends js.Object {
  /**
    * The time when the role was associated with the group.
    */
  var AssociatedAt: js.UndefOr[string] = js.native
  /**
    * The ARN of the role that is associated with the group.
    */
  var RoleArn: js.UndefOr[string] = js.native
}

object GetAssociatedRoleResponse {
  @scala.inline
  def apply(): GetAssociatedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedRoleResponse]
  }
  @scala.inline
  implicit class GetAssociatedRoleResponseOps[Self <: GetAssociatedRoleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}

