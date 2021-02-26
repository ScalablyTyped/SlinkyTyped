package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ScatterMarkerLine> */
@js.native
trait PartialScatterMarkerLine extends StObject {
  
  var autocolorscale: js.UndefOr[Boolean] = js.native
  
  var cauto: js.UndefOr[Boolean] = js.native
  
  var cmax: js.UndefOr[Double] = js.native
  
  var cmin: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var colorscale: js.UndefOr[ColorScale] = js.native
  
  var reversescale: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double | js.Array[Double]] = js.native
}
object PartialScatterMarkerLine {
  
  @scala.inline
  def apply(): PartialScatterMarkerLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScatterMarkerLine]
  }
  
  @scala.inline
  implicit class PartialScatterMarkerLineMutableBuilder[Self <: PartialScatterMarkerLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocolorscale(value: Boolean): Self = StObject.set(x, "autocolorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocolorscaleUndefined: Self = StObject.set(x, "autocolorscale", js.undefined)
    
    @scala.inline
    def setCauto(value: Boolean): Self = StObject.set(x, "cauto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCautoUndefined: Self = StObject.set(x, "cauto", js.undefined)
    
    @scala.inline
    def setCmax(value: Double): Self = StObject.set(x, "cmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmaxUndefined: Self = StObject.set(x, "cmax", js.undefined)
    
    @scala.inline
    def setCmin(value: Double): Self = StObject.set(x, "cmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCminUndefined: Self = StObject.set(x, "cmin", js.undefined)
    
    @scala.inline
    def setColor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorscaleUndefined: Self = StObject.set(x, "colorscale", js.undefined)
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value :_*))
    
    @scala.inline
    def setReversescale(value: Boolean): Self = StObject.set(x, "reversescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversescaleUndefined: Self = StObject.set(x, "reversescale", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value :_*))
  }
}
