package typingsSlinky.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceRequest extends StObject {
  
  /**
    *  The ARN of the Elastic Inference Accelerator to list the tags for. 
    */
  var resourceArn: ResourceARN_ = js.native
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(resourceArn: ResourceARN_): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceARN_): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
