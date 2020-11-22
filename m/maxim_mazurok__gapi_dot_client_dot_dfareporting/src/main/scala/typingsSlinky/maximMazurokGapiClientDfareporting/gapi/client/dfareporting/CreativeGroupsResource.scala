package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.GroupNumber
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.ResourceUploadType
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.UploadTypeUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeGroupsResource extends js.Object {
  
  /** Gets one creative group by ID. */
  def get(): Request[CreativeGroup] = js.native
  def get(request: Alt): Request[CreativeGroup] = js.native
  
  def insert(request: Callback, body: CreativeGroup): Request[CreativeGroup] = js.native
  /** Inserts a new creative group. */
  def insert(request: ResourceUploadType): Request[CreativeGroup] = js.native
  
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(): Request[CreativeGroupsListResponse] = js.native
  def list(request: GroupNumber): Request[CreativeGroupsListResponse] = js.native
  
  def patch(request: Alt, body: CreativeGroup): Request[CreativeGroup] = js.native
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: UploadTypeUploadprotocol): Request[CreativeGroup] = js.native
  
  def update(request: Callback, body: CreativeGroup): Request[CreativeGroup] = js.native
  /** Updates an existing creative group. */
  def update(request: ResourceUploadType): Request[CreativeGroup] = js.native
}
