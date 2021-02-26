package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colorRampsColorRamp extends Object {
  
  /**
    * An array of five colors intended for displaying a continuous color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var colors: js.Array[Color_] = js.native
  
  /**
    * Contains an array of ramps ranging in size from 1 color to 10 colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var colorsForClassBreaks: js.Array[ColorRampColorsForClassBreaks] = js.native
  
  /**
    * The unique name of the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var name: String = js.native
  
  /**
    * Tags associated with the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#ColorRamp)
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
  implicit class colorRampsColorRampMutableBuilder[Self <: colorRampsColorRamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsForClassBreaks(value: js.Array[ColorRampColorsForClassBreaks]): Self = StObject.set(x, "colorsForClassBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsForClassBreaksVarargs(value: ColorRampColorsForClassBreaks*): Self = StObject.set(x, "colorsForClassBreaks", js.Array(value :_*))
    
    @scala.inline
    def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
