package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSchemeForPolyline
  extends Object
     with ColorScheme {
  
  /**
    * The continuous color ramp that will be applied to the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var colors: js.Array[Color_] = js.native
  
  /**
    * Predefined classed color schemes to use for the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var colorsForClassBreaks: js.Array[ColorSchemeForPolylineColorsForClassBreaks] = js.native
  
  /**
    * The unique id of the color scheme to usee in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var id: String = js.native
  
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var name: String = js.native
  
  /**
    * The color of the symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var noDataColor: Color_ = js.native
  
  /**
    * The opacity of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var opacity: Double = js.native
  
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var tags: js.Array[String] = js.native
  
  /**
    * Indicates which values will be emphasized in the continuous ramp and the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var theme: String = js.native
  
  /**
    * The default width of the symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var width: Double = js.native
}
object ColorSchemeForPolyline {
  
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPolylineColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String],
    theme: String,
    width: Double
  ): ColorSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSchemeForPolyline]
  }
  
  @scala.inline
  implicit class ColorSchemeForPolylineOps[Self <: ColorSchemeForPolyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColorsVarargs(value: Color_ *): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsForClassBreaksVarargs(value: ColorSchemeForPolylineColorsForClassBreaks*): Self = this.set("colorsForClassBreaks", js.Array(value :_*))
    
    @scala.inline
    def setColorsForClassBreaks(value: js.Array[ColorSchemeForPolylineColorsForClassBreaks]): Self = this.set("colorsForClassBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataColor(value: Color_): Self = this.set("noDataColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
