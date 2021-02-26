package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRolesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** User role collection. */
  var userRoles: js.UndefOr[js.Array[UserRole]] = js.native
}
object UserRolesListResponse {
  
  @scala.inline
  def apply(): UserRolesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRolesListResponse]
  }
  
  @scala.inline
  implicit class UserRolesListResponseMutableBuilder[Self <: UserRolesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUserRoles(value: js.Array[UserRole]): Self = StObject.set(x, "userRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRolesUndefined: Self = StObject.set(x, "userRoles", js.undefined)
    
    @scala.inline
    def setUserRolesVarargs(value: UserRole*): Self = StObject.set(x, "userRoles", js.Array(value :_*))
  }
}
