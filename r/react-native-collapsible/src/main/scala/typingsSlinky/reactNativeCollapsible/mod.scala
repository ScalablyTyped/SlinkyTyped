package typingsSlinky.reactNativeCollapsible

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  class default ()
    extends Component[CollapsibleProps, js.Object, js.Any]
  
  type Collapsible = ReactComponentClass[CollapsibleProps]
  
  @js.native
  trait CollapsibleProps extends StObject {
    
    /**
      * Alignment of the content when transitioning, can be top, center or bottom
      *
      * @default top
      */
    var align: js.UndefOr[top | center | bottom] = js.native
    
    /**
      * Whether to show the child components or not
      *
      * @default true
      */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    /**
      * Which height should the component collapse to
      *
      * @default 0
      */
    var collapsedHeight: js.UndefOr[Double] = js.native
    
    /**
      * Duration of transition in milliseconds
      *
      * @default 300
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions
      *
      * @default easeOutCubic
      */
    var easing: js.UndefOr[EasingMode | js.Any] = js.native
    
    /**
      * Enable pointer events on collapsed view
      *
      * @default false
      */
    var enablePointerEvents: js.UndefOr[Boolean] = js.native
    
    /**
      * Function called when the animation finished
      */
    var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Optional styling for the container
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object CollapsibleProps {
    
    @scala.inline
    def apply(): CollapsibleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    @scala.inline
    implicit class CollapsiblePropsMutableBuilder[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: EasingMode | js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEnablePointerEvents(value: Boolean): Self = StObject.set(x, "enablePointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePointerEventsUndefined: Self = StObject.set(x, "enablePointerEvents", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: () => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.linear
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce
    - typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce
  */
  trait EasingMode extends StObject
  object EasingMode {
    
    @scala.inline
    def easeInBack: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack = "easeInBack".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack]
    
    @scala.inline
    def easeInBounce: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce = "easeInBounce".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce]
    
    @scala.inline
    def easeInCirc: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc = "easeInCirc".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc]
    
    @scala.inline
    def easeInCubic: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic = "easeInCubic".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic]
    
    @scala.inline
    def easeInElastic: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic = "easeInElastic".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic]
    
    @scala.inline
    def easeInExpo: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo = "easeInExpo".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo]
    
    @scala.inline
    def easeInOutBack: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack]
    
    @scala.inline
    def easeInOutBounce: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce]
    
    @scala.inline
    def easeInOutCirc: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc]
    
    @scala.inline
    def easeInOutCubic: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic]
    
    @scala.inline
    def easeInOutElastic: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic]
    
    @scala.inline
    def easeInOutExpo: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo]
    
    @scala.inline
    def easeInOutQuad: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad]
    
    @scala.inline
    def easeInOutQuart: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart]
    
    @scala.inline
    def easeInOutQuint: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint]
    
    @scala.inline
    def easeInOutSine: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine]
    
    @scala.inline
    def easeInQuad: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad = "easeInQuad".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad]
    
    @scala.inline
    def easeInQuart: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart = "easeInQuart".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart]
    
    @scala.inline
    def easeInQuint: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint = "easeInQuint".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint]
    
    @scala.inline
    def easeInSine: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine = "easeInSine".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine]
    
    @scala.inline
    def easeOutBack: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack = "easeOutBack".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack]
    
    @scala.inline
    def easeOutBounce: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce]
    
    @scala.inline
    def easeOutCirc: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc]
    
    @scala.inline
    def easeOutCubic: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic]
    
    @scala.inline
    def easeOutElastic: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic]
    
    @scala.inline
    def easeOutExpo: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo]
    
    @scala.inline
    def easeOutQuad: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad]
    
    @scala.inline
    def easeOutQuart: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart]
    
    @scala.inline
    def easeOutQuint: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint]
    
    @scala.inline
    def easeOutSine: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine = "easeOutSine".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine]
    
    @scala.inline
    def linear: typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.linear = "linear".asInstanceOf[typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.linear]
  }
}
