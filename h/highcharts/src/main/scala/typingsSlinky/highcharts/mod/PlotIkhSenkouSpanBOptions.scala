package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotIkhSenkouSpanBOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhSenkouSpanBStylesOptions] = js.native
}
object PlotIkhSenkouSpanBOptions {
  
  @scala.inline
  def apply(): PlotIkhSenkouSpanBOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhSenkouSpanBOptions]
  }
  
  @scala.inline
  implicit class PlotIkhSenkouSpanBOptionsMutableBuilder[Self <: PlotIkhSenkouSpanBOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotIkhSenkouSpanBStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
