package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link LatLngLiteral}. */
@js.native
trait ReadonlyLatLngLiteral extends js.Object {
  /** @see {@link LatLngLiteral#lat} */
  val lat: Double = js.native
  /** @see {@link LatLngLiteral#lng} */
  val lng: Double = js.native
}

object ReadonlyLatLngLiteral {
  @scala.inline
  def apply(lat: Double, lng: Double): ReadonlyLatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyLatLngLiteral]
  }
  @scala.inline
  implicit class ReadonlyLatLngLiteralOps[Self <: ReadonlyLatLngLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLng(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

