package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AcceptsInterstitialPlacements
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.OauthtokenPrettyPrintProfileIdQuotaUser
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.PrettyPrintProfileIdQuotaUserResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends js.Object {
  
  /** Gets one site by ID. */
  def get(): Request[Site] = js.native
  def get(request: Alt): Request[Site] = js.native
  
  def insert(request: Callback, body: Site): Request[Site] = js.native
  /** Inserts a new site. */
  def insert(request: OauthtokenPrettyPrintProfileIdQuotaUser): Request[Site] = js.native
  
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(): Request[SitesListResponse] = js.native
  def list(request: AcceptsInterstitialPlacements): Request[SitesListResponse] = js.native
  
  def patch(request: Alt, body: Site): Request[Site] = js.native
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: PrettyPrintProfileIdQuotaUserResource): Request[Site] = js.native
  
  def update(request: Callback, body: Site): Request[Site] = js.native
  /** Updates an existing site. */
  def update(request: OauthtokenPrettyPrintProfileIdQuotaUser): Request[Site] = js.native
}
