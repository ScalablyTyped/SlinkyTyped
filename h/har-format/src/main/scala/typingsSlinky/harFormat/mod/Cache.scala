package typingsSlinky.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends StObject {
  
  /**
    * State of a cache entry after the request.
    *
    * Leave out this field if the information is not available.
    */
  var afterRequest: js.UndefOr[CacheDetails | Null] = js.native
  
  /**
    * State of a cache entry before the request.
    *
    * Leave out this field if the information is not available.
    */
  var beforeRequest: js.UndefOr[CacheDetails | Null] = js.native
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
}
object Cache {
  
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRequest(value: CacheDetails): Self = StObject.set(x, "afterRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRequestNull: Self = StObject.set(x, "afterRequest", null)
    
    @scala.inline
    def setAfterRequestUndefined: Self = StObject.set(x, "afterRequest", js.undefined)
    
    @scala.inline
    def setBeforeRequest(value: CacheDetails): Self = StObject.set(x, "beforeRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRequestNull: Self = StObject.set(x, "beforeRequest", null)
    
    @scala.inline
    def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
  }
}
