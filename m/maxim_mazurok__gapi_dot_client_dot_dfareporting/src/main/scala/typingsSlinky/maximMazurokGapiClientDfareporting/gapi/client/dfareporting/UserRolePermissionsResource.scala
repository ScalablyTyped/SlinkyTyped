package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FieldsIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRolePermissionsResource extends StObject {
  
  /** Gets one user role permission by ID. */
  def get(): Request[UserRolePermission] = js.native
  def get(request: Alt): Request[UserRolePermission] = js.native
  
  /** Gets a list of user role permissions, possibly filtered. */
  def list(): Request[UserRolePermissionsListResponse] = js.native
  def list(request: FieldsIds): Request[UserRolePermissionsListResponse] = js.native
}
