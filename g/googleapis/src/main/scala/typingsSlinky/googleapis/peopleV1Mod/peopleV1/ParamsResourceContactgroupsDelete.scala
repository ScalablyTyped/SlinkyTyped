package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceContactgroupsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Set to true to also delete the contacts in the specified group.
    */
  var deleteContacts: js.UndefOr[Boolean] = js.native
  
  /**
    * The resource name of the contact group to delete.
    */
  var resourceName: js.UndefOr[String] = js.native
}
object ParamsResourceContactgroupsDelete {
  
  @scala.inline
  def apply(): ParamsResourceContactgroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceContactgroupsDeleteMutableBuilder[Self <: ParamsResourceContactgroupsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDeleteContacts(value: Boolean): Self = StObject.set(x, "deleteContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteContactsUndefined: Self = StObject.set(x, "deleteContacts", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
