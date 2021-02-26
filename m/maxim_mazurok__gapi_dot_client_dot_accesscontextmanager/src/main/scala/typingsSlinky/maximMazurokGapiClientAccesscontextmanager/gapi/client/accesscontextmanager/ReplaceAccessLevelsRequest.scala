package typingsSlinky.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAccessLevelsRequest extends StObject {
  
  /** Required. The desired Access Levels that should replace all existing Access Levels in the Access Policy. */
  var accessLevels: js.UndefOr[js.Array[AccessLevel]] = js.native
  
  /**
    * Optional. The etag for the version of the Access Policy that this replace operation is to be performed on. If, at the time of replace, the etag for the Access Policy stored in
    * Access Context Manager is different from the specified etag, then the replace operation will not be performed and the call will fail. This field is not required. If etag is not
    * provided, the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String] = js.native
}
object ReplaceAccessLevelsRequest {
  
  @scala.inline
  def apply(): ReplaceAccessLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAccessLevelsRequest]
  }
  
  @scala.inline
  implicit class ReplaceAccessLevelsRequestMutableBuilder[Self <: ReplaceAccessLevelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLevels(value: js.Array[AccessLevel]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    @scala.inline
    def setAccessLevelsVarargs(value: AccessLevel*): Self = StObject.set(x, "accessLevels", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
