package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterOperationResponse extends js.Object {
  /**
    * 
    Cluster operation information
    
    */
  var ClusterOperationInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ClusterOperationInfo] = js.native
}

object DescribeClusterOperationResponse {
  @scala.inline
  def apply(): DescribeClusterOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterOperationResponse]
  }
  @scala.inline
  implicit class DescribeClusterOperationResponseOps[Self <: DescribeClusterOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterOperationInfo(value: ClusterOperationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterOperationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterOperationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterOperationInfo")(js.undefined)
        ret
    }
  }
  
}

