package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredominanceSchemeForPolygon
  extends Object
     with PredominanceScheme {
  
  /**
    * The fill colors of the polygon symbols used for each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var colors: js.Array[Color_] = js.native
  
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var name: String = js.native
  
  /**
    * The color of the fill symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var noDataColor: Color_ = js.native
  
  /**
    * The opacity of the symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var opacity: Double = js.native
  
  /**
    * Properties for defining the outline of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var outline: PredominanceSchemeForPolygonOutline = js.native
  
  /**
    * The scheme defining the size visual variable if included in a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var sizeScheme: SizeSchemeForPolygon = js.native
  
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var tags: js.Array[String] = js.native
}
object PredominanceSchemeForPolygon {
  
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: PredominanceSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    sizeScheme: SizeSchemeForPolygon,
    tags: js.Array[String]
  ): PredominanceSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sizeScheme = sizeScheme.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominanceSchemeForPolygon]
  }
  
  @scala.inline
  implicit class PredominanceSchemeForPolygonOps[Self <: PredominanceSchemeForPolygon] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataColor(value: Color_): Self = this.set("noDataColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: PredominanceSchemeForPolygonOutline): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeScheme(value: SizeSchemeForPolygon): Self = this.set("sizeScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
