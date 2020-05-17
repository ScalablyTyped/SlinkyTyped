package typingsSlinky.nukaCarousel.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nukaCarousel.anon.ContainerClassName
import typingsSlinky.nukaCarousel.anon.slideActioninCarouselSlid
import typingsSlinky.nukaCarousel.mod.CSSProperties
import typingsSlinky.nukaCarousel.mod.CarouselCellAlignProp
import typingsSlinky.nukaCarousel.mod.CarouselControlContainerProp
import typingsSlinky.nukaCarousel.mod.CarouselHeightModeProp
import typingsSlinky.nukaCarousel.mod.CarouselProps
import typingsSlinky.nukaCarousel.mod.CarouselScrollModeProp
import typingsSlinky.nukaCarousel.mod.CarouselSlideRenderControlProps
import typingsSlinky.nukaCarousel.mod.CarouselSlideWidthProp
import typingsSlinky.nukaCarousel.mod.CarouselSlidesToScrollProp
import typingsSlinky.nukaCarousel.mod.CarouselTransitionModeProp
import typingsSlinky.nukaCarousel.mod.default
import typingsSlinky.nukaCarousel.nukaCarouselStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NukaCarousel {
  @JSImport("nuka-carousel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def afterSlide(value: /* prevSlide */ Double => Unit): this.type = set("afterSlide", js.Any.fromFunction1(value))
    @scala.inline
    def animation(value: zoom): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def autoGenerateStyleTag(value: Boolean): this.type = set("autoGenerateStyleTag", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplayInterval(value: Double): this.type = set("autoplayInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplayReverse(value: Boolean): this.type = set("autoplayReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def beforeSlide(value: (/* currentSlide */ Double, /* endSlide */ Double) => Unit): this.type = set("beforeSlide", js.Any.fromFunction2(value))
    @scala.inline
    def cellAlign(value: CarouselCellAlignProp): this.type = set("cellAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def cellSpacing(value: Double): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultControlsConfig(value: ContainerClassName): this.type = set("defaultControlsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def disableAnimation(value: Boolean): this.type = set("disableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def disableEdgeSwiping(value: Boolean): this.type = set("disableEdgeSwiping", value.asInstanceOf[js.Any])
    @scala.inline
    def dragging(value: Boolean): this.type = set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def edgeEasing(value: String): this.type = set("edgeEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def enableKeyboardControls(value: Boolean): this.type = set("enableKeyboardControls", value.asInstanceOf[js.Any])
    @scala.inline
    def frameOverflow(value: String): this.type = set("frameOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def framePadding(value: String): this.type = set("framePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def getControlsContainerStyle(value: /* key */ CarouselControlContainerProp => CSSProperties): this.type = set("getControlsContainerStyle", js.Any.fromFunction1(value))
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def heightMode(value: CarouselHeightModeProp): this.type = set("heightMode", value.asInstanceOf[js.Any])
    @scala.inline
    def initialSlideHeight(value: Double): this.type = set("initialSlideHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def initialSlideWidth(value: Double): this.type = set("initialSlideWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRef(value: ReactRef[HTMLInputElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def keyCodeConfig(value: slideActioninCarouselSlid): this.type = set("keyCodeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragStart(value: () => Unit): this.type = set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def onResize(value: () => Unit): this.type = set("onResize", js.Any.fromFunction0(value))
    @scala.inline
    def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def renderAnnounceSlideMessage(value: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String): this.type = set("renderAnnounceSlideMessage", js.Any.fromFunction1(value))
    @scala.inline
    def renderBottomCenterControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderBottomCenterControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderBottomCenterControlsNull: this.type = set("renderBottomCenterControls", null)
    @scala.inline
    def renderBottomLeftControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderBottomLeftControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderBottomLeftControlsNull: this.type = set("renderBottomLeftControls", null)
    @scala.inline
    def renderBottomRightControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderBottomRightControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderBottomRightControlsNull: this.type = set("renderBottomRightControls", null)
    @scala.inline
    def renderCenterCenterControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderCenterCenterControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderCenterCenterControlsNull: this.type = set("renderCenterCenterControls", null)
    @scala.inline
    def renderCenterLeftControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderCenterLeftControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderCenterLeftControlsNull: this.type = set("renderCenterLeftControls", null)
    @scala.inline
    def renderCenterRightControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderCenterRightControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderCenterRightControlsNull: this.type = set("renderCenterRightControls", null)
    @scala.inline
    def renderTopCenterControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderTopCenterControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderTopCenterControlsNull: this.type = set("renderTopCenterControls", null)
    @scala.inline
    def renderTopLeftControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderTopLeftControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderTopLeftControlsNull: this.type = set("renderTopLeftControls", null)
    @scala.inline
    def renderTopRightControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): this.type = set("renderTopRightControls", js.Any.fromFunction1(value))
    @scala.inline
    def renderTopRightControlsNull: this.type = set("renderTopRightControls", null)
    @scala.inline
    def scrollMode(value: CarouselScrollModeProp): this.type = set("scrollMode", value.asInstanceOf[js.Any])
    @scala.inline
    def slideIndex(value: Double): this.type = set("slideIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def slideWidth(value: CarouselSlideWidthProp): this.type = set("slideWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def slidesToScroll(value: CarouselSlidesToScrollProp): this.type = set("slidesToScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def slidesToShow(value: Double): this.type = set("slidesToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def swiping(value: Boolean): this.type = set("swiping", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionMode(value: CarouselTransitionModeProp): this.type = set("transitionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def withoutControls(value: Boolean): this.type = set("withoutControls", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapAround(value: Boolean): this.type = set("wrapAround", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NukaCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

