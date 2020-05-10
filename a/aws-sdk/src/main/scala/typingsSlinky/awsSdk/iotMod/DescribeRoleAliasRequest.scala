package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRoleAliasRequest extends js.Object {
  /**
    * The role alias to describe.
    */
  var roleAlias: RoleAlias = js.native
}

object DescribeRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias): DescribeRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRoleAliasRequest]
  }
  @scala.inline
  implicit class DescribeRoleAliasRequestOps[Self <: DescribeRoleAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleAlias(value: RoleAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAlias")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

