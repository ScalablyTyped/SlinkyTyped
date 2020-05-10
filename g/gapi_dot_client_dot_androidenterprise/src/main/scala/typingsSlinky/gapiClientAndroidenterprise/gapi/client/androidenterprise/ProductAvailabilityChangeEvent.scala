package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductAvailabilityChangeEvent extends js.Object {
  /** The new state of the product. This field will always be present. */
  var availabilityStatus: js.UndefOr[String] = js.native
  /** The id of the product (e.g. "app:com.google.android.gm") for which the product availability changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.native
}

object ProductAvailabilityChangeEvent {
  @scala.inline
  def apply(): ProductAvailabilityChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAvailabilityChangeEvent]
  }
  @scala.inline
  implicit class ProductAvailabilityChangeEventOps[Self <: ProductAvailabilityChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
  }
  
}

