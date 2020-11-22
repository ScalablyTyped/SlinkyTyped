package typingsSlinky.reactAliceCarousel.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAliceCarousel.mod.default
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.action
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.all
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
import typingsSlinky.reactAliceCarousel.typesMod.Props
import typingsSlinky.reactAliceCarousel.typesMod.Responsive
import typingsSlinky.reactAliceCarousel.typesMod.RootElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAliceCarousel {
  
  @JSImport("react-alice-carousel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationEasingFunction(value: String): this.type = set("animationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationType(value: slide | fadeout | AnimationType): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoPlayControls(value: Boolean): this.type = set("autoPlayControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoPlayDirection(value: rtl | ltr | AutoplayDirection): this.type = set("autoPlayDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoPlayInterval(value: Double): this.type = set("autoPlayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoPlayStrategy(
      value: typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.default | all | action | none | AutoPlayStrategy
    ): this.type = set("autoPlayStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def controlsStrategy(
      value: typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.default | responsive | ControlsStrategy
    ): this.type = set("controlsStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableButtonsControls(value: Boolean): this.type = set("disableButtonsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableDotsControls(value: Boolean): this.type = set("disableDotsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableSlideInfo(value: Boolean): this.type = set("disableSlideInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: js.Any*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def items(value: js.Array[_]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseTracking(value: Boolean): this.type = set("mouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInitialized(value: /* e */ EventObject => Unit): this.type = set("onInitialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResizeEvent(value: (/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement) => Boolean): this.type = set("onResizeEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def onResized(value: /* e */ EventObject => Unit): this.type = set("onResized", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSlideChange(value: /* e */ EventObject => Unit): this.type = set("onSlideChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSlideChanged(value: /* e */ EventObject => Unit): this.type = set("onSlideChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def paddingLeft(value: Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRight(value: Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preservePosition(value: Boolean): this.type = set("preservePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responsive(value: Responsive): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeDelta(value: Double): this.type = set("swipeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeExtraPadding(value: Double): this.type = set("swipeExtraPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchMoveDefaultEvents(value: Boolean): this.type = set("touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchTracking(value: Boolean): this.type = set("touchTracking", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactAliceCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
