package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Role List Response
  */
@js.native
trait SchemaUserRolesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * User role collection.
    */
  var userRoles: js.UndefOr[js.Array[SchemaUserRole]] = js.native
}
object SchemaUserRolesListResponse {
  
  @scala.inline
  def apply(): SchemaUserRolesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolesListResponse]
  }
  
  @scala.inline
  implicit class SchemaUserRolesListResponseMutableBuilder[Self <: SchemaUserRolesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUserRoles(value: js.Array[SchemaUserRole]): Self = StObject.set(x, "userRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRolesUndefined: Self = StObject.set(x, "userRoles", js.undefined)
    
    @scala.inline
    def setUserRolesVarargs(value: SchemaUserRole*): Self = StObject.set(x, "userRoles", js.Array(value :_*))
  }
}
