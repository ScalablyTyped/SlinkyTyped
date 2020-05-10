package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMountTargetSecurityGroupsResponse extends js.Object {
  /**
    * An array of security groups.
    */
  var SecurityGroups: typingsSlinky.awsSdk.efsMod.SecurityGroups = js.native
}

object DescribeMountTargetSecurityGroupsResponse {
  @scala.inline
  def apply(SecurityGroups: SecurityGroups): DescribeMountTargetSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal(SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsResponse]
  }
  @scala.inline
  implicit class DescribeMountTargetSecurityGroupsResponseOps[Self <: DescribeMountTargetSecurityGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroups(value: SecurityGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

