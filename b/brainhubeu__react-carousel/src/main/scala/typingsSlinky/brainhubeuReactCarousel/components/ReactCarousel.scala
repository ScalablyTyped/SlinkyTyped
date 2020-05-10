package typingsSlinky.brainhubeuReactCarousel.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.brainhubeuReactCarousel.mod.CarouselProps
import typingsSlinky.brainhubeuReactCarousel.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCarousel {
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def addArrowClickHandler(value: Boolean): this.type = set("addArrowClickHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def animationSpeed(value: Double): this.type = set("animationSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowLeft(value: ReactElement): this.type = set("arrowLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowRight(value: ReactElement): this.type = set("arrowRight", value.asInstanceOf[js.Any])
    @scala.inline
    def arrows(value: Boolean): this.type = set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def autoPlay(value: Double): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def breakpoints(value: js.Any): this.type = set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def clickToChange(value: Boolean): this.type = set("clickToChange", value.asInstanceOf[js.Any])
    @scala.inline
    def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def keepDirectionWhenDragging(value: Boolean): this.type = set("keepDirectionWhenDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def slides(value: js.Array[ReactElement]): this.type = set("slides", value.asInstanceOf[js.Any])
    @scala.inline
    def slidesPerPage(value: Double): this.type = set("slidesPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def slidesPerScroll(value: Double): this.type = set("slidesPerScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def stopAutoPlayOnHover(value: Boolean): this.type = set("stopAutoPlayOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

