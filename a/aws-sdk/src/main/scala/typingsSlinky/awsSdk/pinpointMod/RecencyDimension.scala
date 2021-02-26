package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecencyDimension extends StObject {
  
  /**
    * The duration to use when determining whether an endpoint is active or inactive.
    */
  var Duration: typingsSlinky.awsSdk.pinpointMod.Duration = js.native
  
  /**
    * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the specified duration are included in the segment.
    */
  var RecencyType: typingsSlinky.awsSdk.pinpointMod.RecencyType = js.native
}
object RecencyDimension {
  
  @scala.inline
  def apply(Duration: Duration, RecencyType: RecencyType): RecencyDimension = {
    val __obj = js.Dynamic.literal(Duration = Duration.asInstanceOf[js.Any], RecencyType = RecencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecencyDimension]
  }
  
  @scala.inline
  implicit class RecencyDimensionMutableBuilder[Self <: RecencyDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Duration): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecencyType(value: RecencyType): Self = StObject.set(x, "RecencyType", value.asInstanceOf[js.Any])
  }
}
