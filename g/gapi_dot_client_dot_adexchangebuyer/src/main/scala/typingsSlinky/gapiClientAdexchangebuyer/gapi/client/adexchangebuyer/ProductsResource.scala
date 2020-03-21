package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonProductId
import typingsSlinky.gapiClientAdexchangebuyer.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Gets the requested product by id. */
  def get(request: AnonProductId): Request_[Product]
  /** Gets the requested product. */
  def search(request: AnonUserIp): Request_[GetOffersResponse]
}

object ProductsResource {
  @scala.inline
  def apply(get: AnonProductId => Request_[Product], search: AnonUserIp => Request_[GetOffersResponse]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ProductsResource]
  }
}

