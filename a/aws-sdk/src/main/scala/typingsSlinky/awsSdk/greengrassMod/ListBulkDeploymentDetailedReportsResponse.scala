package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBulkDeploymentDetailedReportsResponse extends js.Object {
  /**
    * A list of the individual group deployments in the bulk deployment operation.
    */
  var Deployments: js.UndefOr[BulkDeploymentResults] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListBulkDeploymentDetailedReportsResponse {
  @scala.inline
  def apply(): ListBulkDeploymentDetailedReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBulkDeploymentDetailedReportsResponse]
  }
  @scala.inline
  implicit class ListBulkDeploymentDetailedReportsResponseOps[Self <: ListBulkDeploymentDetailedReportsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployments(value: BulkDeploymentResults): Self = {
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
    @scala.inline
    def withNextToken(value: string): Self = {
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
  }
  
}

