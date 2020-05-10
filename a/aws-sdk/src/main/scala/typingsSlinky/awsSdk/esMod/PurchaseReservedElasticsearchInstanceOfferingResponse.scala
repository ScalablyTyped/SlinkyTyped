package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
  /**
    * The customer-specified identifier used to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.native
  /**
    * Details of the reserved Elasticsearch instance which was purchased.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.native
}

object PurchaseReservedElasticsearchInstanceOfferingResponse {
  @scala.inline
  def apply(): PurchaseReservedElasticsearchInstanceOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
  }
  @scala.inline
  implicit class PurchaseReservedElasticsearchInstanceOfferingResponseOps[Self <: PurchaseReservedElasticsearchInstanceOfferingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservationName(value: ReservationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationName")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedElasticsearchInstanceId(value: GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedElasticsearchInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceId")(js.undefined)
        ret
    }
  }
  
}

