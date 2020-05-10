package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerCountResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster operation.
    
    */
  var ClusterOperationArn: js.UndefOr[string] = js.native
}

object UpdateBrokerCountResponse {
  @scala.inline
  def apply(): UpdateBrokerCountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBrokerCountResponse]
  }
  @scala.inline
  implicit class UpdateBrokerCountResponseOps[Self <: UpdateBrokerCountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterOperationArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterOperationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterOperationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterOperationArn")(js.undefined)
        ret
    }
  }
  
}

