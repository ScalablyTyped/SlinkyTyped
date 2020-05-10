package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterResult extends js.Object {
  /**
    * Information about a specific cluster, including shipping information, cluster status, and other important metadata.
    */
  var ClusterMetadata: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ClusterMetadata] = js.native
}

object DescribeClusterResult {
  @scala.inline
  def apply(): DescribeClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResult]
  }
  @scala.inline
  implicit class DescribeClusterResultOps[Self <: DescribeClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterMetadata(value: ClusterMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterMetadata")(js.undefined)
        ret
    }
  }
  
}

