package typingsSlinky.rmcNukaCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ICarouselProps_1051988952[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def afterSlide(value: /* index */ Double => Unit): this.type = set("afterSlide", js.Any.fromFunction1(value))
  
  @scala.inline
  def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoplayInterval(value: Double): this.type = set("autoplayInterval", value.asInstanceOf[js.Any])
  
  @scala.inline
  def beforeSlide(value: (/* currentIndex */ Double, /* endIndex */ Double) => Unit): this.type = set("beforeSlide", js.Any.fromFunction2(value))
  
  @scala.inline
  def cellAlign(value: left | center | right): this.type = set("cellAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cellSpacing(value: Double): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def data(value: () => Unit): this.type = set("data", js.Any.fromFunction0(value))
  
  @scala.inline
  def decorators(value: js.Array[_]): this.type = set("decorators", value.asInstanceOf[js.Any])
  
  @scala.inline
  def decoratorsVarargs(value: js.Any*): this.type = set("decorators", js.Array(value :_*))
  
  @scala.inline
  def dragging(value: Boolean): this.type = set("dragging", value.asInstanceOf[js.Any])
  
  @scala.inline
  def easing(value: js.Function): this.type = set("easing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def edgeEasing(value: js.Function): this.type = set("edgeEasing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def frameOverflow(value: String): this.type = set("frameOverflow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def framePadding(value: String): this.type = set("framePadding", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initialSlideHeight(value: Double): this.type = set("initialSlideHeight", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initialSlideWidth(value: Double): this.type = set("initialSlideWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def resetAutoplay(value: Boolean): this.type = set("resetAutoplay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def slideIndex(value: Double): this.type = set("slideIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def slideWidth(value: String | Double): this.type = set("slideWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def slidesToScroll(value: Double | auto): this.type = set("slidesToScroll", value.asInstanceOf[js.Any])
  
  @scala.inline
  def slidesToShow(value: Double): this.type = set("slidesToShow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def swipeSpeed(value: Double): this.type = set("swipeSpeed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def swiping(value: Boolean): this.type = set("swiping", value.asInstanceOf[js.Any])
  
  @scala.inline
  def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapAround(value: Boolean): this.type = set("wrapAround", value.asInstanceOf[js.Any])
}
