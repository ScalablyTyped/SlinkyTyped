package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAndroidId
import typingsSlinky.gapiClientBooks.AnonDevice
import typingsSlinky.gapiClientBooks.AnonManufacturer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoofferResource extends js.Object {
  def accept(request: AnonAndroidId): Request_[Unit] = js.native
  def dismiss(request: AnonDevice): Request_[Unit] = js.native
  /** Returns a list of promo offers available to the user */
  def get(request: AnonManufacturer): Request_[Offers] = js.native
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
  @scala.inline
  implicit class PromoofferResourceOps[Self <: PromoofferResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: AnonAndroidId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDismiss(value: AnonDevice => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonManufacturer => Request_[Offers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

