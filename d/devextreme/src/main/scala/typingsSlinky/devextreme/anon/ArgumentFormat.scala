package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.columns
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.inside
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.outside
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgumentFormat extends StObject {
  
  var argumentFormat: js.UndefOr[format] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[ColorDashStyle] = js.native
  
  var connector: js.UndefOr[ColorVisible] = js.native
  
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.native
  
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  
  var position: js.UndefOr[columns | inside | outside] = js.native
  
  var radialOffset: js.UndefOr[Double] = js.native
  
  var rotationAngle: js.UndefOr[Double] = js.native
  
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}
object ArgumentFormat {
  
  @scala.inline
  def apply(): ArgumentFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentFormat]
  }
  
  @scala.inline
  implicit class ArgumentFormatMutableBuilder[Self <: ArgumentFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentFormat(value: format): Self = StObject.set(x, "argumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentFormatFunction1(value: /* value */ Double | js.Date => String): Self = StObject.set(x, "argumentFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgumentFormatUndefined: Self = StObject.set(x, "argumentFormat", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setConnector(value: ColorVisible): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* pointInfo */ js.Any => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
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
    def setPosition(value: columns | inside | outside): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRadialOffset(value: Double): Self = StObject.set(x, "radialOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialOffsetUndefined: Self = StObject.set(x, "radialOffset", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
