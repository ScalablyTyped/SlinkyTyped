package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.ChannelId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Filter
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.OrderBy
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PartnerId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Resource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.UploadType
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.UrlOrAppId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends StObject {
  
  /**
    * Bulk edits sites under a single channel. The operation will delete the sites provided in BulkEditSitesRequest.deleted_sites and then create the sites provided in
    * BulkEditSitesRequest.created_sites.
    */
  def bulkEdit(request: ChannelId): Request[BulkEditSitesResponse] = js.native
  def bulkEdit(request: Oauthtoken, body: BulkEditSitesRequest): Request[BulkEditSitesResponse] = js.native
  /**
    * Bulk edits sites under a single channel. The operation will delete the sites provided in BulkEditSitesRequest.deleted_sites and then create the sites provided in
    * BulkEditSitesRequest.created_sites.
    */
  def bulkEdit(request: Resource): Request[BulkEditSitesResponse] = js.native
  def bulkEdit(request: UploadType, body: BulkEditSitesRequest): Request[BulkEditSitesResponse] = js.native
  
  /** Creates a site in a channel. */
  def create(request: PartnerId): Request[Site] = js.native
  def create(request: PrettyPrint, body: Site): Request[Site] = js.native
  /** Creates a site in a channel. */
  def create(request: Uploadprotocol): Request[Site] = js.native
  def create(request: Xgafv, body: Site): Request[Site] = js.native
  
  /** Deletes a site from a channel. */
  def delete(): Request[js.Object] = js.native
  def delete(request: QuotaUser): Request[js.Object] = js.native
  def delete(request: UrlOrAppId): Request[js.Object] = js.native
  
  /** Lists sites in a channel. */
  def list(): Request[ListSitesResponse] = js.native
  def list(request: Filter): Request[ListSitesResponse] = js.native
  def list(request: OrderBy): Request[ListSitesResponse] = js.native
}
