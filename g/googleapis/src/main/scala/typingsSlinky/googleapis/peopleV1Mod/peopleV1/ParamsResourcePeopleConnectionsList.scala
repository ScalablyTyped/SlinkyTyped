package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePeopleConnectionsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The number of connections to include in the response. Valid values are
    * between 1 and 2000, inclusive. Defaults to 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The token of the page to be returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * **Required.** A field mask to restrict which fields on each person are
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
    * Whether the response should include a sync token, which can be used to
    * get all changes since the last request. For subsequent sync requests use
    * the `sync_token` param instead. Initial sync requests that specify
    * `request_sync_token` have an additional rate limit.
    */
  var requestSyncToken: js.UndefOr[Boolean] = js.native
  
  /**
    * The resource name to return connections for. Only `people/me` is valid.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * The order in which the connections should be sorted. Defaults to
    * `LAST_MODIFIED_ASCENDING`.
    */
  var sortOrder: js.UndefOr[String] = js.native
  
  /**
    * A sync token returned by a previous call to `people.connections.list`.
    * Only resources changed since the sync token was created will be returned.
    * Sync requests that specify `sync_token` have an additional rate limit.
    */
  var syncToken: js.UndefOr[String] = js.native
}
object ParamsResourcePeopleConnectionsList {
  
  @scala.inline
  def apply(): ParamsResourcePeopleConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleConnectionsList]
  }
  
  @scala.inline
  implicit class ParamsResourcePeopleConnectionsListOps[Self <: ParamsResourcePeopleConnectionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPersonFields(value: String): Self = this.set("personFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonFields: Self = this.set("personFields", js.undefined)
    
    @scala.inline
    def setRequestMaskDotincludeField(value: String): Self = this.set("requestMask.includeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMaskDotincludeField: Self = this.set("requestMask.includeField", js.undefined)
    
    @scala.inline
    def setRequestSyncToken(value: Boolean): Self = this.set("requestSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestSyncToken: Self = this.set("requestSyncToken", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setSyncToken(value: String): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
  }
}
