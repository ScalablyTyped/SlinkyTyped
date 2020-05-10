package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRoleAliasResponse extends js.Object {
  /**
    * The role alias description.
    */
  var roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.native
}

object DescribeRoleAliasResponse {
  @scala.inline
  def apply(): DescribeRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRoleAliasResponse]
  }
  @scala.inline
  implicit class DescribeRoleAliasResponseOps[Self <: DescribeRoleAliasResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleAliasDescription(value: RoleAliasDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliasDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAliasDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliasDescription")(js.undefined)
        ret
    }
  }
  
}

