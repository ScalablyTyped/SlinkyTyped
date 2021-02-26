package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityExportingOptions extends StObject {
  
  var chartMenuLabel: js.UndefOr[String] = js.native
  
  var exportRegionLabel: js.UndefOr[String] = js.native
  
  var menuButtonLabel: js.UndefOr[String] = js.native
}
object LangAccessibilityExportingOptions {
  
  @scala.inline
  def apply(): LangAccessibilityExportingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityExportingOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityExportingOptionsMutableBuilder[Self <: LangAccessibilityExportingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartMenuLabel(value: String): Self = StObject.set(x, "chartMenuLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartMenuLabelUndefined: Self = StObject.set(x, "chartMenuLabel", js.undefined)
    
    @scala.inline
    def setExportRegionLabel(value: String): Self = StObject.set(x, "exportRegionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportRegionLabelUndefined: Self = StObject.set(x, "exportRegionLabel", js.undefined)
    
    @scala.inline
    def setMenuButtonLabel(value: String): Self = StObject.set(x, "menuButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuButtonLabelUndefined: Self = StObject.set(x, "menuButtonLabel", js.undefined)
  }
}
