package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.CallbackDestinations
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrintQuotaUser
import typingsSlinky.maximMazurokGapiClientContent.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductstatusesResource extends js.Object {
  
  def custombatch(request: Key, body: ProductstatusesCustomBatchRequest): Request[ProductstatusesCustomBatchResponse] = js.native
  /** Gets the statuses of multiple products in a single request. */
  def custombatch(request: OauthtokenPrettyPrintQuotaUser): Request[ProductstatusesCustomBatchResponse] = js.native
  
  /** Gets the status of a product from your Merchant Center account. */
  def get(): Request[ProductStatus] = js.native
  def get(request: CallbackDestinations): Request[ProductStatus] = js.native
  
  /** Lists the statuses of the products in your Merchant Center account. */
  def list(): Request[ProductstatusesListResponse] = js.native
  def list(request: PageToken): Request[ProductstatusesListResponse] = js.native
}
