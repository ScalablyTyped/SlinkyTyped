package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStaleSecurityGroupsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the stale security groups.
    */
  var StaleSecurityGroupSet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.StaleSecurityGroupSet] = js.native
}

object DescribeStaleSecurityGroupsResult {
  @scala.inline
  def apply(): DescribeStaleSecurityGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStaleSecurityGroupsResult]
  }
  @scala.inline
  implicit class DescribeStaleSecurityGroupsResultOps[Self <: DescribeStaleSecurityGroupsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleSecurityGroupSet(value: StaleSecurityGroupSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaleSecurityGroupSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleSecurityGroupSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaleSecurityGroupSet")(js.undefined)
        ret
    }
  }
  
}

