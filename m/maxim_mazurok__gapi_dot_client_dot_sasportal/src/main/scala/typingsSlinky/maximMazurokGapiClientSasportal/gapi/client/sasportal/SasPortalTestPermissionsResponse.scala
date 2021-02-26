package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalTestPermissionsResponse extends StObject {
  
  /** A set of permissions that the caller is allowed. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object SasPortalTestPermissionsResponse {
  
  @scala.inline
  def apply(): SasPortalTestPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalTestPermissionsResponse]
  }
  
  @scala.inline
  implicit class SasPortalTestPermissionsResponseMutableBuilder[Self <: SasPortalTestPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
