package typingsSlinky.materialLineRipple

import typingsSlinky.materialBase.typesMod.EventType
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LINERIPPLEACTIVE extends StObject {
    
    var LINE_RIPPLE_ACTIVE: String = js.native
    
    var LINE_RIPPLE_DEACTIVATING: String = js.native
  }
  object LINERIPPLEACTIVE {
    
    @scala.inline
    def apply(LINE_RIPPLE_ACTIVE: String, LINE_RIPPLE_DEACTIVATING: String): LINERIPPLEACTIVE = {
      val __obj = js.Dynamic.literal(LINE_RIPPLE_ACTIVE = LINE_RIPPLE_ACTIVE.asInstanceOf[js.Any], LINE_RIPPLE_DEACTIVATING = LINE_RIPPLE_DEACTIVATING.asInstanceOf[js.Any])
      __obj.asInstanceOf[LINERIPPLEACTIVE]
    }
    
    @scala.inline
    implicit class LINERIPPLEACTIVEMutableBuilder[Self <: LINERIPPLEACTIVE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLINE_RIPPLE_ACTIVE(value: String): Self = StObject.set(x, "LINE_RIPPLE_ACTIVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLINE_RIPPLE_DEACTIVATING(value: String): Self = StObject.set(x, "LINE_RIPPLE_DEACTIVATING", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/line-ripple.@material/line-ripple/adapter.MDCLineRippleAdapter> */
  @js.native
  trait PartialMDCLineRippleAdapt extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var deregisterEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var registerEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setStyle: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCLineRippleAdapt {
    
    @scala.inline
    def apply(): PartialMDCLineRippleAdapt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCLineRippleAdapt]
    }
    
    @scala.inline
    implicit class PartialMDCLineRippleAdaptMutableBuilder[Self <: PartialMDCLineRippleAdapt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setDeregisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterEventHandlerUndefined: Self = StObject.set(x, "deregisterEventHandler", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setRegisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterEventHandlerUndefined: Self = StObject.set(x, "registerEventHandler", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetStyle(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
