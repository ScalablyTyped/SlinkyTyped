package typingsSlinky.kafkaNode.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.kafkaNode.anon.ControllerId
import typingsSlinky.kafkaNode.anon.Isr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMetadataResponse extends StObject {
  
  var clusterMetadata: ControllerId = js.native
  
  var metadata: StringDictionary[NumberDictionary[Isr]] = js.native
}
object ClusterMetadataResponse {
  
  @scala.inline
  def apply(clusterMetadata: ControllerId, metadata: StringDictionary[NumberDictionary[Isr]]): ClusterMetadataResponse = {
    val __obj = js.Dynamic.literal(clusterMetadata = clusterMetadata.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMetadataResponse]
  }
  
  @scala.inline
  implicit class ClusterMetadataResponseMutableBuilder[Self <: ClusterMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterMetadata(value: ControllerId): Self = StObject.set(x, "clusterMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[NumberDictionary[Isr]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
