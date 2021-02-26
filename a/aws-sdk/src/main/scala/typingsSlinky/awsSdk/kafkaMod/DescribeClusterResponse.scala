package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClusterResponse extends StObject {
  
  /**
    * 
    The cluster information.
    
    */
  var ClusterInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ClusterInfo] = js.native
}
object DescribeClusterResponse {
  
  @scala.inline
  def apply(): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClusterResponse]
  }
  
  @scala.inline
  implicit class DescribeClusterResponseMutableBuilder[Self <: DescribeClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterInfo(value: ClusterInfo): Self = StObject.set(x, "ClusterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterInfoUndefined: Self = StObject.set(x, "ClusterInfo", js.undefined)
  }
}
