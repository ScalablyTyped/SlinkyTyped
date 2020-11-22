package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.GroupLicenseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrouplicenseusersResource extends js.Object {
  
  /** Retrieves the IDs of the users who have been granted entitlements under the license. */
  def list(): Request[GroupLicenseUsersListResponse] = js.native
  def list(request: GroupLicenseId): Request[GroupLicenseUsersListResponse] = js.native
}
