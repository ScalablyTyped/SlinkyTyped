package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.GroupLicenseId
import typingsSlinky.maximMazurokGapiClientAndroidenterprise.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrouplicensesResource extends js.Object {
  
  /** Retrieves details of an enterprise's group license for a product. */
  def get(): Request[GroupLicense] = js.native
  def get(request: GroupLicenseId): Request[GroupLicense] = js.native
  
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(): Request[GroupLicensesListResponse] = js.native
  def list(request: Oauthtoken): Request[GroupLicensesListResponse] = js.native
}
