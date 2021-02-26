package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBrokerStorageRequest extends StObject {
  
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
  implicit class UpdateBrokerStorageRequestMutableBuilder[Self <: UpdateBrokerStorageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBrokerEBSVolumeInfo(value: listOfBrokerEBSVolumeInfo): Self = StObject.set(x, "TargetBrokerEBSVolumeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBrokerEBSVolumeInfoVarargs(value: BrokerEBSVolumeInfo*): Self = StObject.set(x, "TargetBrokerEBSVolumeInfo", js.Array(value :_*))
  }
}
