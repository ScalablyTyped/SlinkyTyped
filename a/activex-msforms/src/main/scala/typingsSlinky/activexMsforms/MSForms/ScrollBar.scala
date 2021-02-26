package typingsSlinky.activexMsforms.MSForms

import typingsSlinky.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBar extends StObject {
  
  var BackColor: Double = js.native
  
  var Delay: Double = js.native
  
  var Enabled: Boolean = js.native
  
  var ForeColor: Double = js.native
  
  var LargeChange: Double = js.native
  
  @JSName("MSForms.ScrollBar_typekey")
  var MSFormsDotScrollBar_typekey: ScrollBar = js.native
  
  var Max: Double = js.native
  
  var Min: Double = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: fmMousePointer = js.native
  
  var Orientation: fmOrientation = js.native
  
  var ProportionalThumb: Boolean = js.native
  
  var SmallChange: Double = js.native
  
  var Value: Double = js.native
}
object ScrollBar {
  
  @scala.inline
  def apply(
    BackColor: Double,
    Delay: Double,
    Enabled: Boolean,
    ForeColor: Double,
    LargeChange: Double,
    MSFormsDotScrollBar_typekey: ScrollBar,
    Max: Double,
    Min: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Orientation: fmOrientation,
    ProportionalThumb: Boolean,
    SmallChange: Double,
    Value: Double
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], LargeChange = LargeChange.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ProportionalThumb = ProportionalThumb.asInstanceOf[js.Any], SmallChange = SmallChange.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ScrollBar_typekey")(MSFormsDotScrollBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBar]
  }
  
  @scala.inline
  implicit class ScrollBarMutableBuilder[Self <: ScrollBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeChange(value: Double): Self = StObject.set(x, "LargeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotScrollBar_typekey(value: ScrollBar): Self = StObject.set(x, "MSForms.ScrollBar_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: fmOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProportionalThumb(value: Boolean): Self = StObject.set(x, "ProportionalThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallChange(value: Double): Self = StObject.set(x, "SmallChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
