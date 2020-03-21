package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Checks the purchase and consumption status of an inapp item. */
  def get(request: AnonProductId): Request_[ProductPurchase]
}

object ProductsResource {
  @scala.inline
  def apply(get: AnonProductId => Request_[ProductPurchase]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ProductsResource]
  }
}

