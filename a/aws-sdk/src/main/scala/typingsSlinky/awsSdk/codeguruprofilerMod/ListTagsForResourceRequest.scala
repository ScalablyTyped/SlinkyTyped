package typingsSlinky.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the resource that contains the tags to return. 
    */
  var resourceArn: ProfilingGroupArn = js.native
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(resourceArn: ProfilingGroupArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ProfilingGroupArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
