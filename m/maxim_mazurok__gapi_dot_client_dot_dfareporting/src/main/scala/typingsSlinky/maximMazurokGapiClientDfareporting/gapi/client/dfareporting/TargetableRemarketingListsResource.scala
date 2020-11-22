package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.ActiveAdvertiserId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetableRemarketingListsResource extends js.Object {
  
  /** Gets one remarketing list by ID. */
  def get(): Request[TargetableRemarketingList] = js.native
  def get(request: Alt): Request[TargetableRemarketingList] = js.native
  
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(): Request[TargetableRemarketingListsListResponse] = js.native
  def list(request: ActiveAdvertiserId): Request[TargetableRemarketingListsListResponse] = js.native
}
