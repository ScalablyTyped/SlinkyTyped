package typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientIam.anon.Alt
import typingsSlinky.maximMazurokGapiClientIam.anon.Etag
import typingsSlinky.maximMazurokGapiClientIam.anon.Fields
import typingsSlinky.maximMazurokGapiClientIam.anon.Key
import typingsSlinky.maximMazurokGapiClientIam.anon.Name
import typingsSlinky.maximMazurokGapiClientIam.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientIam.anon.PageSize
import typingsSlinky.maximMazurokGapiClientIam.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientIam.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientIam.anon.Resource
import typingsSlinky.maximMazurokGapiClientIam.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesResource extends js.Object {
  
  /** Creates a new custom Role. */
  def create(request: Fields): Request[Role] = js.native
  def create(request: Key, body: CreateRoleRequest): Request[Role] = js.native
  
  /**
    * Deletes a custom Role. When you delete a custom role, the following changes occur immediately: * You cannot bind a member to the custom role in an IAM Policy. * Existing bindings to
    * the custom role are not changed, but they have no effect. * By default, the response from ListRoles does not include the custom role. You have 7 days to undelete the custom role.
    * After 7 days, the following changes occur: * The custom role is permanently deleted and cannot be recovered. * If an IAM policy contains a binding to the custom role, the binding is
    * permanently removed.
    */
  def delete(): Request[Role] = js.native
  def delete(request: Etag): Request[Role] = js.native
  
  /** Gets the definition of a Role. */
  def get(): Request[Role] = js.native
  def get(request: Name): Request[Role] = js.native
  
  /** Lists every predefined Role that IAM supports, or every custom role that is defined for an organization or project. */
  def list(): Request[ListRolesResponse] = js.native
  def list(request: Oauthtoken): Request[ListRolesResponse] = js.native
  def list(request: PageSize): Request[ListRolesResponse] = js.native
  
  /** Updates the definition of a custom Role. */
  def patch(request: PrettyPrint): Request[Role] = js.native
  def patch(request: QuotaUser, body: Role): Request[Role] = js.native
  
  def queryGrantableRoles(request: Alt, body: QueryGrantableRolesRequest): Request[QueryGrantableRolesResponse] = js.native
  /** Lists roles that can be granted on a Google Cloud resource. A role is grantable if the IAM policy for the resource can contain bindings to the role. */
  def queryGrantableRoles(request: UploadType): Request[QueryGrantableRolesResponse] = js.native
  
  def undelete(request: Name, body: UndeleteRoleRequest): Request[Role] = js.native
  /** Undeletes a custom Role. */
  def undelete(request: Resource): Request[Role] = js.native
}
