package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`cie-lab`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`lab-lch`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmicColorRampProperties extends ColorRampProperties {
  /**
    * The algorithm used to generate the colors between the `fromColor` and `toColor`. Each algorithm uses different methods for generating the intervening colors.
    *
    * Possible Value | Description
    * ---------------|------------
    * cie-lab | Blends the from and to colors without traversing the intervening hue space.
    * lab-lch | The hue, saturation, value (hsv) algorithm is a linear traverse of colors between pairs: Color 1 H to Color 2 H, Color 1 S to Color 2 S, and Color 1 V to Color 2 V.
    * hsv | The lab-lch algorithm is very similar to the cie-lab but does not seek the shortest path between colors.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#algorithm)
    */
  var algorithm: js.UndefOr[`cie-lab` | `lab-lch` | hsv] = js.native
  /**
    * The first color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#fromColor)
    */
  var fromColor: js.UndefOr[Color_] = js.native
  /**
    * The last color in the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AlgorithmicColorRamp.html#toColor)
    */
  var toColor: js.UndefOr[Color_] = js.native
}

object AlgorithmicColorRampProperties {
  @scala.inline
  def apply(): AlgorithmicColorRampProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmicColorRampProperties]
  }
  @scala.inline
  implicit class AlgorithmicColorRampPropertiesOps[Self <: AlgorithmicColorRampProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: `cie-lab` | `lab-lch` | hsv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withFromColor(value: Color_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromColor")(js.undefined)
        ret
    }
    @scala.inline
    def withToColor(value: Color_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toColor")(js.undefined)
        ret
    }
  }
  
}

