package typingsSlinky.materialAnimation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait CssVendorProperty extends StObject {
    
    var prefixed: PrefixedCssPropertyName = js.native
    
    var standard: StandardCssPropertyName = js.native
  }
  object CssVendorProperty {
    
    @scala.inline
    def apply(prefixed: PrefixedCssPropertyName, standard: StandardCssPropertyName): CssVendorProperty = {
      val __obj = js.Dynamic.literal(prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorProperty]
    }
    
    @scala.inline
    implicit class CssVendorPropertyMutableBuilder[Self <: CssVendorProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixed(value: PrefixedCssPropertyName): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: StandardCssPropertyName): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in @material/animation.@material/animation/types.StandardCssPropertyName ]: @material/animation.@material/animation/types.CssVendorProperty} */
  @js.native
  trait CssVendorPropertyMap extends StObject {
    
    var animation: CssVendorProperty = js.native
    
    var transform: CssVendorProperty = js.native
    
    var transition: CssVendorProperty = js.native
  }
  object CssVendorPropertyMap {
    
    @scala.inline
    def apply(animation: CssVendorProperty, transform: CssVendorProperty, transition: CssVendorProperty): CssVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorPropertyMap]
    }
    
    @scala.inline
    implicit class CssVendorPropertyMapMutableBuilder[Self <: CssVendorPropertyMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: CssVendorProperty): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: CssVendorProperty): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: CssVendorProperty): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsVendorProperty extends StObject {
    
    var cssProperty: StandardCssPropertyName = js.native
    
    var prefixed: PrefixedJsEventType = js.native
    
    var standard: StandardJsEventType = js.native
  }
  object JsVendorProperty {
    
    @scala.inline
    def apply(cssProperty: StandardCssPropertyName, prefixed: PrefixedJsEventType, standard: StandardJsEventType): JsVendorProperty = {
      val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorProperty]
    }
    
    @scala.inline
    implicit class JsVendorPropertyMutableBuilder[Self <: JsVendorProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssProperty(value: StandardCssPropertyName): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixed(value: PrefixedJsEventType): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: StandardJsEventType): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in @material/animation.@material/animation/types.StandardJsEventType ]: @material/animation.@material/animation/types.JsVendorProperty} */
  @js.native
  trait JsVendorPropertyMap extends StObject {
    
    var animationend: JsVendorProperty = js.native
    
    var animationiteration: JsVendorProperty = js.native
    
    var animationstart: JsVendorProperty = js.native
    
    var transitionend: JsVendorProperty = js.native
  }
  object JsVendorPropertyMap {
    
    @scala.inline
    def apply(
      animationend: JsVendorProperty,
      animationiteration: JsVendorProperty,
      animationstart: JsVendorProperty,
      transitionend: JsVendorProperty
    ): JsVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorPropertyMap]
    }
    
    @scala.inline
    implicit class JsVendorPropertyMapMutableBuilder[Self <: JsVendorPropertyMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationend(value: JsVendorProperty): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationiteration(value: JsVendorProperty): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationstart(value: JsVendorProperty): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionend(value: JsVendorProperty): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-animation`
    - typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-transform`
    - typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-transition`
  */
  trait PrefixedCssPropertyName extends StObject
  object PrefixedCssPropertyName {
    
    @scala.inline
    def `-webkit-animation`: typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-animation` = "-webkit-animation".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-animation`]
    
    @scala.inline
    def `-webkit-transform`: typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-transform` = "-webkit-transform".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-transform`]
    
    @scala.inline
    def `-webkit-transition`: typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-transition` = "-webkit-transition".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.`-webkit-transition`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationEnd
    - typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationIteration
    - typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationStart
    - typingsSlinky.materialAnimation.materialAnimationStrings.webkitTransitionEnd
  */
  trait PrefixedJsEventType extends StObject
  object PrefixedJsEventType {
    
    @scala.inline
    def webkitAnimationEnd: typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationEnd = "webkitAnimationEnd".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationEnd]
    
    @scala.inline
    def webkitAnimationIteration: typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationIteration = "webkitAnimationIteration".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationIteration]
    
    @scala.inline
    def webkitAnimationStart: typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationStart = "webkitAnimationStart".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.webkitAnimationStart]
    
    @scala.inline
    def webkitTransitionEnd: typingsSlinky.materialAnimation.materialAnimationStrings.webkitTransitionEnd = "webkitTransitionEnd".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.webkitTransitionEnd]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialAnimation.materialAnimationStrings.animation
    - typingsSlinky.materialAnimation.materialAnimationStrings.transform
    - typingsSlinky.materialAnimation.materialAnimationStrings.transition
  */
  trait StandardCssPropertyName extends StObject
  object StandardCssPropertyName {
    
    @scala.inline
    def animation: typingsSlinky.materialAnimation.materialAnimationStrings.animation = "animation".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.animation]
    
    @scala.inline
    def transform: typingsSlinky.materialAnimation.materialAnimationStrings.transform = "transform".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.transform]
    
    @scala.inline
    def transition: typingsSlinky.materialAnimation.materialAnimationStrings.transition = "transition".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.transition]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialAnimation.materialAnimationStrings.animationend
    - typingsSlinky.materialAnimation.materialAnimationStrings.animationiteration
    - typingsSlinky.materialAnimation.materialAnimationStrings.animationstart
    - typingsSlinky.materialAnimation.materialAnimationStrings.transitionend
  */
  trait StandardJsEventType extends StObject
  object StandardJsEventType {
    
    @scala.inline
    def animationend: typingsSlinky.materialAnimation.materialAnimationStrings.animationend = "animationend".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.animationend]
    
    @scala.inline
    def animationiteration: typingsSlinky.materialAnimation.materialAnimationStrings.animationiteration = "animationiteration".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.animationiteration]
    
    @scala.inline
    def animationstart: typingsSlinky.materialAnimation.materialAnimationStrings.animationstart = "animationstart".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.animationstart]
    
    @scala.inline
    def transitionend: typingsSlinky.materialAnimation.materialAnimationStrings.transitionend = "transitionend".asInstanceOf[typingsSlinky.materialAnimation.materialAnimationStrings.transitionend]
  }
}
