package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAndroidId
import typingsSlinky.gapiClientBooks.AnonDevice
import typingsSlinky.gapiClientBooks.AnonManufacturer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoofferResource extends js.Object {
  def accept(request: AnonAndroidId): Request_[Unit]
  def dismiss(request: AnonDevice): Request_[Unit]
  /** Returns a list of promo offers available to the user */
  def get(request: AnonManufacturer): Request_[Offers]
}

object PromoofferResource {
  @scala.inline
  def apply(
    accept: AnonAndroidId => Request_[Unit],
    dismiss: AnonDevice => Request_[Unit],
    get: AnonManufacturer => Request_[Offers]
  ): PromoofferResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PromoofferResource]
  }
}

