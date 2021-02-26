package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVbpZoneLinesOptions extends StObject {
  
  /**
    * (Highstock) Enable/disable zone lines.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Specify the style of zone lines.
    */
  var styles: js.UndefOr[CSSObject] = js.native
}
object PlotVbpZoneLinesOptions {
  
  @scala.inline
  def apply(): PlotVbpZoneLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpZoneLinesOptions]
  }
  
  @scala.inline
  implicit class PlotVbpZoneLinesOptionsMutableBuilder[Self <: PlotVbpZoneLinesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setStyles(value: CSSObject): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
