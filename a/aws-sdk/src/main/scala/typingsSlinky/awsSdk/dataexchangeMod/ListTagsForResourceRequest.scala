package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceRequest extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies an AWS resource.
    */
  var ResourceArn: string = js.native
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: string): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
