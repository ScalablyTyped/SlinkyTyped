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
trait ParamsResourceContactgroupsBatchget extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Specifies the maximum number of members to return for each group.
    */
  var maxMembers: js.UndefOr[Double] = js.native
  
  /**
    * The resource names of the contact groups to get.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceContactgroupsBatchget {
  
  @scala.inline
  def apply(): ParamsResourceContactgroupsBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsBatchget]
  }
  
  @scala.inline
  implicit class ParamsResourceContactgroupsBatchgetMutableBuilder[Self <: ParamsResourceContactgroupsBatchget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMaxMembers(value: Double): Self = StObject.set(x, "maxMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMembersUndefined: Self = StObject.set(x, "maxMembers", js.undefined)
    
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
  }
}
