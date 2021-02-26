package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcGaugeExportImageOptions extends StObject {
  
  var height: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object ArcGaugeExportImageOptions {
  
  @scala.inline
  def apply(): ArcGaugeExportImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeExportImageOptions]
  }
  
  @scala.inline
  implicit class ArcGaugeExportImageOptionsMutableBuilder[Self <: ArcGaugeExportImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
