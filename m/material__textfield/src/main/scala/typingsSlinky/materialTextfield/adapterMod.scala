package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.MutationObserver
import typingsSlinky.materialBase.typesMod.EventType
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import typingsSlinky.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  @js.native
  trait MDCTextFieldAdapter
    extends MDCTextFieldRootAdapter
       with MDCTextFieldInputAdapter
       with MDCTextFieldLabelAdapter
       with MDCTextFieldLineRippleAdapter
       with MDCTextFieldOutlineAdapter
  object MDCTextFieldAdapter {
    
    @scala.inline
    def apply(
      activateLineRipple: () => Unit,
      addClass: String => Unit,
      closeOutline: () => Unit,
      deactivateLineRipple: () => Unit,
      deregisterInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      deregisterTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      deregisterValidationAttributeChangeHandler: MutationObserver => Unit,
      floatLabel: Boolean => Unit,
      getLabelWidth: () => Double,
      getNativeInput: () => MDCTextFieldNativeInputElement | Null,
      hasClass: String => Boolean,
      hasLabel: () => Boolean,
      hasOutline: () => Boolean,
      isFocused: () => Boolean,
      notchOutline: Double => Unit,
      registerInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      registerTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      registerValidationAttributeChangeHandler: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver,
      removeClass: String => Unit,
      removeInputAttr: String => Unit,
      setInputAttr: (String, String) => Unit,
      setLabelRequired: Boolean => Unit,
      setLineRippleTransformOrigin: Double => Unit,
      shakeLabel: Boolean => Unit
    ): MDCTextFieldAdapter = {
      val __obj = js.Dynamic.literal(activateLineRipple = js.Any.fromFunction0(activateLineRipple), addClass = js.Any.fromFunction1(addClass), closeOutline = js.Any.fromFunction0(closeOutline), deactivateLineRipple = js.Any.fromFunction0(deactivateLineRipple), deregisterInputInteractionHandler = js.Any.fromFunction2(deregisterInputInteractionHandler), deregisterTextFieldInteractionHandler = js.Any.fromFunction2(deregisterTextFieldInteractionHandler), deregisterValidationAttributeChangeHandler = js.Any.fromFunction1(deregisterValidationAttributeChangeHandler), floatLabel = js.Any.fromFunction1(floatLabel), getLabelWidth = js.Any.fromFunction0(getLabelWidth), getNativeInput = js.Any.fromFunction0(getNativeInput), hasClass = js.Any.fromFunction1(hasClass), hasLabel = js.Any.fromFunction0(hasLabel), hasOutline = js.Any.fromFunction0(hasOutline), isFocused = js.Any.fromFunction0(isFocused), notchOutline = js.Any.fromFunction1(notchOutline), registerInputInteractionHandler = js.Any.fromFunction2(registerInputInteractionHandler), registerTextFieldInteractionHandler = js.Any.fromFunction2(registerTextFieldInteractionHandler), registerValidationAttributeChangeHandler = js.Any.fromFunction1(registerValidationAttributeChangeHandler), removeClass = js.Any.fromFunction1(removeClass), removeInputAttr = js.Any.fromFunction1(removeInputAttr), setInputAttr = js.Any.fromFunction2(setInputAttr), setLabelRequired = js.Any.fromFunction1(setLabelRequired), setLineRippleTransformOrigin = js.Any.fromFunction1(setLineRippleTransformOrigin), shakeLabel = js.Any.fromFunction1(shakeLabel))
      __obj.asInstanceOf[MDCTextFieldAdapter]
    }
  }
  
  @js.native
  trait MDCTextFieldInputAdapter extends StObject {
    
    /**
      * Deregisters an event listener on the native input element for a given event.
      */
    def deregisterInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * @return The native `<input>` element, or an object with the same shape.
      * Note that this method can return null, which the foundation will handle gracefully.
      */
    def getNativeInput(): MDCTextFieldNativeInputElement | Null = js.native
    
    /**
      * @return true if the textfield is focused. We achieve this via `document.activeElement === this.root`.
      */
    def isFocused(): Boolean = js.native
    
    /**
      * Registers an event listener on the native input element for a given event.
      */
    def registerInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Removes the specified attribute from the input element.
      */
    def removeInputAttr(attr: String): Unit = js.native
    
    /**
      * Sets the specified attribute to the specified value on the input element.
      */
    def setInputAttr(attr: String, value: String): Unit = js.native
  }
  object MDCTextFieldInputAdapter {
    
    @scala.inline
    def apply(
      deregisterInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      getNativeInput: () => MDCTextFieldNativeInputElement | Null,
      isFocused: () => Boolean,
      registerInputInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      removeInputAttr: String => Unit,
      setInputAttr: (String, String) => Unit
    ): MDCTextFieldInputAdapter = {
      val __obj = js.Dynamic.literal(deregisterInputInteractionHandler = js.Any.fromFunction2(deregisterInputInteractionHandler), getNativeInput = js.Any.fromFunction0(getNativeInput), isFocused = js.Any.fromFunction0(isFocused), registerInputInteractionHandler = js.Any.fromFunction2(registerInputInteractionHandler), removeInputAttr = js.Any.fromFunction1(removeInputAttr), setInputAttr = js.Any.fromFunction2(setInputAttr))
      __obj.asInstanceOf[MDCTextFieldInputAdapter]
    }
    
    @scala.inline
    implicit class MDCTextFieldInputAdapterMutableBuilder[Self <: MDCTextFieldInputAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeregisterInputInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterInputInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetNativeInput(value: () => MDCTextFieldNativeInputElement | Null): Self = StObject.set(x, "getNativeInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterInputInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerInputInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveInputAttr(value: String => Unit): Self = StObject.set(x, "removeInputAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetInputAttr(value: (String, String) => Unit): Self = StObject.set(x, "setInputAttr", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait MDCTextFieldLabelAdapter extends StObject {
    
    /**
      * Only implement if label exists.
      * Floats the label above the input element if shouldFloat is true.
      */
    def floatLabel(shouldFloat: Boolean): Unit = js.native
    
    /**
      * Only implement if label exists.
      * @return width of label in pixels.
      */
    def getLabelWidth(): Double = js.native
    
    /**
      * @return true if label element exists, false if it doesn't.
      */
    def hasLabel(): Boolean = js.native
    
    /**
      * Only implement if label exists.
      * Styles the label as required.
      */
    def setLabelRequired(isRequired: Boolean): Unit = js.native
    
    /**
      * Only implement if label exists.
      * Shakes label if shouldShake is true.
      */
    def shakeLabel(shouldShake: Boolean): Unit = js.native
  }
  object MDCTextFieldLabelAdapter {
    
    @scala.inline
    def apply(
      floatLabel: Boolean => Unit,
      getLabelWidth: () => Double,
      hasLabel: () => Boolean,
      setLabelRequired: Boolean => Unit,
      shakeLabel: Boolean => Unit
    ): MDCTextFieldLabelAdapter = {
      val __obj = js.Dynamic.literal(floatLabel = js.Any.fromFunction1(floatLabel), getLabelWidth = js.Any.fromFunction0(getLabelWidth), hasLabel = js.Any.fromFunction0(hasLabel), setLabelRequired = js.Any.fromFunction1(setLabelRequired), shakeLabel = js.Any.fromFunction1(shakeLabel))
      __obj.asInstanceOf[MDCTextFieldLabelAdapter]
    }
    
    @scala.inline
    implicit class MDCTextFieldLabelAdapterMutableBuilder[Self <: MDCTextFieldLabelAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloatLabel(value: Boolean => Unit): Self = StObject.set(x, "floatLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLabelWidth(value: () => Double): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasLabel(value: () => Boolean): Self = StObject.set(x, "hasLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetLabelRequired(value: Boolean => Unit): Self = StObject.set(x, "setLabelRequired", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShakeLabel(value: Boolean => Unit): Self = StObject.set(x, "shakeLabel", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MDCTextFieldLineRippleAdapter extends StObject {
    
    /**
      * Activates the line ripple.
      */
    def activateLineRipple(): Unit = js.native
    
    /**
      * Deactivates the line ripple.
      */
    def deactivateLineRipple(): Unit = js.native
    
    /**
      * Sets the transform origin of the line ripple.
      */
    def setLineRippleTransformOrigin(normalizedX: Double): Unit = js.native
  }
  object MDCTextFieldLineRippleAdapter {
    
    @scala.inline
    def apply(
      activateLineRipple: () => Unit,
      deactivateLineRipple: () => Unit,
      setLineRippleTransformOrigin: Double => Unit
    ): MDCTextFieldLineRippleAdapter = {
      val __obj = js.Dynamic.literal(activateLineRipple = js.Any.fromFunction0(activateLineRipple), deactivateLineRipple = js.Any.fromFunction0(deactivateLineRipple), setLineRippleTransformOrigin = js.Any.fromFunction1(setLineRippleTransformOrigin))
      __obj.asInstanceOf[MDCTextFieldLineRippleAdapter]
    }
    
    @scala.inline
    implicit class MDCTextFieldLineRippleAdapterMutableBuilder[Self <: MDCTextFieldLineRippleAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivateLineRipple(value: () => Unit): Self = StObject.set(x, "activateLineRipple", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeactivateLineRipple(value: () => Unit): Self = StObject.set(x, "deactivateLineRipple", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetLineRippleTransformOrigin(value: Double => Unit): Self = StObject.set(x, "setLineRippleTransformOrigin", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MDCTextFieldOutlineAdapter extends StObject {
    
    /**
      * Only implement if outline element exists.
      * Closes notch in outline element.
      */
    def closeOutline(): Unit = js.native
    
    /**
      * @return true if outline element exists, false if it doesn't.
      */
    def hasOutline(): Boolean = js.native
    
    /**
      * Only implement if outline element exists.
      */
    def notchOutline(labelWidth: Double): Unit = js.native
  }
  object MDCTextFieldOutlineAdapter {
    
    @scala.inline
    def apply(closeOutline: () => Unit, hasOutline: () => Boolean, notchOutline: Double => Unit): MDCTextFieldOutlineAdapter = {
      val __obj = js.Dynamic.literal(closeOutline = js.Any.fromFunction0(closeOutline), hasOutline = js.Any.fromFunction0(hasOutline), notchOutline = js.Any.fromFunction1(notchOutline))
      __obj.asInstanceOf[MDCTextFieldOutlineAdapter]
    }
    
    @scala.inline
    implicit class MDCTextFieldOutlineAdapterMutableBuilder[Self <: MDCTextFieldOutlineAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseOutline(value: () => Unit): Self = StObject.set(x, "closeOutline", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasOutline(value: () => Boolean): Self = StObject.set(x, "hasOutline", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotchOutline(value: Double => Unit): Self = StObject.set(x, "notchOutline", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MDCTextFieldRootAdapter extends StObject {
    
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit = js.native
    
    /**
      * Deregisters an event handler on the root element for a given event.
      */
    def deregisterTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Disconnects a validation attribute observer on the input element.
      */
    def deregisterValidationAttributeChangeHandler(observer: MutationObserver): Unit = js.native
    
    /**
      * @return true if the root element contains the given class name.
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * Registers an event handler on the root element for a given event.
      */
    def registerTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
    
    /**
      * Registers a validation attribute change listener on the input element.
      * Handler accepts list of attribute names.
      */
    def registerValidationAttributeChangeHandler(handler: js.Function1[/* attributeNames */ js.Array[String], Unit]): MutationObserver = js.native
    
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit = js.native
  }
  object MDCTextFieldRootAdapter {
    
    @scala.inline
    def apply(
      addClass: String => Unit,
      deregisterTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      deregisterValidationAttributeChangeHandler: MutationObserver => Unit,
      hasClass: String => Boolean,
      registerTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
      registerValidationAttributeChangeHandler: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver,
      removeClass: String => Unit
    ): MDCTextFieldRootAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterTextFieldInteractionHandler = js.Any.fromFunction2(deregisterTextFieldInteractionHandler), deregisterValidationAttributeChangeHandler = js.Any.fromFunction1(deregisterValidationAttributeChangeHandler), hasClass = js.Any.fromFunction1(hasClass), registerTextFieldInteractionHandler = js.Any.fromFunction2(registerTextFieldInteractionHandler), registerValidationAttributeChangeHandler = js.Any.fromFunction1(registerValidationAttributeChangeHandler), removeClass = js.Any.fromFunction1(removeClass))
      __obj.asInstanceOf[MDCTextFieldRootAdapter]
    }
    
    @scala.inline
    implicit class MDCTextFieldRootAdapterMutableBuilder[Self <: MDCTextFieldRootAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeregisterTextFieldInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "deregisterTextFieldInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeregisterValidationAttributeChangeHandler(value: MutationObserver => Unit): Self = StObject.set(x, "deregisterValidationAttributeChangeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterTextFieldInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = StObject.set(x, "registerTextFieldInteractionHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterValidationAttributeChangeHandler(value: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver): Self = StObject.set(x, "registerValidationAttributeChangeHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    }
  }
}
