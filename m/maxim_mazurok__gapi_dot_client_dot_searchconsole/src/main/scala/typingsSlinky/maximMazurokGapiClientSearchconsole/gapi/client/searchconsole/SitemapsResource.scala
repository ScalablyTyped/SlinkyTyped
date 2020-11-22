package typingsSlinky.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSearchconsole.anon.Callback
import typingsSlinky.maximMazurokGapiClientSearchconsole.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitemapsResource extends js.Object {
  
  /** Deletes a sitemap from this site. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Retrieves information about a specific sitemap. */
  def get(): Request[WmxSitemap] = js.native
  def get(request: Callback): Request[WmxSitemap] = js.native
  
  /** Lists the [sitemaps-entries](/webmaster-tools/v3/sitemaps) submitted for this site, or included in the sitemap index file (if `sitemapIndex` is specified in the request). */
  def list(): Request[SitemapsListResponse] = js.native
  def list(request: Fields): Request[SitemapsListResponse] = js.native
  
  /** Submits a sitemap for a site. */
  def submit(): Request[Unit] = js.native
  def submit(request: Callback): Request[Unit] = js.native
}
