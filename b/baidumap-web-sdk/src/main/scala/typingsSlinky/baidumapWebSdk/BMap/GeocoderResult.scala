package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderResult extends js.Object {
  var address: String = js.native
  var addressComponents: AddressComponent = js.native
  var business: String = js.native
  var point: Point = js.native
  var surroundingPoi: js.Array[LocalResultPoi] = js.native
}

object GeocoderResult {
  @scala.inline
  def apply(
    address: String,
    addressComponents: AddressComponent,
    business: String,
    point: Point,
    surroundingPoi: js.Array[LocalResultPoi]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressComponents = addressComponents.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], surroundingPoi = surroundingPoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
  @scala.inline
  implicit class GeocoderResultOps[Self <: GeocoderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressComponents(value: AddressComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusiness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurroundingPoi(value: js.Array[LocalResultPoi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surroundingPoi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

