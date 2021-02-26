package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterfallChartColumnStyle extends StObject {
  
  /** The color of the column. */
  var color: js.UndefOr[Color] = js.native
  
  /** The color of the column. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The label of the column's legend. */
  var label: js.UndefOr[String] = js.native
}
object WaterfallChartColumnStyle {
  
  @scala.inline
  def apply(): WaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartColumnStyle]
  }
  
  @scala.inline
  implicit class WaterfallChartColumnStyleMutableBuilder[Self <: WaterfallChartColumnStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStyle(value: ColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
