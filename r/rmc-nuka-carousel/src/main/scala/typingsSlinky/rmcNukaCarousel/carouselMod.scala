package typingsSlinky.rmcNukaCarousel

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcNukaCarousel.anon.BeginValue
import typingsSlinky.rmcNukaCarousel.anon.Bottom
import typingsSlinky.rmcNukaCarousel.anon.BottomPosition
import typingsSlinky.rmcNukaCarousel.anon.BoxSizing
import typingsSlinky.rmcNukaCarousel.anon.Left
import typingsSlinky.rmcNukaCarousel.anon.MsTransform
import typingsSlinky.rmcNukaCarousel.anon.OnMouseDown
import typingsSlinky.rmcNukaCarousel.anon.OnTouchCancel
import typingsSlinky.rmcNukaCarousel.anon.Position
import typingsSlinky.rmcNukaCarousel.anon.Right
import typingsSlinky.rmcNukaCarousel.anon.TextAlign
import typingsSlinky.rmcNukaCarousel.anon.Top
import typingsSlinky.rmcNukaCarousel.anon.Transform
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselNumbers.`-1`
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselNumbers.`0`
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselNumbers.`1`
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("rmc-nuka-carousel/es/carousel", JSImport.Default)
  @js.native
  class default protected () extends Carousel {
    def this(props: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-nuka-carousel/es/carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rmc-nuka-carousel/es/carousel", "default.defaultProps")
    @js.native
    def defaultProps: ICarouselProps = js.native
    @scala.inline
    def defaultProps_=(x: ICarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel
    extends Component[ICarouselProps, js.Any, js.Any] {
    
    def _rafCb(): Unit = js.native
    
    var _rafID: js.Any = js.native
    
    def animateSlide(): Unit = js.native
    def animateSlide(
      easing: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      endValue: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Unit = js.native
    def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.UndefOr[scala.Nothing], endValue: js.Any): Unit = js.native
    def animateSlide(
      easing: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      endValue: js.Any,
      callback: js.Function
    ): Unit = js.native
    def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.Any): Unit = js.native
    def animateSlide(
      easing: js.UndefOr[scala.Nothing],
      duration: js.Any,
      endValue: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Unit = js.native
    def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.Any, endValue: js.Any): Unit = js.native
    def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
    def animateSlide(easing: js.Any): Unit = js.native
    def animateSlide(
      easing: js.Any,
      duration: js.UndefOr[scala.Nothing],
      endValue: js.UndefOr[scala.Nothing],
      callback: js.Function
    ): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.UndefOr[scala.Nothing], endValue: js.Any): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.UndefOr[scala.Nothing], endValue: js.Any, callback: js.Function): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any, endValue: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
    
    var autoplayID: js.Any = js.native
    
    def autoplayIterator(): Unit = js.native
    
    var autoplayPaused: js.Any = js.native
    
    def bindEvents(): Unit = js.native
    
    var clickSafe: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCarousel(): Unit = js.native
    
    @JSName("componentWillMount")
    def componentWillMount_MCarousel(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCarousel(nextProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCarousel(): Unit = js.native
    
    def formatChildren(children: js.Any): js.Array[ReactElement] = js.native
    
    def getDecoratorStyles(position: js.Any): Left | MsTransform | Position | Top | Transform | Right | Bottom | TextAlign | BottomPosition = js.native
    
    def getFrameStyles(): CSSProperties = js.native
    
    def getListStyles(): CSSProperties = js.native
    
    def getMouseEvents(): OnMouseDown | Null = js.native
    
    def getSlideStyles(index: js.Any, positionValue: js.Any): CSSProperties = js.native
    
    def getSlideTargetPosition(index: js.Any, positionValue: js.Any): Double = js.native
    
    def getSliderStyles(): BoxSizing = js.native
    
    def getStyleTagStyles(): String = js.native
    
    def getTargetLeft(): Double = js.native
    def getTargetLeft(touchOffset: js.UndefOr[scala.Nothing], slide: js.Any): Double = js.native
    def getTargetLeft(touchOffset: js.Any): Double = js.native
    def getTargetLeft(touchOffset: js.Any, slide: js.Any): Double = js.native
    
    def getTouchEvents(): OnTouchCancel | Null = js.native
    
    def getTweeningValue(path: js.Any): js.Any = js.native
    
    def goToSlide(index: js.Any): Unit = js.native
    
    def handleClick(e: js.Any): Unit = js.native
    
    def handleMouseOut(): Unit = js.native
    
    def handleMouseOver(): Unit = js.native
    
    def handleSwipe(_underscore: js.Any): Unit = js.native
    
    def nextSlide(): Unit = js.native
    
    def onReadyStateChange(): Unit = js.native
    
    def onResize(): Unit = js.native
    
    def previousSlide(): Unit = js.native
    
    def resetAutoplay(): Unit = js.native
    
    def setDimensions(): Unit = js.native
    def setDimensions(props: js.Any): Unit = js.native
    
    def setExternalData(): Unit = js.native
    
    def setInitialDimensions(): Unit = js.native
    
    def setLeft(): Unit = js.native
    
    def startAutoplay(): Unit = js.native
    
    def stopAutoplay(): Unit = js.native
    
    def swipeDirection(x1: js.Any, x2: js.Any, y1: js.Any, y2: js.Any): `0` | `1` | `-1` = js.native
    
    var touchObject: js.Any = js.native
    
    def tweenState(path: js.Any, hasEasingDurationDelayBeginValueEndValueOnEndStackBehavior: BeginValue): Unit = js.native
    
    def unbindEvents(): Unit = js.native
  }
  
  @js.native
  trait ICarouselProps extends StObject {
    
    var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var autoplayInterval: js.UndefOr[Double] = js.native
    
    var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* endIndex */ Double, Unit]] = js.native
    
    var cellAlign: js.UndefOr[left | center | right] = js.native
    
    var cellSpacing: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[js.Function0[Unit]] = js.native
    
    var decorators: js.UndefOr[js.Array[_]] = js.native
    
    var dragging: js.UndefOr[Boolean] = js.native
    
    var easing: js.UndefOr[js.Function] = js.native
    
    var edgeEasing: js.UndefOr[js.Function] = js.native
    
    var frameOverflow: js.UndefOr[String] = js.native
    
    var framePadding: js.UndefOr[String] = js.native
    
    var initialSlideHeight: js.UndefOr[Double] = js.native
    
    var initialSlideWidth: js.UndefOr[Double] = js.native
    
    var resetAutoplay: js.UndefOr[Boolean] = js.native
    
    var slideIndex: js.UndefOr[Double] = js.native
    
    var slideWidth: js.UndefOr[String | Double] = js.native
    
    var slidesToScroll: js.UndefOr[Double | auto] = js.native
    
    var slidesToShow: js.UndefOr[Double] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var swipeSpeed: js.UndefOr[Double] = js.native
    
    var swiping: js.UndefOr[Boolean] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[String] = js.native
    
    var wrapAround: js.UndefOr[Boolean] = js.native
  }
  object ICarouselProps {
    
    @scala.inline
    def apply(): ICarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICarouselProps]
    }
    
    @scala.inline
    implicit class ICarouselPropsMutableBuilder[Self <: ICarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterSlide(value: /* index */ Double => Unit): Self = StObject.set(x, "afterSlide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterSlideUndefined: Self = StObject.set(x, "afterSlide", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBeforeSlide(value: (/* currentIndex */ Double, /* endIndex */ Double) => Unit): Self = StObject.set(x, "beforeSlide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSlideUndefined: Self = StObject.set(x, "beforeSlide", js.undefined)
      
      @scala.inline
      def setCellAlign(value: left | center | right): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellAlignUndefined: Self = StObject.set(x, "cellAlign", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: () => Unit): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDecorators(value: js.Array[_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      @scala.inline
      def setDecoratorsVarargs(value: js.Any*): Self = StObject.set(x, "decorators", js.Array(value :_*))
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setEasing(value: js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEdgeEasing(value: js.Function): Self = StObject.set(x, "edgeEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeEasingUndefined: Self = StObject.set(x, "edgeEasing", js.undefined)
      
      @scala.inline
      def setFrameOverflow(value: String): Self = StObject.set(x, "frameOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameOverflowUndefined: Self = StObject.set(x, "frameOverflow", js.undefined)
      
      @scala.inline
      def setFramePadding(value: String): Self = StObject.set(x, "framePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramePaddingUndefined: Self = StObject.set(x, "framePadding", js.undefined)
      
      @scala.inline
      def setInitialSlideHeight(value: Double): Self = StObject.set(x, "initialSlideHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSlideHeightUndefined: Self = StObject.set(x, "initialSlideHeight", js.undefined)
      
      @scala.inline
      def setInitialSlideWidth(value: Double): Self = StObject.set(x, "initialSlideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSlideWidthUndefined: Self = StObject.set(x, "initialSlideWidth", js.undefined)
      
      @scala.inline
      def setResetAutoplay(value: Boolean): Self = StObject.set(x, "resetAutoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetAutoplayUndefined: Self = StObject.set(x, "resetAutoplay", js.undefined)
      
      @scala.inline
      def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
      
      @scala.inline
      def setSlideWidth(value: String | Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      @scala.inline
      def setSlidesToScroll(value: Double | auto): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      @scala.inline
      def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwipeSpeed(value: Double): Self = StObject.set(x, "swipeSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeSpeedUndefined: Self = StObject.set(x, "swipeSpeed", js.undefined)
      
      @scala.inline
      def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipingUndefined: Self = StObject.set(x, "swiping", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopLeft
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopCenter
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopRight
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterLeft
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterCenter
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterRight
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomLeft
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomCenter
    - typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomRight
  */
  trait IDecoratorPosition extends StObject
  object IDecoratorPosition {
    
    @scala.inline
    def BottomCenter: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomCenter = "BottomCenter".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomCenter]
    
    @scala.inline
    def BottomLeft: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomLeft = "BottomLeft".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomLeft]
    
    @scala.inline
    def BottomRight: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomRight = "BottomRight".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.BottomRight]
    
    @scala.inline
    def CenterCenter: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterCenter = "CenterCenter".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterCenter]
    
    @scala.inline
    def CenterLeft: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterLeft = "CenterLeft".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterLeft]
    
    @scala.inline
    def CenterRight: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterRight = "CenterRight".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.CenterRight]
    
    @scala.inline
    def TopCenter: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopCenter = "TopCenter".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopCenter]
    
    @scala.inline
    def TopLeft: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopLeft = "TopLeft".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopLeft]
    
    @scala.inline
    def TopRight: typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopRight = "TopRight".asInstanceOf[typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.TopRight]
  }
}
