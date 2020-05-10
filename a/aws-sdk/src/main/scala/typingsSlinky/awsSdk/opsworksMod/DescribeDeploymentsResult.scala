package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeploymentsResult extends js.Object {
  /**
    * An array of Deployment objects that describe the deployments.
    */
  var Deployments: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Deployments] = js.native
}

object DescribeDeploymentsResult {
  @scala.inline
  def apply(): DescribeDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsResult]
  }
  @scala.inline
  implicit class DescribeDeploymentsResultOps[Self <: DescribeDeploymentsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployments(value: Deployments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployments")(js.undefined)
        ret
    }
  }
  
}

