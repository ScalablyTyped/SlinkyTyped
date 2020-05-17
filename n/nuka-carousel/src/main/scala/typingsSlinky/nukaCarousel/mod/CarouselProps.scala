package typingsSlinky.nukaCarousel.mod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.nukaCarousel.anon.ContainerClassName
import typingsSlinky.nukaCarousel.anon.slideActioninCarouselSlid
import typingsSlinky.nukaCarousel.nukaCarouselStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselProps extends js.Object {
  /**
    * Hook to be called after a slide is changed
    * @param prevSlide Index of the previous slide
    */
  var afterSlide: js.UndefOr[js.Function1[/* prevSlide */ Double, Unit]] = js.native
  /**
    * Adds a zoom effect on the currently visible slide.
    */
  var animation: js.UndefOr[zoom] = js.native
  /**
    * Will generate a style tag to help ensure images are displayed properly
    * @default true
    */
  var autoGenerateStyleTag: js.UndefOr[Boolean] = js.native
  /**
    * Autoplay mode active
    * @default false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * Interval for autoplay iteration (ms)
    * @default 3000
    */
  var autoplayInterval: js.UndefOr[Double] = js.native
  /**
    * Autoplay cycles through slide indexes in reverse
    * @default false
    */
  var autoplayReverse: js.UndefOr[Boolean] = js.native
  /**
    * Hook to be called before a slide is changed
    * @param currentSlide Index of the current slide
    * @param endSlide Index of the last slide
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentSlide */ Double, /* endSlide */ Double, Unit]] = js.native
  /**
    * When displaying more than one slide,
    * sets which position to anchor the current slide to
    */
  var cellAlign: js.UndefOr[CarouselCellAlignProp] = js.native
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: js.UndefOr[Double] = js.native
  /**
    * Additional className
    */
  var className: js.UndefOr[String] = js.native
  /**
    * This prop lets you apply custom classes and styles to the default Next, Previous, and Paging Dots controls
    */
  var defaultControlsConfig: js.UndefOr[ContainerClassName] = js.native
  /**
    * Disable slides animation
    * @default false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Disable swipe before first slide and after last slide
    * @default false
    */
  var disableEdgeSwiping: js.UndefOr[Boolean] = js.native
  /**
    * Enable mouse swipe/dragging
    */
  var dragging: js.UndefOr[Boolean] = js.native
  /**
    * Animation easing function
    * @see https://github.com/d3/d3-ease
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * Animation easing function when swipe exceeds edge
    * @see https://github.com/d3/d3-ease
    */
  var edgeEasing: js.UndefOr[String] = js.native
  /**
    * When set to true, disable keyboard controls
    * @default false
    */
  var enableKeyboardControls: js.UndefOr[Boolean] = js.native
  /**
    * Used to set overflow style property on slider frame
    * @default 'hidden'
    */
  var frameOverflow: js.UndefOr[String] = js.native
  /**
    * Used to set the margin of the slider frame.
    * Accepts any string dimension value such as "0px 20px" or "500px"
    * @example '0px 20px'
    * @example '500px'
    */
  var framePadding: js.UndefOr[String] = js.native
  /**
    * Optional callback to apply styles to the container of a control.
    */
  var getControlsContainerStyle: js.UndefOr[js.Function1[/* key */ CarouselControlContainerProp, CSSProperties]] = js.native
  /**
    * Used to hardcode the slider height
    * @example '80%'
    * @example '500px'
    */
  var height: js.UndefOr[String] = js.native
  /**
    * Change the height of the slides based either on the first slide,
    * the current slide, or the maximum height of all slides.
    */
  var heightMode: js.UndefOr[CarouselHeightModeProp] = js.native
  /**
    * Initial height of the slides (px)
    */
  var initialSlideHeight: js.UndefOr[Double] = js.native
  /**
    * Initial width of the slides (px)
    */
  var initialSlideWidth: js.UndefOr[Double] = js.native
  /**
    * Ref to pass to carousel element
    */
  var innerRef: js.UndefOr[ReactRef[HTMLInputElement]] = js.native
  /**
    * When enableKeyboardControls is enabled, Configure keyCodes for corresponding slide actions as array of keyCodes
    */
  var keyCodeConfig: js.UndefOr[slideActioninCarouselSlid] = js.native
  /**
    * optional callback function
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Window onResize callback
    */
  var onResize: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Pause autoPlay when mouse is over carousel
    * @default true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Function for rendering aria-live announcement messages
    */
  var renderAnnounceSlideMessage: js.UndefOr[
    js.Function1[/* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps, String]
  ] = js.native
  /**
    * Function for rendering bottom center control
    */
  var renderBottomCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering bottom left control
    */
  var renderBottomLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering bottom right control
    */
  var renderBottomRightControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering center center control
    */
  var renderCenterCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering center left control
    */
  var renderCenterLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering center right control
    */
  var renderCenterRightControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering top center control
    */
  var renderTopCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering top left control
    */
  var renderTopLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Function for rendering top right control
    */
  var renderTopRightControls: js.UndefOr[CarouselRenderControl | Null] = js.native
  /**
    * Supports 'page' and 'remainder' scroll modes.
    * Defaults to 'remainder'.
    */
  var scrollMode: js.UndefOr[CarouselScrollModeProp] = js.native
  /**
    * Manually set the index of the slide to be shown
    */
  var slideIndex: js.UndefOr[Double] = js.native
  /**
    * Manually set slideWidth
    * @example '20px'
    * @example 0.8
    */
  var slideWidth: js.UndefOr[CarouselSlideWidthProp] = js.native
  /**
    * Slides to scroll at once. Set to "auto"
    * to always scroll the current number of visible slides
    */
  var slidesToScroll: js.UndefOr[CarouselSlidesToScrollProp] = js.native
  /**
    * Slides to show at once
    */
  var slidesToShow: js.UndefOr[Double] = js.native
  /**
    * Animation duration
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * style object
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Enable touch swipe/dragging
    */
  var swiping: js.UndefOr[Boolean] = js.native
  /**
    * Set the way slides transition from one to the next
    */
  var transitionMode: js.UndefOr[CarouselTransitionModeProp] = js.native
  /**
    * Enable the slides to transition vertically
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * Used to hardcode the slider width
    * @example '80%'
    * @example '500px'
    */
  var width: js.UndefOr[String] = js.native
  /**
    * Used to remove all controls at once. Overwrites the render[Top, Right, Bottom, Left]CenterControls()
    * @default false
    */
  var withoutControls: js.UndefOr[Boolean] = js.native
  /**
    * Sets infinite wrapAround mode
    * @default false
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object CarouselProps {
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSlide(value: /* prevSlide */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSlide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGenerateStyleTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateStyleTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGenerateStyleTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateStyleTag")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSlide(value: (/* currentSlide */ Double, /* endSlide */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSlide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withCellAlign(value: CarouselCellAlignProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultControlsConfig(value: ContainerClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultControlsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultControlsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultControlsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEdgeSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEdgeSwiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEdgeSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEdgeSwiping")(js.undefined)
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyboardControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyboardControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardControls")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameOverflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withFramePadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetControlsContainerStyle(value: /* key */ CarouselControlContainerProp => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControlsContainerStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetControlsContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControlsContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightMode(value: CarouselHeightModeProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightMode")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSlideHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSlideHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSlideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSlideWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRef(value: ReactRef[HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyCodeConfig(value: slideActioninCarouselSlid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCodeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyCodeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCodeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAnnounceSlideMessage(value: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAnnounceSlideMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderAnnounceSlideMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAnnounceSlideMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBottomCenterControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomCenterControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderBottomCenterControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomCenterControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBottomCenterControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomCenterControls")(null)
        ret
    }
    @scala.inline
    def withRenderBottomLeftControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomLeftControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderBottomLeftControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomLeftControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBottomLeftControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomLeftControls")(null)
        ret
    }
    @scala.inline
    def withRenderBottomRightControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomRightControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderBottomRightControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomRightControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBottomRightControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomRightControls")(null)
        ret
    }
    @scala.inline
    def withRenderCenterCenterControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterCenterControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderCenterCenterControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterCenterControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCenterCenterControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterCenterControls")(null)
        ret
    }
    @scala.inline
    def withRenderCenterLeftControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterLeftControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderCenterLeftControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterLeftControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCenterLeftControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterLeftControls")(null)
        ret
    }
    @scala.inline
    def withRenderCenterRightControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterRightControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderCenterRightControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterRightControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCenterRightControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCenterRightControls")(null)
        ret
    }
    @scala.inline
    def withRenderTopCenterControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopCenterControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTopCenterControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopCenterControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTopCenterControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopCenterControls")(null)
        ret
    }
    @scala.inline
    def withRenderTopLeftControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopLeftControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTopLeftControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopLeftControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTopLeftControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopLeftControls")(null)
        ret
    }
    @scala.inline
    def withRenderTopRightControls(value: /* props */ CarouselSlideRenderControlProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopRightControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTopRightControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopRightControls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTopRightControlsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTopRightControls")(null)
        ret
    }
    @scala.inline
    def withScrollMode(value: CarouselScrollModeProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideWidth(value: CarouselSlideWidthProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToScroll(value: CarouselSlidesToScrollProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToShow")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiping")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionMode(value: CarouselTransitionModeProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutControls")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(js.undefined)
        ret
    }
  }
  
}

