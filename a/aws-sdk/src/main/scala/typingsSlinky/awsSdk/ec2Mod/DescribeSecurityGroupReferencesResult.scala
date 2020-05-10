package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityGroupReferencesResult extends js.Object {
  /**
    * Information about the VPCs with the referencing security groups.
    */
  var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.native
}

object DescribeSecurityGroupReferencesResult {
  @scala.inline
  def apply(): DescribeSecurityGroupReferencesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityGroupReferencesResult]
  }
  @scala.inline
  implicit class DescribeSecurityGroupReferencesResultOps[Self <: DescribeSecurityGroupReferencesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupReferenceSet(value: SecurityGroupReferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupReferenceSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupReferenceSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupReferenceSet")(js.undefined)
        ret
    }
  }
  
}

