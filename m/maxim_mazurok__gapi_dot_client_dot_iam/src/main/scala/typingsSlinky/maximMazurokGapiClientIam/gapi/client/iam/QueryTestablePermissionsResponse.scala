package typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTestablePermissionsResponse extends StObject {
  
  /** To retrieve the next page of results, set `QueryTestableRolesRequest.page_token` to this value. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The Permissions testable on the requested resource. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
}
object QueryTestablePermissionsResponse {
  
  @scala.inline
  def apply(): QueryTestablePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTestablePermissionsResponse]
  }
  
  @scala.inline
  implicit class QueryTestablePermissionsResponseMutableBuilder[Self <: QueryTestablePermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
