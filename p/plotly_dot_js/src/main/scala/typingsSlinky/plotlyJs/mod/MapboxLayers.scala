package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.Outlinecolor
import typingsSlinky.plotlyJs.anon.PartialMapboxSymbolIcon
import typingsSlinky.plotlyJs.anon.PartialShapeLine
import typingsSlinky.plotlyJs.anon.Radius
import typingsSlinky.plotlyJs.plotlyJsBooleans.`true`
import typingsSlinky.plotlyJs.plotlyJsStrings.circle
import typingsSlinky.plotlyJs.plotlyJsStrings.fill
import typingsSlinky.plotlyJs.plotlyJsStrings.geojson
import typingsSlinky.plotlyJs.plotlyJsStrings.image
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.raster
import typingsSlinky.plotlyJs.plotlyJsStrings.symbol
import typingsSlinky.plotlyJs.plotlyJsStrings.vecotr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxLayers extends StObject {
  
  var below: String = js.native
  
  var circle: Radius = js.native
  
  var color: Color = js.native
  
  var coordinates: Double | String = js.native
  
  var fill: Outlinecolor = js.native
  
  var line: PartialShapeLine = js.native
  
  var maxzoom: Double = js.native
  
  var minzoom: Double = js.native
  
  var name: String = js.native
  
  var opacity: Double = js.native
  
  var source: Double | String = js.native
  
  var sourceattribution: String = js.native
  
  var sourcelayer: String = js.native
  
  var sourcetype: geojson | vecotr | raster | image = js.native
  
  var symbol: PartialMapboxSymbolIcon = js.native
  
  var templateitemname: String = js.native
  
  var `type`: circle | line | fill | symbol | raster = js.native
  
  var visible: `true` = js.native
}
object MapboxLayers {
  
  @scala.inline
  def apply(
    below: String,
    circle: Radius,
    color: Color,
    coordinates: Double | String,
    fill: Outlinecolor,
    line: PartialShapeLine,
    maxzoom: Double,
    minzoom: Double,
    name: String,
    opacity: Double,
    source: Double | String,
    sourceattribution: String,
    sourcelayer: String,
    sourcetype: geojson | vecotr | raster | image,
    symbol: PartialMapboxSymbolIcon,
    templateitemname: String,
    `type`: circle | line | fill | symbol | raster,
    visible: `true`
  ): MapboxLayers = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceattribution = sourceattribution.asInstanceOf[js.Any], sourcelayer = sourcelayer.asInstanceOf[js.Any], sourcetype = sourcetype.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxLayers]
  }
  
  @scala.inline
  implicit class MapboxLayersMutableBuilder[Self <: MapboxLayers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBelow(value: String): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircle(value: Radius): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: Double | String): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: Outlinecolor): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: PartialShapeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Double | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceattribution(value: String): Self = StObject.set(x, "sourceattribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcelayer(value: String): Self = StObject.set(x, "sourcelayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcetype(value: geojson | vecotr | raster | image): Self = StObject.set(x, "sourcetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: PartialMapboxSymbolIcon): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: circle | line | fill | symbol | raster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: `true`): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
