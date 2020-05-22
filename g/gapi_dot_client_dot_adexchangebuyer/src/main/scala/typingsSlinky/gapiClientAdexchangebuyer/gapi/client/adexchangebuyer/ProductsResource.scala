package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer.anon.ProductId
import typingsSlinky.gapiClientAdexchangebuyer.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Gets the requested product by id. */
  def get(request: ProductId): Request[Product]
  /** Gets the requested product. */
  def search(request: UserIp): Request[GetOffersResponse]
}

object ProductsResource {
  @scala.inline
  def apply(get: ProductId => Request[Product], search: UserIp => Request[GetOffersResponse]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ProductsResource]
  }
}

