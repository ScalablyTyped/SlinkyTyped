package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to retrieve tag information for.
    */
  var ResourceArn: AmazonResourceName = js.native
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
