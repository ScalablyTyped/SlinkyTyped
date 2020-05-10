package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMatrixResponse extends js.Object {
  var destinationAddresses: js.Array[String] = js.native
  var originAddresses: js.Array[String] = js.native
  var rows: js.Array[DistanceMatrixResponseRow] = js.native
}

object DistanceMatrixResponse {
  @scala.inline
  def apply(
    destinationAddresses: js.Array[String],
    originAddresses: js.Array[String],
    rows: js.Array[DistanceMatrixResponseRow]
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destinationAddresses = destinationAddresses.asInstanceOf[js.Any], originAddresses = originAddresses.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
  @scala.inline
  implicit class DistanceMatrixResponseOps[Self <: DistanceMatrixResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[DistanceMatrixResponseRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

