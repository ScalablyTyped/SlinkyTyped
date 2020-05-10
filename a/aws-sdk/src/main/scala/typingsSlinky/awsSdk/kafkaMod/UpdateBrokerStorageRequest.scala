package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerStorageRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
  /**
    * 
    The version of cluster to update from. A successful operation will then generate a new version.
    
    */
  var CurrentVersion: string = js.native
  /**
    * 
    Describes the target volume size and the ID of the broker to apply the update to.
    
    */
  var TargetBrokerEBSVolumeInfo: listOfBrokerEBSVolumeInfo = js.native
}

object UpdateBrokerStorageRequest {
  @scala.inline
  def apply(ClusterArn: string, CurrentVersion: string, TargetBrokerEBSVolumeInfo: listOfBrokerEBSVolumeInfo): UpdateBrokerStorageRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetBrokerEBSVolumeInfo = TargetBrokerEBSVolumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerStorageRequest]
  }
  @scala.inline
  implicit class UpdateBrokerStorageRequestOps[Self <: UpdateBrokerStorageRequest] (val x: Self) extends AnyVal {
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
    def withCurrentVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetBrokerEBSVolumeInfo(value: listOfBrokerEBSVolumeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetBrokerEBSVolumeInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

