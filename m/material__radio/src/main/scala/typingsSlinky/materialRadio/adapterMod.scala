package typingsSlinky.materialRadio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCRadioAdapter extends StObject {
    
    def addClass(className: String): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def setNativeControlDisabled(disabled: Boolean): Unit = js.native
  }
  object MDCRadioAdapter {
    
    @scala.inline
    def apply(addClass: String => Unit, removeClass: String => Unit, setNativeControlDisabled: Boolean => Unit): MDCRadioAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
      __obj.asInstanceOf[MDCRadioAdapter]
    }
    
    @scala.inline
    implicit class MDCRadioAdapterMutableBuilder[Self <: MDCRadioAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNativeControlDisabled(value: Boolean => Unit): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1(value))
    }
  }
}
