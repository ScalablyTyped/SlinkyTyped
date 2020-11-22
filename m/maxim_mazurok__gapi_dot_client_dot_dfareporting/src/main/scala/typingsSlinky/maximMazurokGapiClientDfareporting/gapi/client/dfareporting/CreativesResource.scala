package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.AccesstokenAltCallback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CompanionCreativeIds
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.UploadprotocolXgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends js.Object {
  
  /** Gets one creative by ID. */
  def get(): Request[Creative] = js.native
  def get(request: Alt): Request[Creative] = js.native
  
  def insert(request: Callback, body: Creative): Request[Creative] = js.native
  /** Inserts a new creative. */
  def insert(request: UploadprotocolXgafv): Request[Creative] = js.native
  
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(): Request[CreativesListResponse] = js.native
  def list(request: CompanionCreativeIds): Request[CreativesListResponse] = js.native
  
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: AccesstokenAltCallback): Request[Creative] = js.native
  def patch(request: Alt, body: Creative): Request[Creative] = js.native
  
  def update(request: Callback, body: Creative): Request[Creative] = js.native
  /** Updates an existing creative. */
  def update(request: UploadprotocolXgafv): Request[Creative] = js.native
}
