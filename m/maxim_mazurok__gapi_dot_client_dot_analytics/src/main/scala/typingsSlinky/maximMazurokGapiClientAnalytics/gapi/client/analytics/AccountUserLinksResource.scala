package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.LinkId
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Maxresults
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUserLinksResource extends js.Object {
  
  /** Removes a user from the given account. */
  def delete(): Request[Unit] = js.native
  def delete(request: LinkId): Request[Unit] = js.native
  
  /** Adds a new user to the given account. */
  def insert(request: Oauthtoken): Request[EntityUserLink] = js.native
  def insert(request: PrettyPrint, body: EntityUserLink): Request[EntityUserLink] = js.native
  
  /** Lists account-user links for a given account. */
  def list(): Request[EntityUserLinks] = js.native
  def list(request: Maxresults): Request[EntityUserLinks] = js.native
  
  def update(request: LinkId, body: EntityUserLink): Request[EntityUserLink] = js.native
  /** Updates permissions for an existing user on the given account. */
  def update(request: QuotaUser): Request[EntityUserLink] = js.native
}
