package typingsSlinky.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetCommitRequest extends StObject {
  
  var metadata: js.UndefOr[String] = js.native
  
  var offset: Double = js.native
  
  var partition: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
}
object OffsetCommitRequest {
  
  @scala.inline
  def apply(offset: Double, topic: String): OffsetCommitRequest = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetCommitRequest]
  }
  
  @scala.inline
  implicit class OffsetCommitRequestMutableBuilder[Self <: OffsetCommitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
