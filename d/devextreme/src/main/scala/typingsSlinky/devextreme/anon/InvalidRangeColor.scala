package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidRangeColor extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.native
  
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  
  var invalidRangeColor: js.UndefOr[String] = js.native
  
  var paddingLeftRight: js.UndefOr[Double] = js.native
  
  var paddingTopBottom: js.UndefOr[Double] = js.native
  
  var placeholderHeight: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object InvalidRangeColor {
  
  @scala.inline
  def apply(): InvalidRangeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidRangeColor]
  }
  
  @scala.inline
  implicit class InvalidRangeColorMutableBuilder[Self <: InvalidRangeColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* scaleValue */ ValueValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
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
    def setInvalidRangeColor(value: String): Self = StObject.set(x, "invalidRangeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidRangeColorUndefined: Self = StObject.set(x, "invalidRangeColor", js.undefined)
    
    @scala.inline
    def setPaddingLeftRight(value: Double): Self = StObject.set(x, "paddingLeftRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftRightUndefined: Self = StObject.set(x, "paddingLeftRight", js.undefined)
    
    @scala.inline
    def setPaddingTopBottom(value: Double): Self = StObject.set(x, "paddingTopBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopBottomUndefined: Self = StObject.set(x, "paddingTopBottom", js.undefined)
    
    @scala.inline
    def setPlaceholderHeight(value: Double): Self = StObject.set(x, "placeholderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderHeightUndefined: Self = StObject.set(x, "placeholderHeight", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
