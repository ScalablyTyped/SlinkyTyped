package typingsSlinky.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Cloud9 development environment to get the tags for.
    */
  var ResourceARN: EnvironmentArn = js.native
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(ResourceARN: EnvironmentArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: EnvironmentArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
