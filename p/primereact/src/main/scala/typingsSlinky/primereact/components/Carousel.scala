package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.AnonPage
import typingsSlinky.primereact.carouselCarouselMod.CarouselProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel {
  @JSImport("primereact/carousel", "Carousel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.carouselMod.Carousel] {
    @scala.inline
    def autoplayInterval(value: Double): this.type = set("autoplayInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def dotsContainerClassName(value: String): this.type = set("dotsContainerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: js.Any): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def itemTemplate(value: js.Any): this.type = set("itemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def numScroll(value: Double): this.type = set("numScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def numVisible(value: Double): this.type = set("numVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def onPageChange(value: /* e */ AnonPage => Unit): this.type = set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def responsiveOptions(value: js.Any): this.type = set("responsiveOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalViewPortHeight(value: String): this.type = set("verticalViewPortHeight", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

