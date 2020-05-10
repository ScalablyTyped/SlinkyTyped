package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelBlockAddDataPlaneData extends Object {
  /**
    * A two dimensional array representing the pixels to add.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var pixels: js.Array[js.Array[Double]] = js.native
  /**
    * An array of objects containing numeric statistical properties. See [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics) for details on the specifications of each object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var statistics: js.Array[_] = js.native
}

object PixelBlockAddDataPlaneData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    pixels: js.Array[js.Array[Double]],
    propertyIsEnumerable: PropertyKey => Boolean,
    statistics: js.Array[_]
  ): PixelBlockAddDataPlaneData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pixels = pixels.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelBlockAddDataPlaneData]
  }
  @scala.inline
  implicit class PixelBlockAddDataPlaneDataOps[Self <: PixelBlockAddDataPlaneData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPixels(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

