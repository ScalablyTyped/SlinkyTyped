package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ellipse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRadius extends StObject {
  
  var borderColor: String = js.native
  
  var borderRadius: String = js.native
  
  var borderWidth: Double = js.native
  
  var color: String = js.native
  
  var height: Double = js.native
  
  var pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none = js.native
  
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.native
  
  var source: String = js.native
  
  var sourceHover: String = js.native
  
  var sourceHoverSelected: String = js.native
  
  var sourceSelected: String = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var width: Double = js.native
}
object BorderRadius {
  
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: String,
    borderWidth: Double,
    color: String,
    height: Double,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none,
    source: String,
    sourceHover: String,
    sourceHoverSelected: String,
    sourceSelected: String,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): BorderRadius = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceHover = sourceHover.asInstanceOf[js.Any], sourceHoverSelected = sourceHoverSelected.asInstanceOf[js.Any], sourceSelected = sourceSelected.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadius]
  }
  
  @scala.inline
  implicit class BorderRadiusMutableBuilder[Self <: BorderRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(
      value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
    ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(
      value: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHover(value: String): Self = StObject.set(x, "sourceHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceHoverSelected(value: String): Self = StObject.set(x, "sourceHoverSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSelected(value: String): Self = StObject.set(x, "sourceSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
