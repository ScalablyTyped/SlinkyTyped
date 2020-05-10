package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindPlaceFromPhoneNumberRequest extends js.Object {
  var fields: js.Array[String] = js.native
  var locationBias: js.UndefOr[LocationBias] = js.native
  var phoneNumber: String = js.native
}

object FindPlaceFromPhoneNumberRequest {
  @scala.inline
  def apply(fields: js.Array[String], phoneNumber: String): FindPlaceFromPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromPhoneNumberRequest]
  }
  @scala.inline
  implicit class FindPlaceFromPhoneNumberRequestOps[Self <: FindPlaceFromPhoneNumberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationBias(value: LocationBias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationBias")(js.undefined)
        ret
    }
  }
  
}

