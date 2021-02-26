package typingsSlinky.oracleOraclejet.ojlegendMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ellipse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.image
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.line
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lineWithMarker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.marker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLegendItemSettableProperties extends JetSettableProperties {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var categoryVisibility: js.UndefOr[hidden | visible] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var drilling: js.UndefOr[on | off | inherit] = js.native
  
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var markerColor: js.UndefOr[String] = js.native
  
  var markerShape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = js.native
  
  var markerSvgClassName: js.UndefOr[String] = js.native
  
  var markerSvgStyle: js.UndefOr[js.Object] = js.native
  
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.native
  
  var shortDesc: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
  
  var symbolType: js.UndefOr[line | lineWithMarker | image | marker] = js.native
  
  var text: String = js.native
}
object ojLegendItemSettableProperties {
  
  @scala.inline
  def apply(
    markerShape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String,
    text: String
  ): ojLegendItemSettableProperties = {
    val __obj = js.Dynamic.literal(markerShape = markerShape.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendItemSettableProperties]
  }
  
  @scala.inline
  implicit class ojLegendItemSettablePropertiesMutableBuilder[Self <: ojLegendItemSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setCategoryVisibility(value: hidden | visible): Self = StObject.set(x, "categoryVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryVisibilityUndefined: Self = StObject.set(x, "categoryVisibility", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDrilling(value: on | off | inherit): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillingUndefined: Self = StObject.set(x, "drilling", js.undefined)
    
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    @scala.inline
    def setMarkerShape(
      value: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
    ): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSvgClassName(value: String): Self = StObject.set(x, "markerSvgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSvgClassNameUndefined: Self = StObject.set(x, "markerSvgClassName", js.undefined)
    
    @scala.inline
    def setMarkerSvgStyle(value: js.Object): Self = StObject.set(x, "markerSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSvgStyleUndefined: Self = StObject.set(x, "markerSvgStyle", js.undefined)
    
    @scala.inline
    def setPattern(
      value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
    ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    @scala.inline
    def setSymbolType(value: line | lineWithMarker | image | marker): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
