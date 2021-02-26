package typingsSlinky.materialFloatingLabel

import typingsSlinky.materialBase.typesMod.EventType
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LABELFLOATABOVE extends StObject {
    
    var LABEL_FLOAT_ABOVE: String = js.native
    
    var LABEL_REQUIRED: String = js.native
    
    var LABEL_SHAKE: String = js.native
    
    var ROOT: String = js.native
  }
  object LABELFLOATABOVE {
    
    @scala.inline
    def apply(LABEL_FLOAT_ABOVE: String, LABEL_REQUIRED: String, LABEL_SHAKE: String, ROOT: String): LABELFLOATABOVE = {
      val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE.asInstanceOf[js.Any], LABEL_REQUIRED = LABEL_REQUIRED.asInstanceOf[js.Any], LABEL_SHAKE = LABEL_SHAKE.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[LABELFLOATABOVE]
    }
    
    @scala.inline
    implicit class LABELFLOATABOVEMutableBuilder[Self <: LABELFLOATABOVE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLABEL_FLOAT_ABOVE(value: String): Self = StObject.set(x, "LABEL_FLOAT_ABOVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLABEL_REQUIRED(value: String): Self = StObject.set(x, "LABEL_REQUIRED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLABEL_SHAKE(value: String): Self = StObject.set(x, "LABEL_SHAKE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/floating-label.@material/floating-label/adapter.MDCFloatingLabelAdapter> */
  @js.native
  trait PartialMDCFloatingLabelAd extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var deregisterInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var registerInteractionHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  }
  object PartialMDCFloatingLabelAd {
    
    @scala.inline
    def apply(): PartialMDCFloatingLabelAd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCFloatingLabelAd]
    }
    
    @scala.inline
    implicit class PartialMDCFloatingLabelAdMutableBuilder[Self <: PartialMDCFloatingLabelAd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setDeregisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInteractionHandler", js.undefined)
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      @scala.inline
      def setRegisterInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterInteractionHandlerUndefined: Self = StObject.set(x, "registerInteractionHandler", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
    }
  }
}
