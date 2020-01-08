package typingsSlinky.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMountTargetSecurityGroupsResponse extends js.Object {
  /**
    * An array of security groups.
    */
  var SecurityGroups: typingsSlinky.awsDashSdk.clientsEfsMod.SecurityGroups = js.native
}

object DescribeMountTargetSecurityGroupsResponse {
  @scala.inline
  def apply(SecurityGroups: SecurityGroups): DescribeMountTargetSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal(SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeMountTargetSecurityGroupsResponse]
  }
}

