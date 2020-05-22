package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.AndroidId
import typingsSlinky.gapiClientBooks.anon.Device
import typingsSlinky.gapiClientBooks.anon.Manufacturer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoofferResource extends js.Object {
  def accept(request: AndroidId): Request[Unit]
  def dismiss(request: Device): Request[Unit]
  /** Returns a list of promo offers available to the user */
  def get(request: Manufacturer): Request[Offers]
}

object PromoofferResource {
  @scala.inline
  def apply(
    accept: AndroidId => Request[Unit],
    dismiss: Device => Request[Unit],
    get: Manufacturer => Request[Offers]
  ): PromoofferResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PromoofferResource]
  }
}

