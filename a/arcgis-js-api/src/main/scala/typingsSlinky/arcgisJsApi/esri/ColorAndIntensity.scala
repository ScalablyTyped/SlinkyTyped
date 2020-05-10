package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAndIntensity extends Object {
  /**
    * RGB color with values between 0 and 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var color: ArrayLike[Double] = js.native
  /**
    * Scalar intensity value by which the color should be scaled for compositing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var intensity: Double = js.native
}

object ColorAndIntensity {
  @scala.inline
  def apply(
    color: ArrayLike[Double],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    intensity: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ColorAndIntensity = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), intensity = intensity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ColorAndIntensity]
  }
  @scala.inline
  implicit class ColorAndIntensityOps[Self <: ColorAndIntensity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

