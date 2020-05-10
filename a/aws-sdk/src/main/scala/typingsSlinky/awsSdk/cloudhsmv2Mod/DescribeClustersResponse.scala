package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersResponse extends js.Object {
  /**
    * A list of clusters.
    */
  var Clusters: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Clusters] = js.native
  /**
    * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a subsequent DescribeClusters request to get more clusters.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.NextToken] = js.native
}

object DescribeClustersResponse {
  @scala.inline
  def apply(): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersResponse]
  }
  @scala.inline
  implicit class DescribeClustersResponseOps[Self <: DescribeClustersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: Clusters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clusters")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

