package typingsSlinky.reactVisibilitySensor

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactVisibilitySensor.anon.IsVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-visibility-sensor", JSImport.Default)
  @js.native
  val default: ReactComponentClass[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement | (js.Function1[/* args */ IsVisible, ReactElement])] = js.native
    
    var containment: js.UndefOr[js.Any] = js.native
    
    var delayedCall: js.UndefOr[Boolean] = js.native
    
    var intervalCheck: js.UndefOr[Boolean] = js.native
    
    var intervalDelay: js.UndefOr[Double] = js.native
    
    var minTopValue: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Shape] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* isVisible */ Boolean, Unit]] = js.native
    
    var partialVisibility: js.UndefOr[Boolean] = js.native
    
    var resizeCheck: js.UndefOr[Boolean] = js.native
    
    var resizeDelay: js.UndefOr[Double] = js.native
    
    var resizeThrottle: js.UndefOr[Double] = js.native
    
    var scrollCheck: js.UndefOr[Boolean] = js.native
    
    var scrollDelay: js.UndefOr[Double] = js.native
    
    var scrollThrottle: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement | (js.Function1[/* args */ IsVisible, ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* args */ IsVisible => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContainment(value: js.Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      @scala.inline
      def setDelayedCall(value: Boolean): Self = StObject.set(x, "delayedCall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayedCallUndefined: Self = StObject.set(x, "delayedCall", js.undefined)
      
      @scala.inline
      def setIntervalCheck(value: Boolean): Self = StObject.set(x, "intervalCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalCheckUndefined: Self = StObject.set(x, "intervalCheck", js.undefined)
      
      @scala.inline
      def setIntervalDelay(value: Double): Self = StObject.set(x, "intervalDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalDelayUndefined: Self = StObject.set(x, "intervalDelay", js.undefined)
      
      @scala.inline
      def setMinTopValue(value: Double): Self = StObject.set(x, "minTopValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTopValueUndefined: Self = StObject.set(x, "minTopValue", js.undefined)
      
      @scala.inline
      def setOffset(value: Shape): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* isVisible */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPartialVisibility(value: Boolean): Self = StObject.set(x, "partialVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialVisibilityUndefined: Self = StObject.set(x, "partialVisibility", js.undefined)
      
      @scala.inline
      def setResizeCheck(value: Boolean): Self = StObject.set(x, "resizeCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeCheckUndefined: Self = StObject.set(x, "resizeCheck", js.undefined)
      
      @scala.inline
      def setResizeDelay(value: Double): Self = StObject.set(x, "resizeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeDelayUndefined: Self = StObject.set(x, "resizeDelay", js.undefined)
      
      @scala.inline
      def setResizeThrottle(value: Double): Self = StObject.set(x, "resizeThrottle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeThrottleUndefined: Self = StObject.set(x, "resizeThrottle", js.undefined)
      
      @scala.inline
      def setScrollCheck(value: Boolean): Self = StObject.set(x, "scrollCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollCheckUndefined: Self = StObject.set(x, "scrollCheck", js.undefined)
      
      @scala.inline
      def setScrollDelay(value: Double): Self = StObject.set(x, "scrollDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDelayUndefined: Self = StObject.set(x, "scrollDelay", js.undefined)
      
      @scala.inline
      def setScrollThrottle(value: Double): Self = StObject.set(x, "scrollThrottle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollThrottleUndefined: Self = StObject.set(x, "scrollThrottle", js.undefined)
    }
  }
  
  @js.native
  trait Shape extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object Shape {
    
    @scala.inline
    def apply(): Shape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shape]
    }
    
    @scala.inline
    implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[Props]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[Props] = default
}
