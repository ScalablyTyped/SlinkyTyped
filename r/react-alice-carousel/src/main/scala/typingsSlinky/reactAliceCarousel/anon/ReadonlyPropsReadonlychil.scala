package typingsSlinky.reactAliceCarousel.anon

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.action
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.all
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.default
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.fadeout
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.ltr
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.none
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.responsive
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.rtl
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.slide
import typingsSlinky.reactAliceCarousel.typesMod.AnimationType
import typingsSlinky.reactAliceCarousel.typesMod.AutoPlayStrategy
import typingsSlinky.reactAliceCarousel.typesMod.AutoplayDirection
import typingsSlinky.reactAliceCarousel.typesMod.ControlsStrategy
import typingsSlinky.reactAliceCarousel.typesMod.EventObject
import typingsSlinky.reactAliceCarousel.typesMod.Responsive
import typingsSlinky.reactAliceCarousel.typesMod.RootElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-alice-carousel.react-alice-carousel/lib/types.Props> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
@js.native
trait ReadonlyPropsReadonlychil extends StObject {
  
  val activeIndex: js.UndefOr[Double] = js.native
  
  val animationDuration: js.UndefOr[Double] = js.native
  
  val animationEasingFunction: js.UndefOr[String] = js.native
  
  val animationType: js.UndefOr[slide | fadeout | AnimationType] = js.native
  
  val autoHeight: js.UndefOr[Boolean] = js.native
  
  val autoPlay: js.UndefOr[Boolean] = js.native
  
  val autoPlayControls: js.UndefOr[Boolean] = js.native
  
  val autoPlayDirection: js.UndefOr[rtl | ltr | AutoplayDirection] = js.native
  
  val autoPlayInterval: js.UndefOr[Double] = js.native
  
  val autoPlayStrategy: js.UndefOr[default | all | action | none | AutoPlayStrategy] = js.native
  
  val autoWidth: js.UndefOr[Boolean] = js.native
  
  val children: js.UndefOr[js.Any] with js.UndefOr[ReactElement] = js.native
  
  val controlsStrategy: js.UndefOr[
    default | typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.responsive | ControlsStrategy
  ] = js.native
  
  val disableButtonsControls: js.UndefOr[Boolean] = js.native
  
  val disableDotsControls: js.UndefOr[Boolean] = js.native
  
  val disableSlideInfo: js.UndefOr[Boolean] = js.native
  
  val infinite: js.UndefOr[Boolean] = js.native
  
  val items: js.UndefOr[js.Array[_]] = js.native
  
  val mouseTracking: js.UndefOr[Boolean] = js.native
  
  val onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val onResizeEvent: js.UndefOr[
    js.Function3[/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement, Boolean]
  ] = js.native
  
  val onResized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  
  val paddingLeft: js.UndefOr[Double] = js.native
  
  val paddingRight: js.UndefOr[Double] = js.native
  
  val preservePosition: js.UndefOr[Boolean] = js.native
  
  val responsive: js.UndefOr[Responsive] = js.native
  
  val swipeDelta: js.UndefOr[Double] = js.native
  
  val swipeExtraPadding: js.UndefOr[Double] = js.native
  
  val touchMoveDefaultEvents: js.UndefOr[Boolean] = js.native
  
  val touchTracking: js.UndefOr[Boolean] = js.native
}
object ReadonlyPropsReadonlychil {
  
  @scala.inline
  def apply(children: js.UndefOr[js.Any] with js.UndefOr[ReactElement]): ReadonlyPropsReadonlychil = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPropsReadonlychil]
  }
  
  @scala.inline
  implicit class ReadonlyPropsReadonlychilMutableBuilder[Self <: ReadonlyPropsReadonlychil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasingFunction(value: String): Self = StObject.set(x, "animationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingFunctionUndefined: Self = StObject.set(x, "animationEasingFunction", js.undefined)
    
    @scala.inline
    def setAnimationType(value: slide | fadeout | AnimationType): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayControls(value: Boolean): Self = StObject.set(x, "autoPlayControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayControlsUndefined: Self = StObject.set(x, "autoPlayControls", js.undefined)
    
    @scala.inline
    def setAutoPlayDirection(value: rtl | ltr | AutoplayDirection): Self = StObject.set(x, "autoPlayDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayDirectionUndefined: Self = StObject.set(x, "autoPlayDirection", js.undefined)
    
    @scala.inline
    def setAutoPlayInterval(value: Double): Self = StObject.set(x, "autoPlayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayIntervalUndefined: Self = StObject.set(x, "autoPlayInterval", js.undefined)
    
    @scala.inline
    def setAutoPlayStrategy(value: default | all | action | none | AutoPlayStrategy): Self = StObject.set(x, "autoPlayStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayStrategyUndefined: Self = StObject.set(x, "autoPlayStrategy", js.undefined)
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    @scala.inline
    def setChildren(value: js.UndefOr[js.Any] with js.UndefOr[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsStrategy(value: default | responsive | ControlsStrategy): Self = StObject.set(x, "controlsStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsStrategyUndefined: Self = StObject.set(x, "controlsStrategy", js.undefined)
    
    @scala.inline
    def setDisableButtonsControls(value: Boolean): Self = StObject.set(x, "disableButtonsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableButtonsControlsUndefined: Self = StObject.set(x, "disableButtonsControls", js.undefined)
    
    @scala.inline
    def setDisableDotsControls(value: Boolean): Self = StObject.set(x, "disableDotsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDotsControlsUndefined: Self = StObject.set(x, "disableDotsControls", js.undefined)
    
    @scala.inline
    def setDisableSlideInfo(value: Boolean): Self = StObject.set(x, "disableSlideInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSlideInfoUndefined: Self = StObject.set(x, "disableSlideInfo", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMouseTracking(value: Boolean): Self = StObject.set(x, "mouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseTrackingUndefined: Self = StObject.set(x, "mouseTracking", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    @scala.inline
    def setOnResizeEvent(value: (/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement) => Boolean): Self = StObject.set(x, "onResizeEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnResizeEventUndefined: Self = StObject.set(x, "onResizeEvent", js.undefined)
    
    @scala.inline
    def setOnResized(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onResized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResizedUndefined: Self = StObject.set(x, "onResized", js.undefined)
    
    @scala.inline
    def setOnSlideChange(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
    
    @scala.inline
    def setOnSlideChanged(value: /* e */ EventObject => Unit): Self = StObject.set(x, "onSlideChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlideChangedUndefined: Self = StObject.set(x, "onSlideChanged", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPreservePosition(value: Boolean): Self = StObject.set(x, "preservePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservePositionUndefined: Self = StObject.set(x, "preservePosition", js.undefined)
    
    @scala.inline
    def setResponsive(value: Responsive): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setSwipeDelta(value: Double): Self = StObject.set(x, "swipeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDeltaUndefined: Self = StObject.set(x, "swipeDelta", js.undefined)
    
    @scala.inline
    def setSwipeExtraPadding(value: Double): Self = StObject.set(x, "swipeExtraPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeExtraPaddingUndefined: Self = StObject.set(x, "swipeExtraPadding", js.undefined)
    
    @scala.inline
    def setTouchMoveDefaultEvents(value: Boolean): Self = StObject.set(x, "touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchMoveDefaultEventsUndefined: Self = StObject.set(x, "touchMoveDefaultEvents", js.undefined)
    
    @scala.inline
    def setTouchTracking(value: Boolean): Self = StObject.set(x, "touchTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchTrackingUndefined: Self = StObject.set(x, "touchTracking", js.undefined)
  }
}
