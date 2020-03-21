package typingsSlinky.amapJsApiMap3d

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.meter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: js.Array[LngLat | (js.Tuple2[Double, Double])]
  var unit: js.UndefOr[meter] = js.undefined
}

object AnonPath {
  @scala.inline
  def apply(path: js.Array[LngLat | (js.Tuple2[Double, Double])], unit: meter = null): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPath]
  }
}

