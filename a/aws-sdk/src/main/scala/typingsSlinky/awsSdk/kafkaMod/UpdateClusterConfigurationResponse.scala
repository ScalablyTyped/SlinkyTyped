package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterConfigurationResponse extends StObject {
  
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
object UpdateClusterConfigurationResponse {
  
  @scala.inline
  def apply(): UpdateClusterConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterConfigurationResponse]
  }
  
  @scala.inline
  implicit class UpdateClusterConfigurationResponseMutableBuilder[Self <: UpdateClusterConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterOperationArn(value: string): Self = StObject.set(x, "ClusterOperationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterOperationArnUndefined: Self = StObject.set(x, "ClusterOperationArn", js.undefined)
  }
}
