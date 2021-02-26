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
trait ParamsResourcePeopleUpdatecontact extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPerson] = js.native
  
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/`<var>person_id</var>.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * **Required.** A field mask to restrict which fields on the person are
    * updated. Multiple fields can be specified by separating them with commas.
    * All updated fields will be replaced. Valid values are:  * addresses *
    * biographies * birthdays * emailAddresses * events * genders * imClients *
    * interests * locales * names * nicknames * occupations * organizations *
    * phoneNumbers * relations * residences * sipAddresses * urls * userDefined
    */
  var updatePersonFields: js.UndefOr[String] = js.native
}
object ParamsResourcePeopleUpdatecontact {
  
  @scala.inline
  def apply(): ParamsResourcePeopleUpdatecontact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleUpdatecontact]
  }
  
  @scala.inline
  implicit class ParamsResourcePeopleUpdatecontactMutableBuilder[Self <: ParamsResourcePeopleUpdatecontact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPerson): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setUpdatePersonFields(value: String): Self = StObject.set(x, "updatePersonFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePersonFieldsUndefined: Self = StObject.set(x, "updatePersonFields", js.undefined)
  }
}
