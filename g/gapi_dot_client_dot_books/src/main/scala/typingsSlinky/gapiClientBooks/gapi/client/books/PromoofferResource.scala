package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.AndroidId
import typingsSlinky.gapiClientBooks.anon.Device
import typingsSlinky.gapiClientBooks.anon.Manufacturer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoofferResource extends js.Object {
  def accept(request: AndroidId): Request[Unit] = js.native
  def dismiss(request: Device): Request[Unit] = js.native
  /** Returns a list of promo offers available to the user */
  def get(request: Manufacturer): Request[Offers] = js.native
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
  @scala.inline
  implicit class PromoofferResourceOps[Self <: PromoofferResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: AndroidId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDismiss(value: Device => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Manufacturer => Request[Offers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

