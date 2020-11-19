package typingsSlinky.gapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientIam.anon.Accesstoken
import typingsSlinky.gapiClientIam.anon.Alt
import typingsSlinky.gapiClientIam.anon.Bearertoken
import typingsSlinky.gapiClientIam.anon.Callback
import typingsSlinky.gapiClientIam.anon.Fields
import typingsSlinky.gapiClientIam.anon.Key
import typingsSlinky.gapiClientIam.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesResource extends js.Object {
  
  /** Creates a new Role. */
  def create(request: Accesstoken): Request[Role] = js.native
  
  /**
    * Soft deletes a role. The role is suspended and cannot be used to create new
    * IAM Policy Bindings.
    * The Role will not be included in `ListRoles()` unless `show_deleted` is set
    * in the `ListRolesRequest`. The Role contains the deleted boolean set.
    * Existing Bindings remains, but are inactive. The Role can be undeleted
    * within 7 days. After 7 days the Role is deleted and all Bindings associated
    * with the role are removed.
    */
  def delete(request: Alt): Request[Role] = js.native
  
  /** Gets a Role definition. */
  def get(request: Bearertoken): Request[Role] = js.native
  
  /** Lists the Roles defined on a resource. */
  def list(request: Callback): Request[ListRolesResponse] = js.native
  /** Lists the Roles defined on a resource. */
  def list(request: Key): Request[ListRolesResponse] = js.native
  
  /** Updates a Role definition. */
  def patch(request: Fields): Request[Role] = js.native
  
  /**
    * Queries roles that can be granted on a particular resource.
    * A role is grantable if it can be used as the role in a binding for a policy
    * for that resource.
    */
  def queryGrantableRoles(request: Oauthtoken): Request[QueryGrantableRolesResponse] = js.native
  
  /** Undelete a Role, bringing it back in its previous state. */
  def undelete(request: Bearertoken): Request[Role] = js.native
}
