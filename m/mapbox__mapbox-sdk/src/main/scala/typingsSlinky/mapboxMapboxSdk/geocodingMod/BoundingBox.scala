package typingsSlinky.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBox extends js.Object {
  var maxLatitude: Double = js.native
  var maxLongitude: Double = js.native
  var minLatitude: Double = js.native
  var minLongitude: Double = js.native
}

object BoundingBox {
  @scala.inline
  def apply(maxLatitude: Double, maxLongitude: Double, minLatitude: Double, minLongitude: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(maxLatitude = maxLatitude.asInstanceOf[js.Any], maxLongitude = maxLongitude.asInstanceOf[js.Any], minLatitude = minLatitude.asInstanceOf[js.Any], minLongitude = minLongitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
  @scala.inline
  implicit class BoundingBoxOps[Self <: BoundingBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLongitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLatitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLongitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

