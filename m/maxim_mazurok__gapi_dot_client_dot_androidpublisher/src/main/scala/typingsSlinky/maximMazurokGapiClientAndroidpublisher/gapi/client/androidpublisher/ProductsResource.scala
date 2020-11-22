package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.ProductId
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends js.Object {
  
  /** Acknowledges a purchase of an inapp item. */
  def acknowledge(request: ProductId): Request[Unit] = js.native
  def acknowledge(request: Token, body: ProductPurchasesAcknowledgeRequest): Request[Unit] = js.native
  
  /** Checks the purchase and consumption status of an inapp item. */
  def get(): Request[ProductPurchase] = js.native
  def get(request: Token): Request[ProductPurchase] = js.native
}
