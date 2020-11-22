package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.FieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.QuotaUserTargetMerchantId
import typingsSlinky.maximMazurokGapiClientContent.anon.ResourceTargetMerchantId
import typingsSlinky.maximMazurokGapiClientContent.anon.StoreCode
import typingsSlinky.maximMazurokGapiClientContent.anon.TargetMerchantId
import typingsSlinky.maximMazurokGapiClientContent.anon.TargetMerchantIdUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosResource extends js.Object {
  
  /** Batches multiple POS-related calls in a single request. */
  def custombatch(request: FieldsKeyOauthtoken): Request[PosCustomBatchResponse] = js.native
  def custombatch(request: Key, body: PosCustomBatchRequest): Request[PosCustomBatchResponse] = js.native
  
  /** Deletes a store for the given merchant. */
  def delete(): Request[Unit] = js.native
  def delete(request: StoreCode): Request[Unit] = js.native
  
  /** Retrieves information about the given store. */
  def get(): Request[PosStore] = js.native
  def get(request: StoreCode): Request[PosStore] = js.native
  
  def insert(request: QuotaUserTargetMerchantId, body: PosStore): Request[PosStore] = js.native
  /** Creates a store for the given merchant. */
  def insert(request: TargetMerchantId): Request[PosStore] = js.native
  
  def inventory(request: QuotaUserTargetMerchantId, body: PosInventoryRequest): Request[PosInventoryResponse] = js.native
  /** Submit inventory for the given merchant. */
  def inventory(request: ResourceTargetMerchantId): Request[PosInventoryResponse] = js.native
  
  /** Lists the stores of the target merchant. */
  def list(): Request[PosListResponse] = js.native
  def list(request: QuotaUserTargetMerchantId): Request[PosListResponse] = js.native
  
  def sale(request: QuotaUserTargetMerchantId, body: PosSaleRequest): Request[PosSaleResponse] = js.native
  /** Submit a sale event for the given merchant. */
  def sale(request: TargetMerchantIdUploadType): Request[PosSaleResponse] = js.native
}
