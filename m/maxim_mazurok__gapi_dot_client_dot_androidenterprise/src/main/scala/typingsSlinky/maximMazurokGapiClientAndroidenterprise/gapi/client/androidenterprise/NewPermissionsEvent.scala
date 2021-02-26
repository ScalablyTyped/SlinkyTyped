package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewPermissionsEvent extends StObject {
  
  /** The set of permissions that the enterprise admin has already approved for this application. Use Permissions.Get on the EMM API to retrieve details about these permissions. */
  var approvedPermissions: js.UndefOr[js.Array[String]] = js.native
  
  /** The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added. This field will always be present. */
  var productId: js.UndefOr[String] = js.native
  
  /** The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API to retrieve details about these permissions. */
  var requestedPermissions: js.UndefOr[js.Array[String]] = js.native
}
object NewPermissionsEvent {
  
  @scala.inline
  def apply(): NewPermissionsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewPermissionsEvent]
  }
  
  @scala.inline
  implicit class NewPermissionsEventMutableBuilder[Self <: NewPermissionsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovedPermissions(value: js.Array[String]): Self = StObject.set(x, "approvedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedPermissionsUndefined: Self = StObject.set(x, "approvedPermissions", js.undefined)
    
    @scala.inline
    def setApprovedPermissionsVarargs(value: String*): Self = StObject.set(x, "approvedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setRequestedPermissions(value: js.Array[String]): Self = StObject.set(x, "requestedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedPermissionsUndefined: Self = StObject.set(x, "requestedPermissions", js.undefined)
    
    @scala.inline
    def setRequestedPermissionsVarargs(value: String*): Self = StObject.set(x, "requestedPermissions", js.Array(value :_*))
  }
}
