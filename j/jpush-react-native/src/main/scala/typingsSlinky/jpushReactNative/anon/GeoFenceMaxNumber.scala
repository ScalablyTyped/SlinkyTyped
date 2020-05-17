package typingsSlinky.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoFenceMaxNumber extends js.Object {
  var geoFenceMaxNumber: Double = js.native
}

object GeoFenceMaxNumber {
  @scala.inline
  def apply(geoFenceMaxNumber: Double): GeoFenceMaxNumber = {
    val __obj = js.Dynamic.literal(geoFenceMaxNumber = geoFenceMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoFenceMaxNumber]
  }
  @scala.inline
  implicit class GeoFenceMaxNumberOps[Self <: GeoFenceMaxNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoFenceMaxNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoFenceMaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

