package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.PrettyPrintProductId
import typingsSlinky.maximMazurokGapiClientContent.anon.PrettyPrintQuotaUser
import typingsSlinky.maximMazurokGapiClientContent.anon.ProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalinventoryResource extends StObject {
  
  def custombatch(request: Key, body: LocalinventoryCustomBatchRequest): Request[LocalinventoryCustomBatchResponse] = js.native
  /** Updates local inventory for multiple products or stores in a single request. */
  def custombatch(request: PrettyPrintQuotaUser): Request[LocalinventoryCustomBatchResponse] = js.native
  
  def insert(request: PrettyPrintProductId, body: LocalInventory): Request[LocalInventory] = js.native
  /** Updates the local inventory of a product in your Merchant Center account. */
  def insert(request: ProductId): Request[LocalInventory] = js.native
}
