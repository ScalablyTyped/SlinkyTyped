package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMultiplexRequest extends StObject {
  
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: string = js.native
}
object DescribeMultiplexRequest {
  
  @scala.inline
  def apply(MultiplexId: string): DescribeMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiplexRequest]
  }
  
  @scala.inline
  implicit class DescribeMultiplexRequestMutableBuilder[Self <: DescribeMultiplexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
  }
}
