package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.ShapeLine
import typingsSlinky.plotlyJs.mod.XAxisName
import typingsSlinky.plotlyJs.mod.YAxisName
import typingsSlinky.plotlyJs.plotlyJsStrings.above
import typingsSlinky.plotlyJs.plotlyJsStrings.below
import typingsSlinky.plotlyJs.plotlyJsStrings.circle
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.paper
import typingsSlinky.plotlyJs.plotlyJsStrings.path
import typingsSlinky.plotlyJs.plotlyJsStrings.pixel
import typingsSlinky.plotlyJs.plotlyJsStrings.rect
import typingsSlinky.plotlyJs.plotlyJsStrings.scaled
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Shape> */
@js.native
trait PartialShapeFillcolor extends StObject {
  
  var fillcolor: js.UndefOr[String] = js.native
  
  var layer: js.UndefOr[below | above] = js.native
  
  var line: js.UndefOr[Partial[ShapeLine]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var templateitemname: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[rect | circle | line | path] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x0: js.UndefOr[Datum] = js.native
  
  var x1: js.UndefOr[Datum] = js.native
  
  var xanchor: js.UndefOr[Double | String] = js.native
  
  var xref: js.UndefOr[paper | XAxisName] = js.native
  
  var xsizemode: js.UndefOr[scaled | pixel] = js.native
  
  var y0: js.UndefOr[Datum] = js.native
  
  var y1: js.UndefOr[Datum] = js.native
  
  var yanchor: js.UndefOr[Double | String] = js.native
  
  var yref: js.UndefOr[paper | YAxisName] = js.native
  
  var ysizemode: js.UndefOr[scaled | pixel] = js.native
}
object PartialShapeFillcolor {
  
  @scala.inline
  def apply(): PartialShapeFillcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShapeFillcolor]
  }
  
  @scala.inline
  implicit class PartialShapeFillcolorMutableBuilder[Self <: PartialShapeFillcolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillcolor(value: String): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillcolorUndefined: Self = StObject.set(x, "fillcolor", js.undefined)
    
    @scala.inline
    def setLayer(value: below | above): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setLine(value: Partial[ShapeLine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemnameUndefined: Self = StObject.set(x, "templateitemname", js.undefined)
    
    @scala.inline
    def setType(value: rect | circle | line | path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX0(value: Datum): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Date(value: js.Date): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX0Null: Self = StObject.set(x, "x0", null)
    
    @scala.inline
    def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
    
    @scala.inline
    def setX1(value: Datum): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Date(value: js.Date): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Null: Self = StObject.set(x, "x1", null)
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setXanchor(value: Double | String): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrefUndefined: Self = StObject.set(x, "xref", js.undefined)
    
    @scala.inline
    def setXsizemode(value: scaled | pixel): Self = StObject.set(x, "xsizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsizemodeUndefined: Self = StObject.set(x, "xsizemode", js.undefined)
    
    @scala.inline
    def setY0(value: Datum): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Date(value: js.Date): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Null: Self = StObject.set(x, "y0", null)
    
    @scala.inline
    def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
    @scala.inline
    def setY1(value: Datum): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Date(value: js.Date): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Null: Self = StObject.set(x, "y1", null)
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setYanchor(value: Double | String): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYrefUndefined: Self = StObject.set(x, "yref", js.undefined)
    
    @scala.inline
    def setYsizemode(value: scaled | pixel): Self = StObject.set(x, "ysizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYsizemodeUndefined: Self = StObject.set(x, "ysizemode", js.undefined)
  }
}
