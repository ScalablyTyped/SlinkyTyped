package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceResponse extends StObject {
  
  /**
    * Tags assigned to a resource.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object ListTagsForResourceResponse {
  
  @scala.inline
  def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResponseMutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
