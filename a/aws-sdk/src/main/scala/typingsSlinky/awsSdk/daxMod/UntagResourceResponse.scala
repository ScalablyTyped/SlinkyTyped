package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceResponse extends StObject {
  
  /**
    * The tag keys that have been removed from the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object UntagResourceResponse {
  
  @scala.inline
  def apply(): UntagResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceResponse]
  }
  
  @scala.inline
  implicit class UntagResourceResponseMutableBuilder[Self <: UntagResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
