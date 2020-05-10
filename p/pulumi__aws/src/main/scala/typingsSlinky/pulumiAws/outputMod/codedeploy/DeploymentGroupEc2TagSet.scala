package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupEc2TagSet extends js.Object {
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  var ec2TagFilters: js.UndefOr[js.Array[DeploymentGroupEc2TagSetEc2TagFilter]] = js.native
}

object DeploymentGroupEc2TagSet {
  @scala.inline
  def apply(): DeploymentGroupEc2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupEc2TagSet]
  }
  @scala.inline
  implicit class DeploymentGroupEc2TagSetOps[Self <: DeploymentGroupEc2TagSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2TagFilters(value: js.Array[DeploymentGroupEc2TagSetEc2TagFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2TagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagFilters")(js.undefined)
        ret
    }
  }
  
}

