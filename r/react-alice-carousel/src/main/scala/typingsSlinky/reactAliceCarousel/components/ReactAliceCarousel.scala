package typingsSlinky.reactAliceCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAliceCarousel.mod.EventObject
import typingsSlinky.reactAliceCarousel.mod.Props
import typingsSlinky.reactAliceCarousel.mod.default
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAliceCarousel {
  @JSImport("react-alice-carousel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPlayActionDisabled(value: Boolean): this.type = set("autoPlayActionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPlayDirection(value: String): this.type = set("autoPlayDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPlayInterval(value: Double): this.type = set("autoPlayInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonsDisabled(value: Boolean): this.type = set("buttonsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def controlsStrategy(value: typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.default | responsive): this.type = set("controlsStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def disableAutoPlayOnAction(value: Boolean): this.type = set("disableAutoPlayOnAction", value.asInstanceOf[js.Any])
    @scala.inline
    def dotsDisabled(value: Boolean): this.type = set("dotsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def fadeOutAnimation(value: Boolean): this.type = set("fadeOutAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def items(value: js.Array[js.Object]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def keysControlDisabled(value: Boolean): this.type = set("keysControlDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseTrackingEnabled(value: Boolean): this.type = set("mouseTrackingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def onInitialized(value: /* e */ EventObject => Unit): this.type = set("onInitialized", js.Any.fromFunction1(value))
    @scala.inline
    def onResized(value: /* e */ EventObject => Unit): this.type = set("onResized", js.Any.fromFunction1(value))
    @scala.inline
    def onSlideChange(value: /* e */ EventObject => Unit): this.type = set("onSlideChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSlideChanged(value: /* e */ EventObject => Unit): this.type = set("onSlideChanged", js.Any.fromFunction1(value))
    @scala.inline
    def playButtonEnabled(value: Boolean): this.type = set("playButtonEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def preventEventOnTouchMove(value: Boolean): this.type = set("preventEventOnTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def responsive(value: js.Object): this.type = set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldHandleResizeEvent(value: /* e */ js.Any => Boolean): this.type = set("shouldHandleResizeEvent", js.Any.fromFunction1(value))
    @scala.inline
    def showSlideInfo(value: Boolean): this.type = set("showSlideInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def slideToIndex(value: Double): this.type = set("slideToIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def stagePadding(value: js.Object): this.type = set("stagePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def startIndex(value: Double): this.type = set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def stopAutoPlayOnHover(value: Boolean): this.type = set("stopAutoPlayOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeDisabled(value: Boolean): this.type = set("swipeDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def touchTrackingEnabled(value: Boolean): this.type = set("touchTrackingEnabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactAliceCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

