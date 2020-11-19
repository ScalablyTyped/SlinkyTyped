package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.image
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColor extends js.Object {
  
  var borderColor: String = js.native
  
  var categories: js.Array[String] = js.native
  
  var categoryVisibility: hidden | visible = js.native
  
  var color: String = js.native
  
  var id: String = js.native
  
  var lineStyle: dotted | dashed | solid = js.native
  
  var lineWidth: Double = js.native
  
  var markerColor: String = js.native
  
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.native
  
  var pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none = js.native
  
  var shortDesc: String = js.native
  
  var source: String = js.native
  
  var symbolType: line | lineWithMarker | image | marker = js.native
  
  var text: String = js.native
}
object BorderColor {
  
  @scala.inline
  def apply(
    borderColor: String,
    categories: js.Array[String],
    categoryVisibility: hidden | visible,
    color: String,
    id: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    markerColor: String,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none,
    shortDesc: String,
    source: String,
    symbolType: line | lineWithMarker | image | marker,
    text: String
  ): BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], categoryVisibility = categoryVisibility.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColor]
  }
  
  @scala.inline
  implicit class BorderColorOps[Self <: BorderColor] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryVisibility(value: hidden | visible): Self = this.set("categoryVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerColor(value: String): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(
      value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
    ): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolType(value: line | lineWithMarker | image | marker): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerShape(
      value: circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | String
    ): Self = this.set("markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerShape: Self = this.set("markerShape", js.undefined)
  }
}
