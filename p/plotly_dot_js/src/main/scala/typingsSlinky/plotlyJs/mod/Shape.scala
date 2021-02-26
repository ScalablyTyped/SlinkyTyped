package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialShapeLine
import typingsSlinky.plotlyJs.plotlyJsStrings.above
import typingsSlinky.plotlyJs.plotlyJsStrings.below
import typingsSlinky.plotlyJs.plotlyJsStrings.circle
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.paper
import typingsSlinky.plotlyJs.plotlyJsStrings.path
import typingsSlinky.plotlyJs.plotlyJsStrings.pixel
import typingsSlinky.plotlyJs.plotlyJsStrings.rect
import typingsSlinky.plotlyJs.plotlyJsStrings.scaled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape extends StObject {
  
  var fillcolor: String = js.native
  
  var layer: below | above = js.native
  
  var line: PartialShapeLine = js.native
  
  var name: String = js.native
  
  var opacity: Double = js.native
  
  var path: String = js.native
  
  var templateitemname: String = js.native
  
  var `type`: rect | circle | line | path = js.native
  
  var visible: Boolean = js.native
  
  var x0: Datum = js.native
  
  var x1: Datum = js.native
  
  var xanchor: Double | String = js.native
  
  var xref: paper | XAxisName = js.native
  
  var xsizemode: scaled | pixel = js.native
  
  var y0: Datum = js.native
  
  var y1: Datum = js.native
  
  var yanchor: Double | String = js.native
  
  var yref: paper | YAxisName = js.native
  
  var ysizemode: scaled | pixel = js.native
}
object Shape {
  
  @scala.inline
  def apply(
    fillcolor: String,
    layer: below | above,
    line: PartialShapeLine,
    name: String,
    opacity: Double,
    path: String,
    templateitemname: String,
    `type`: rect | circle | line | path,
    visible: Boolean,
    xanchor: Double | String,
    xref: paper | XAxisName,
    xsizemode: scaled | pixel,
    yanchor: Double | String,
    yref: paper | YAxisName,
    ysizemode: scaled | pixel
  ): Shape = {
    val __obj = js.Dynamic.literal(fillcolor = fillcolor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], xsizemode = xsizemode.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any], ysizemode = ysizemode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillcolor(value: String): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: below | above): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: PartialShapeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: rect | circle | line | path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0(value: Datum): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Date(value: js.Date): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Null: Self = StObject.set(x, "x0", null)
    
    @scala.inline
    def setX1(value: Datum): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Date(value: js.Date): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Null: Self = StObject.set(x, "x1", null)
    
    @scala.inline
    def setXanchor(value: Double | String): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsizemode(value: scaled | pixel): Self = StObject.set(x, "xsizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: Datum): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Date(value: js.Date): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Null: Self = StObject.set(x, "y0", null)
    
    @scala.inline
    def setY1(value: Datum): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Date(value: js.Date): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Null: Self = StObject.set(x, "y1", null)
    
    @scala.inline
    def setYanchor(value: Double | String): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYsizemode(value: scaled | pixel): Self = StObject.set(x, "ysizemode", value.asInstanceOf[js.Any])
  }
}
