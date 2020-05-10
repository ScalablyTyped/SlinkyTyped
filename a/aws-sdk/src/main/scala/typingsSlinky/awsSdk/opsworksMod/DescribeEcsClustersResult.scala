package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEcsClustersResult extends js.Object {
  /**
    * A list of EcsCluster objects containing the cluster descriptions.
    */
  var EcsClusters: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.EcsClusters] = js.native
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to retrieve the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEcsClustersResult {
  @scala.inline
  def apply(): DescribeEcsClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEcsClustersResult]
  }
  @scala.inline
  implicit class DescribeEcsClustersResultOps[Self <: DescribeEcsClustersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEcsClusters(value: EcsClusters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EcsClusters")(js.undefined)
        ret
    }
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
  }
  
}

