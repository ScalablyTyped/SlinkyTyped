package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMatrixResponse extends js.Object {
  /**
    * contains an array of addresses as returned by the API from your original request.
    * As with origin_addresses, these are localized if appropriate.
    */
  var destination_addresses: js.Array[String] = js.native
  /**
    * When the top-level status code is other than `OK`, this field contains more detailed information
    * about the reasons behind the given status code.
    */
  var error_message: String = js.native
  /**
    * contains an array of addresses as returned by the API from your original request.
    * These are formatted by the geocoder and localized according to the language parameter passed with the request.
    */
  var origin_addresses: js.Array[String] = js.native
  /** contains an array of elements, which in turn each contain a status, duration, and distance element. */
  var rows: js.Array[DistanceMatrixRow] = js.native
  /** contains metadata on the request. See Status Codes below. */
  var status: DistanceMatrixResponseTopLevelStatus = js.native
}

object DistanceMatrixResponse {
  @scala.inline
  def apply(
    destination_addresses: js.Array[String],
    error_message: String,
    origin_addresses: js.Array[String],
    rows: js.Array[DistanceMatrixRow],
    status: DistanceMatrixResponseTopLevelStatus
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destination_addresses = destination_addresses.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], origin_addresses = origin_addresses.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
  @scala.inline
  implicit class DistanceMatrixResponseOps[Self <: DistanceMatrixResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination_addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin_addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin_addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[DistanceMatrixRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DistanceMatrixResponseTopLevelStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

