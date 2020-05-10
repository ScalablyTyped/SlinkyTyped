package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterOutput extends js.Object {
  /**
    * This output contains the details for the requested cluster.
    */
  var Cluster: js.UndefOr[typingsSlinky.awsSdk.emrMod.Cluster] = js.native
}

object DescribeClusterOutput {
  @scala.inline
  def apply(): DescribeClusterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterOutput]
  }
  @scala.inline
  implicit class DescribeClusterOutputOps[Self <: DescribeClusterOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: Cluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cluster")(js.undefined)
        ret
    }
  }
  
}

