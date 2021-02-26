package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.MarkerSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  outliercolor :plotly.js.plotly.js.Color,   symbol :plotly.js.plotly.js.MarkerSymbol,   opacity :number,   size :number,   color :plotly.js.plotly.js.Color,   line :std.Partial<{  color :plotly.js.plotly.js.Color,   width :number,   outliercolor :plotly.js.plotly.js.Color,   outlierwidth :number}>}> */
@js.native
trait PartialoutliercolorColors extends StObject {
  
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var line: js.UndefOr[PartialcolorColorwidthnum] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var outliercolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var symbol: js.UndefOr[MarkerSymbol] = js.native
}
object PartialoutliercolorColors {
  
  @scala.inline
  def apply(): PartialoutliercolorColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialoutliercolorColors]
  }
  
  @scala.inline
  implicit class PartialoutliercolorColorsMutableBuilder[Self <: PartialoutliercolorColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: PartialcolorColorwidthnum): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOutliercolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "outliercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutliercolorUndefined: Self = StObject.set(x, "outliercolor", js.undefined)
    
    @scala.inline
    def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outliercolor", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSymbol(value: MarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: (String | Double)*): Self = StObject.set(x, "symbol", js.Array(value :_*))
  }
}
