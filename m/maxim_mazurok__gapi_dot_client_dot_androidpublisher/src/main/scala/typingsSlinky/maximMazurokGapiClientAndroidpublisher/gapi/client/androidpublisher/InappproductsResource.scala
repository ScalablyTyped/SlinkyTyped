package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.AutoConvertMissingPrices
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Resource
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Sku
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InappproductsResource extends js.Object {
  
  /** Deletes an in-app product (i.e. a managed product or a subscriptions). */
  def delete(): Request[Unit] = js.native
  def delete(request: Sku): Request[Unit] = js.native
  
  /** Gets an in-app product, which can be a managed product or a subscription. */
  def get(): Request[InAppProduct] = js.native
  def get(request: Sku): Request[InAppProduct] = js.native
  
  /** Creates an in-app product (i.e. a managed product or a subscriptions). */
  def insert(request: AutoConvertMissingPrices): Request[InAppProduct] = js.native
  def insert(request: Uploadprotocol, body: InAppProduct): Request[InAppProduct] = js.native
  
  /** Lists all in-app products - both managed products and subscriptions. */
  def list(): Request[InappproductsListResponse] = js.native
  def list(request: MaxResults): Request[InappproductsListResponse] = js.native
  
  /** Patches an in-app product (i.e. a managed product or a subscriptions). */
  def patch(request: Resource): Request[InAppProduct] = js.native
  def patch(request: Xgafv, body: InAppProduct): Request[InAppProduct] = js.native
  
  /** Updates an in-app product (i.e. a managed product or a subscriptions). */
  def update(request: Resource): Request[InAppProduct] = js.native
  def update(request: Xgafv, body: InAppProduct): Request[InAppProduct] = js.native
}
