package typingsSlinky.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource tag.
    */
  var ResourceArn: string = js.native
  
  /**
    * The key-value pair for the resource tag.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}
object CreateTagsRequest {
  
  @scala.inline
  def apply(ResourceArn: string): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  
  @scala.inline
  implicit class CreateTagsRequestMutableBuilder[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
