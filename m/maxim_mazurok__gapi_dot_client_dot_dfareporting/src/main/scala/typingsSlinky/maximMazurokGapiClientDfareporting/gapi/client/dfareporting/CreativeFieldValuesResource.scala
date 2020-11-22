package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CallbackCreativeFieldId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CreativeFieldId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CreativeFieldIdFields
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.QuotaUserResource
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeFieldValuesResource extends js.Object {
  
  /** Deletes an existing creative field value. */
  def delete(): Request[Unit] = js.native
  def delete(request: CreativeFieldId): Request[Unit] = js.native
  
  /** Gets one creative field value by ID. */
  def get(): Request[CreativeFieldValue] = js.native
  def get(request: CreativeFieldId): Request[CreativeFieldValue] = js.native
  
  /** Inserts a new creative field value. */
  def insert(request: CallbackCreativeFieldId): Request[CreativeFieldValue] = js.native
  def insert(request: CreativeFieldIdFields, body: CreativeFieldValue): Request[CreativeFieldValue] = js.native
  
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(): Request[CreativeFieldValuesListResponse] = js.native
  def list(request: SortField): Request[CreativeFieldValuesListResponse] = js.native
  
  def patch(request: CreativeFieldId, body: CreativeFieldValue): Request[CreativeFieldValue] = js.native
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: QuotaUserResource): Request[CreativeFieldValue] = js.native
  
  /** Updates an existing creative field value. */
  def update(request: CallbackCreativeFieldId): Request[CreativeFieldValue] = js.native
  def update(request: CreativeFieldIdFields, body: CreativeFieldValue): Request[CreativeFieldValue] = js.native
}
