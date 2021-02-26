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
trait ParamsResourcePeopleGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * **Required.** A field mask to restrict which fields on the person are
    * returned. Multiple fields can be specified by separating them with
    * commas. Valid values are:  * addresses * ageRanges * biographies *
    * birthdays * braggingRights * coverPhotos * emailAddresses * events *
    * genders * imClients * interests * locales * memberships * metadata *
    * names * nicknames * occupations * organizations * phoneNumbers * photos *
    * relations * relationshipInterests * relationshipStatuses * residences *
    * sipAddresses * skills * taglines * urls * userDefined
    */
  var personFields: js.UndefOr[String] = js.native
  
  /**
    * **Required.** Comma-separated list of person fields to be included in the
    * response. Each path should start with `person.`: for example,
    * `person.names` or `person.photos`.
    */
  @JSName("requestMask.includeField")
  var requestMaskDotincludeField: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the person to provide information about.  - To get
    * information about the authenticated user, specify `people/me`. - To get
    * information about a google account, specify
    * `people/`<var>account_id</var>. - To get information about a contact,
    * specify the resource name that   identifies the contact as returned by
    * [`people.connections.list`](/people/api/rest/v1/people.connections/list).
    */
  var resourceName: js.UndefOr[String] = js.native
}
object ParamsResourcePeopleGet {
  
  @scala.inline
  def apply(): ParamsResourcePeopleGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleGet]
  }
  
  @scala.inline
  implicit class ParamsResourcePeopleGetMutableBuilder[Self <: ParamsResourcePeopleGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonFieldsUndefined: Self = StObject.set(x, "personFields", js.undefined)
    
    @scala.inline
    def setRequestMaskDotincludeField(value: String): Self = StObject.set(x, "requestMask.includeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMaskDotincludeFieldUndefined: Self = StObject.set(x, "requestMask.includeField", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
