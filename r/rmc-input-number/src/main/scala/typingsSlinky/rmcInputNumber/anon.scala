package typingsSlinky.rmcInputNumber

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FocusOnUpDown extends StObject {
    
    var focusOnUpDown: Boolean = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    def onBlur(): Unit = js.native
    
    def onChange(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def parser(input: String): String = js.native
    
    var prefixCls: String = js.native
    
    var step: Double = js.native
    
    var useTouch: Boolean = js.native
  }
  object FocusOnUpDown {
    
    @scala.inline
    def apply(
      focusOnUpDown: Boolean,
      max: Double,
      min: Double,
      onBlur: () => Unit,
      onChange: () => Unit,
      onFocus: () => Unit,
      parser: String => String,
      prefixCls: String,
      step: Double,
      useTouch: Boolean
    ): FocusOnUpDown = {
      val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), prefixCls = prefixCls.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusOnUpDown]
    }
    
    @scala.inline
    implicit class FocusOnUpDownMutableBuilder[Self <: FocusOnUpDown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParser(value: String => String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    def onBlur(): Unit = js.native
    
    def onChange(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def parser(input: String): String = js.native
    
    var step: Double = js.native
  }
  object Max {
    
    @scala.inline
    def apply(
      max: Double,
      min: Double,
      onBlur: () => Unit,
      onChange: () => Unit,
      onFocus: () => Unit,
      parser: String => String,
      step: Double
    ): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParser(value: String => String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegisteredStyleBrand extends StObject {
    
    var __registeredStyleBrand: ViewStyle | TextStyle | ImageStyle = js.native
  }
  object RegisteredStyleBrand {
    
    @scala.inline
    def apply(__registeredStyleBrand: ViewStyle | TextStyle | ImageStyle): RegisteredStyleBrand = {
      val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredStyleBrand]
    }
    
    @scala.inline
    implicit class RegisteredStyleBrandMutableBuilder[Self <: RegisteredStyleBrand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__registeredStyleBrand(value: ViewStyle | TextStyle | ImageStyle): Self = StObject.set(x, "__registeredStyleBrand", value.asInstanceOf[js.Any])
    }
  }
}
