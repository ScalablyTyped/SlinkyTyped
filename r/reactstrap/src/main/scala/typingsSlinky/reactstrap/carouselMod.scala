package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.reactstrap.reactstrapBooleans.`false`
import typingsSlinky.reactstrap.reactstrapStrings.carousel
import typingsSlinky.reactstrap.reactstrapStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("reactstrap/lib/Carousel", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselProps, js.Object, js.Any]
  
  type Carousel = ReactComponentClass[CarouselProps]
  
  @js.native
  trait CarouselProps extends CommonCarouselProps {
    
    def next(): Unit = js.native
    
    def previous(): Unit = js.native
  }
  object CarouselProps {
    
    @scala.inline
    def apply(next: () => Unit, previous: () => Unit): CarouselProps = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CommonCarouselProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var activeIndex: js.UndefOr[Double] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var enableTouch: js.UndefOr[Boolean] = js.native
    
    var interval: js.UndefOr[Double | String | Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mouseEnter: js.UndefOr[js.Function0[Unit]] = js.native
    
    var mouseExit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var pause: js.UndefOr[hover | `false`] = js.native
    
    var ride: js.UndefOr[carousel] = js.native
    
    var slide: js.UndefOr[Boolean] = js.native
  }
  object CommonCarouselProps {
    
    @scala.inline
    def apply(): CommonCarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonCarouselProps]
    }
    
    @scala.inline
    implicit class CommonCarouselPropsMutableBuilder[Self <: CommonCarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setEnableTouch(value: Boolean): Self = StObject.set(x, "enableTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTouchUndefined: Self = StObject.set(x, "enableTouch", js.undefined)
      
      @scala.inline
      def setInterval(value: Double | String | Boolean): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMouseEnter(value: () => Unit): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMouseEnterUndefined: Self = StObject.set(x, "mouseEnter", js.undefined)
      
      @scala.inline
      def setMouseExit(value: () => Unit): Self = StObject.set(x, "mouseExit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMouseExitUndefined: Self = StObject.set(x, "mouseExit", js.undefined)
      
      @scala.inline
      def setPause(value: hover | `false`): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setRide(value: carousel): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRideUndefined: Self = StObject.set(x, "ride", js.undefined)
      
      @scala.inline
      def setSlide(value: Boolean): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    }
  }
  
  @js.native
  trait UncontrolledCarouselProps extends CommonCarouselProps {
    
    var autoPlay: js.UndefOr[Boolean] = js.native
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var indicators: js.UndefOr[Boolean] = js.native
    
    var items: js.Array[_] = js.native
    
    var next: js.UndefOr[js.Function0[Unit]] = js.native
    
    var previous: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object UncontrolledCarouselProps {
    
    @scala.inline
    def apply(items: js.Array[_]): UncontrolledCarouselProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledCarouselProps]
    }
    
    @scala.inline
    implicit class UncontrolledCarouselPropsMutableBuilder[Self <: UncontrolledCarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
}
