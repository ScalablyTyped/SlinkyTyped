package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactSlick.mod.LazyLoadTypes
import typingsSlinky.antDesignReactSlick.mod.ResponsiveObject
import typingsSlinky.antDesignReactSlick.mod.Slider
import typingsSlinky.antDesignReactSlick.mod.SwipeDirection
import typingsSlinky.antd.anon.ClassName
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod extends Shortcut {
  
  @JSImport("antd/lib/carousel", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CarouselProps with RefAttributes[_]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.scrollx
    - typingsSlinky.antd.antdStrings.fade
  */
  trait CarouselEffect extends StObject
  object CarouselEffect {
    
    @scala.inline
    def fade: typingsSlinky.antd.antdStrings.fade = "fade".asInstanceOf[typingsSlinky.antd.antdStrings.fade]
    
    @scala.inline
    def scrollx: typingsSlinky.antd.antdStrings.scrollx = "scrollx".asInstanceOf[typingsSlinky.antd.antdStrings.scrollx]
  }
  
  /* Inlined parent std.Omit<@ant-design/react-slick.@ant-design/react-slick.Settings, 'dots' | 'dotsClass'> */
  @js.native
  trait CarouselProps extends StObject {
    
    var accessibility: js.UndefOr[Boolean] = js.native
    
    var adaptiveHeight: js.UndefOr[Boolean] = js.native
    
    var afterChange: js.UndefOr[js.Function1[/* currentSlide */ Double, Unit]] = js.native
    
    var appendDots: js.UndefOr[js.Function1[/* dots */ ReactElement, ReactElement]] = js.native
    
    var arrows: js.UndefOr[Boolean] = js.native
    
    var asNavFor: js.UndefOr[Slider] = js.native
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var autoplaySpeed: js.UndefOr[Double] = js.native
    
    var beforeChange: js.UndefOr[js.Function2[/* currentSlide */ Double, /* nextSlide */ Double, Unit]] = js.native
    
    var centerMode: js.UndefOr[Boolean] = js.native
    
    var centerPadding: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var cssEase: js.UndefOr[String] = js.native
    
    var customPaging: js.UndefOr[js.Function1[/* index */ Double, ReactElement]] = js.native
    
    var dotPosition: js.UndefOr[DotPosition] = js.native
    
    var dots: js.UndefOr[Boolean | ClassName] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var easing: js.UndefOr[String] = js.native
    
    var edgeFriction: js.UndefOr[Double] = js.native
    
    var effect: js.UndefOr[CarouselEffect] = js.native
    
    var fade: js.UndefOr[Boolean] = js.native
    
    var focusOnSelect: js.UndefOr[Boolean] = js.native
    
    var infinite: js.UndefOr[Boolean] = js.native
    
    var initialSlide: js.UndefOr[Double] = js.native
    
    var lazyLoad: js.UndefOr[LazyLoadTypes] = js.native
    
    var nextArrow: js.UndefOr[ReactElement] = js.native
    
    var onEdge: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
    
    var onInit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLazyLoad: js.UndefOr[js.Function1[/* slidesToLoad */ js.Array[Double], Unit]] = js.native
    
    var onReInit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSwipe: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
    
    var pauseOnDotsHover: js.UndefOr[Boolean] = js.native
    
    var pauseOnFocus: js.UndefOr[Boolean] = js.native
    
    var pauseOnHover: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var prevArrow: js.UndefOr[ReactElement] = js.native
    
    var responsive: js.UndefOr[js.Array[ResponsiveObject]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var slickGoTo: js.UndefOr[Double] = js.native
    
    var slide: js.UndefOr[String] = js.native
    
    var slidesPerRow: js.UndefOr[Double] = js.native
    
    var slidesToScroll: js.UndefOr[Double] = js.native
    
    var slidesToShow: js.UndefOr[Double] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var swipe: js.UndefOr[Boolean] = js.native
    
    var swipeEvent: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
    
    var swipeToSlide: js.UndefOr[Boolean] = js.native
    
    var touchMove: js.UndefOr[Boolean] = js.native
    
    var touchThreshold: js.UndefOr[Double] = js.native
    
    var useCSS: js.UndefOr[Boolean] = js.native
    
    var useTransform: js.UndefOr[Boolean] = js.native
    
    var variableWidth: js.UndefOr[Boolean] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
    
    var verticalSwiping: js.UndefOr[Boolean] = js.native
    
    var waitForAnimate: js.UndefOr[Boolean] = js.native
  }
  object CarouselProps {
    
    @scala.inline
    def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibility(value: Boolean): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
      
      @scala.inline
      def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
      
      @scala.inline
      def setAfterChange(value: /* currentSlide */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setAppendDots(value: /* dots */ ReactElement => ReactElement): Self = StObject.set(x, "appendDots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendDotsUndefined: Self = StObject.set(x, "appendDots", js.undefined)
      
      @scala.inline
      def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setAsNavFor(value: Slider): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplaySpeed(value: Double): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBeforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setCenterMode(value: Boolean): Self = StObject.set(x, "centerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterModeUndefined: Self = StObject.set(x, "centerMode", js.undefined)
      
      @scala.inline
      def setCenterPadding(value: String): Self = StObject.set(x, "centerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterPaddingUndefined: Self = StObject.set(x, "centerPadding", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCssEase(value: String): Self = StObject.set(x, "cssEase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssEaseUndefined: Self = StObject.set(x, "cssEase", js.undefined)
      
      @scala.inline
      def setCustomPaging(value: /* index */ Double => ReactElement): Self = StObject.set(x, "customPaging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomPagingUndefined: Self = StObject.set(x, "customPaging", js.undefined)
      
      @scala.inline
      def setDotPosition(value: DotPosition): Self = StObject.set(x, "dotPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotPositionUndefined: Self = StObject.set(x, "dotPosition", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean | ClassName): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEdgeFriction(value: Double): Self = StObject.set(x, "edgeFriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeFrictionUndefined: Self = StObject.set(x, "edgeFriction", js.undefined)
      
      @scala.inline
      def setEffect(value: CarouselEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setFocusOnSelect(value: Boolean): Self = StObject.set(x, "focusOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnSelectUndefined: Self = StObject.set(x, "focusOnSelect", js.undefined)
      
      @scala.inline
      def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      @scala.inline
      def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
      
      @scala.inline
      def setLazyLoad(value: LazyLoadTypes): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      @scala.inline
      def setNextArrow(value: ReactElement): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
      
      @scala.inline
      def setOnEdge(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "onEdge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEdgeUndefined: Self = StObject.set(x, "onEdge", js.undefined)
      
      @scala.inline
      def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnLazyLoad(value: /* slidesToLoad */ js.Array[Double] => Unit): Self = StObject.set(x, "onLazyLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLazyLoadUndefined: Self = StObject.set(x, "onLazyLoad", js.undefined)
      
      @scala.inline
      def setOnReInit(value: () => Unit): Self = StObject.set(x, "onReInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReInitUndefined: Self = StObject.set(x, "onReInit", js.undefined)
      
      @scala.inline
      def setOnSwipe(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      @scala.inline
      def setPauseOnDotsHover(value: Boolean): Self = StObject.set(x, "pauseOnDotsHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnDotsHoverUndefined: Self = StObject.set(x, "pauseOnDotsHover", js.undefined)
      
      @scala.inline
      def setPauseOnFocus(value: Boolean): Self = StObject.set(x, "pauseOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnFocusUndefined: Self = StObject.set(x, "pauseOnFocus", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrevArrow(value: ReactElement): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
      
      @scala.inline
      def setResponsive(value: js.Array[ResponsiveObject]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setResponsiveVarargs(value: ResponsiveObject*): Self = StObject.set(x, "responsive", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSlickGoTo(value: Double): Self = StObject.set(x, "slickGoTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlickGoToUndefined: Self = StObject.set(x, "slickGoTo", js.undefined)
      
      @scala.inline
      def setSlide(value: String): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setSlidesPerRow(value: Double): Self = StObject.set(x, "slidesPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesPerRowUndefined: Self = StObject.set(x, "slidesPerRow", js.undefined)
      
      @scala.inline
      def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
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
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeEvent(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "swipeEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwipeEventUndefined: Self = StObject.set(x, "swipeEvent", js.undefined)
      
      @scala.inline
      def setSwipeToSlide(value: Boolean): Self = StObject.set(x, "swipeToSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeToSlideUndefined: Self = StObject.set(x, "swipeToSlide", js.undefined)
      
      @scala.inline
      def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      @scala.inline
      def setTouchMove(value: Boolean): Self = StObject.set(x, "touchMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
      
      @scala.inline
      def setTouchThreshold(value: Double): Self = StObject.set(x, "touchThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchThresholdUndefined: Self = StObject.set(x, "touchThreshold", js.undefined)
      
      @scala.inline
      def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
      
      @scala.inline
      def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
      
      @scala.inline
      def setVariableWidth(value: Boolean): Self = StObject.set(x, "variableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableWidthUndefined: Self = StObject.set(x, "variableWidth", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalSwiping(value: Boolean): Self = StObject.set(x, "verticalSwiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalSwipingUndefined: Self = StObject.set(x, "verticalSwiping", js.undefined)
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWaitForAnimate(value: Boolean): Self = StObject.set(x, "waitForAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForAnimateUndefined: Self = StObject.set(x, "waitForAnimate", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.top
    - typingsSlinky.antd.antdStrings.bottom
    - typingsSlinky.antd.antdStrings.left
    - typingsSlinky.antd.antdStrings.right
  */
  trait DotPosition extends StObject
  object DotPosition {
    
    @scala.inline
    def bottom: typingsSlinky.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsSlinky.antd.antdStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.antd.antdStrings.left = "left".asInstanceOf[typingsSlinky.antd.antdStrings.left]
    
    @scala.inline
    def right: typingsSlinky.antd.antdStrings.right = "right".asInstanceOf[typingsSlinky.antd.antdStrings.right]
    
    @scala.inline
    def top: typingsSlinky.antd.antdStrings.top = "top".asInstanceOf[typingsSlinky.antd.antdStrings.top]
  }
  
  type _To = ForwardRefExoticComponent[CarouselProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `carouselMod.foo` */
  override def _to: ForwardRefExoticComponent[CarouselProps with RefAttributes[_]] = default
}
