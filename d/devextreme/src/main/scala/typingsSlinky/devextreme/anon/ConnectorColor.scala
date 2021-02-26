package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorColor extends StObject {
  
  var connectorColor: js.UndefOr[String] = js.native
  
  var connectorWidth: js.UndefOr[Double] = js.native
  
  var customizeText: js.UndefOr[js.Function1[/* barValue */ ValueText, String]] = js.native
  
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  
  var indent: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ConnectorColor {
  
  @scala.inline
  def apply(): ConnectorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorColor]
  }
  
  @scala.inline
  implicit class ConnectorColorMutableBuilder[Self <: ConnectorColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorColor(value: String): Self = StObject.set(x, "connectorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorColorUndefined: Self = StObject.set(x, "connectorColor", js.undefined)
    
    @scala.inline
    def setConnectorWidth(value: Double): Self = StObject.set(x, "connectorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorWidthUndefined: Self = StObject.set(x, "connectorWidth", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* barValue */ ValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    @scala.inline
    def setFont(value: typingsSlinky.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | js.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
