package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineTooltip extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[SparklineTooltipBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[Double | js.Any] = js.native
  
  var shared: js.UndefOr[Boolean] = js.native
  
  var sharedTemplate: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object SparklineTooltip {
  
  @scala.inline
  def apply(): SparklineTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineTooltip]
  }
  
  @scala.inline
  implicit class SparklineTooltipMutableBuilder[Self <: SparklineTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: SparklineTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTemplate(value: String): Self = StObject.set(x, "sharedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTemplateUndefined: Self = StObject.set(x, "sharedTemplate", js.undefined)
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
