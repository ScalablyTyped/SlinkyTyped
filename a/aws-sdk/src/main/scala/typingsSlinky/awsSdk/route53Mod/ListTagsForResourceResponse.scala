package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceResponse extends StObject {
  
  /**
    * A ResourceTagSet containing tags associated with the specified resource.
    */
  var ResourceTagSet: typingsSlinky.awsSdk.route53Mod.ResourceTagSet = js.native
}
object ListTagsForResourceResponse {
  
  @scala.inline
  def apply(ResourceTagSet: ResourceTagSet): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(ResourceTagSet = ResourceTagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResponseMutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceTagSet(value: ResourceTagSet): Self = StObject.set(x, "ResourceTagSet", value.asInstanceOf[js.Any])
  }
}
