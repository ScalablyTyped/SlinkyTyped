package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.grouped
import typingsSlinky.plotlyJs.plotlyJsStrings.h
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.normal
import typingsSlinky.plotlyJs.plotlyJsStrings.reversed
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.plotlyJs.plotlyJsStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Legend> */
@js.native
trait PartialLegend extends StObject {
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var bordercolor: js.UndefOr[String] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var orientation: js.UndefOr[v | h] = js.native
  
  var tracegroupgap: js.UndefOr[Double] = js.native
  
  var traceorder: js.UndefOr[grouped | normal | reversed] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
}
object PartialLegend {
  
  @scala.inline
  def apply(): PartialLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLegend]
  }
  
  @scala.inline
  implicit class PartialLegendMutableBuilder[Self <: PartialLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setTracegroupgap(value: Double): Self = StObject.set(x, "tracegroupgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracegroupgapUndefined: Self = StObject.set(x, "tracegroupgap", js.undefined)
    
    @scala.inline
    def setTraceorder(value: grouped | normal | reversed): Self = StObject.set(x, "traceorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceorderUndefined: Self = StObject.set(x, "traceorder", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
  }
}
