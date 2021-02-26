package typingsSlinky.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipOptions extends StObject {
  
  var additional_inheritable_classes: js.UndefOr[js.Array[String]] = js.native
  
  var append_to: js.UndefOr[String] = js.native
  
  var disable_for_touch: js.UndefOr[Boolean] = js.native
  
  var hover_delay: js.UndefOr[Double] = js.native
  
  var show_on: js.UndefOr[String] = js.native
  
  var tip_template: js.UndefOr[js.Function2[/* selector */ String, /* content */ String, String]] = js.native
  
  var tooltip_class: js.UndefOr[String] = js.native
  
  var touch_close_text: js.UndefOr[String] = js.native
}
object TooltipOptions {
  
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsMutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_inheritable_classes(value: js.Array[String]): Self = StObject.set(x, "additional_inheritable_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_inheritable_classesUndefined: Self = StObject.set(x, "additional_inheritable_classes", js.undefined)
    
    @scala.inline
    def setAdditional_inheritable_classesVarargs(value: String*): Self = StObject.set(x, "additional_inheritable_classes", js.Array(value :_*))
    
    @scala.inline
    def setAppend_to(value: String): Self = StObject.set(x, "append_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppend_toUndefined: Self = StObject.set(x, "append_to", js.undefined)
    
    @scala.inline
    def setDisable_for_touch(value: Boolean): Self = StObject.set(x, "disable_for_touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_for_touchUndefined: Self = StObject.set(x, "disable_for_touch", js.undefined)
    
    @scala.inline
    def setHover_delay(value: Double): Self = StObject.set(x, "hover_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHover_delayUndefined: Self = StObject.set(x, "hover_delay", js.undefined)
    
    @scala.inline
    def setShow_on(value: String): Self = StObject.set(x, "show_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_onUndefined: Self = StObject.set(x, "show_on", js.undefined)
    
    @scala.inline
    def setTip_template(value: (/* selector */ String, /* content */ String) => String): Self = StObject.set(x, "tip_template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTip_templateUndefined: Self = StObject.set(x, "tip_template", js.undefined)
    
    @scala.inline
    def setTooltip_class(value: String): Self = StObject.set(x, "tooltip_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip_classUndefined: Self = StObject.set(x, "tooltip_class", js.undefined)
    
    @scala.inline
    def setTouch_close_text(value: String): Self = StObject.set(x, "touch_close_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch_close_textUndefined: Self = StObject.set(x, "touch_close_text", js.undefined)
  }
}
