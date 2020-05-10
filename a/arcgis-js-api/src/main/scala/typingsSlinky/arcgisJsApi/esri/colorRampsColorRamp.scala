package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colorRampsColorRamp extends Object {
  /**
    * An array of five colors intended for displaying a continuous color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var colors: js.Array[Color_] = js.native
  /**
    * Contains an array of ramps ranging in size from 1 color to 10 colors. All ramps are part of the same color scheme, but provide a different number of colors depending on the requirements of the ramp needed for the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var colorsForClassBreaks: js.Array[ColorRampColorsForClassBreaks] = js.native
  /**
    * The unique name of the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var name: String = js.native
  /**
    * Tags associated with the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var tags: js.Array[String] = js.native
}

object colorRampsColorRamp {
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorRampColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): colorRampsColorRamp = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorRampsColorRamp]
  }
  @scala.inline
  implicit class colorRampsColorRampOps[Self <: colorRampsColorRamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[Color_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorsForClassBreaks(value: js.Array[ColorRampColorsForClassBreaks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorsForClassBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

