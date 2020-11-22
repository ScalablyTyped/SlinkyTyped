package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.Acknowledged
import typingsSlinky.maximMazurokGapiClientContent.anon.QuotaUserResource
import typingsSlinky.maximMazurokGapiClientContent.anon.QuotaUserReturnId
import typingsSlinky.maximMazurokGapiClientContent.anon.ResourceReturnId
import typingsSlinky.maximMazurokGapiClientContent.anon.ReturnId
import typingsSlinky.maximMazurokGapiClientContent.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsResource extends js.Object {
  
  def acknowledge(request: QuotaUserReturnId, body: OrderreturnsAcknowledgeRequest): Request[OrderreturnsAcknowledgeResponse] = js.native
  /** Acks an order return in your Merchant Center account. */
  def acknowledge(request: ReturnId): Request[OrderreturnsAcknowledgeResponse] = js.native
  
  /** Create return in your Merchant Center account. */
  def createorderreturn(request: QuotaUserResource): Request[OrderreturnsCreateOrderReturnResponse] = js.native
  def createorderreturn(request: UploadType, body: OrderreturnsCreateOrderReturnRequest): Request[OrderreturnsCreateOrderReturnResponse] = js.native
  
  /** Retrieves an order return from your Merchant Center account. */
  def get(): Request[MerchantOrderReturn] = js.native
  def get(request: QuotaUserReturnId): Request[MerchantOrderReturn] = js.native
  
  /** Lists order returns in your Merchant Center account. */
  def list(): Request[OrderreturnsListResponse] = js.native
  def list(request: Acknowledged): Request[OrderreturnsListResponse] = js.native
  
  def process(request: QuotaUserReturnId, body: OrderreturnsProcessRequest): Request[OrderreturnsProcessResponse] = js.native
  /** Processes return in your Merchant Center account. */
  def process(request: ResourceReturnId): Request[OrderreturnsProcessResponse] = js.native
}
