package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGeoFenceMaxNumber extends js.Object {
  var geoFenceMaxNumber: Double = js.native
}

object AnonGeoFenceMaxNumber {
  @scala.inline
  def apply(geoFenceMaxNumber: Double): AnonGeoFenceMaxNumber = {
    val __obj = js.Dynamic.literal(geoFenceMaxNumber = geoFenceMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeoFenceMaxNumber]
  }
  @scala.inline
  implicit class AnonGeoFenceMaxNumberOps[Self <: AnonGeoFenceMaxNumber] (val x: Self) extends AnyVal {
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

