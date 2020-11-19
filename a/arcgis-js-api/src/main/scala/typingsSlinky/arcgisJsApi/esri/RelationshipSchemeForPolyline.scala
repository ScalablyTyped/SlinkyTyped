package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipSchemeForPolyline
  extends Object
     with RelationshipScheme {
  
  /**
    * Defines the colors to use in each bin of the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks] = js.native
  
  /**
    * The ID uniquely identifying the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var id: String = js.native
  
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var name: String = js.native
  
  /**
    * The color of the line symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var noDataColor: Color_ = js.native
  
  /**
    * The opacity of the line symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var opacity: Double = js.native
  
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var tags: js.Array[String] = js.native
  
  /**
    * The width of the line symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var width: Double = js.native
}
object RelationshipSchemeForPolyline {
  
  @scala.inline
  def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String],
    width: Double
  ): RelationshipSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipSchemeForPolyline]
  }
  
  @scala.inline
  implicit class RelationshipSchemeForPolylineOps[Self <: RelationshipSchemeForPolyline] (val x: Self) extends AnyVal {
    
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
    def setColorsForClassBreaksVarargs(value: RelationshipSchemeForPolylineColorsForClassBreaks*): Self = this.set("colorsForClassBreaks", js.Array(value :_*))
    
    @scala.inline
    def setColorsForClassBreaks(value: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks]): Self = this.set("colorsForClassBreaks", value.asInstanceOf[js.Any])
    
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
