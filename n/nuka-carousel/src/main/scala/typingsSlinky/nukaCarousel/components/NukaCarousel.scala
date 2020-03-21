package typingsSlinky.nukaCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.nukaCarousel.AnonContainerClassName
import typingsSlinky.nukaCarousel.mod.CSSProperties
import typingsSlinky.nukaCarousel.mod.CarouselCellAlignProp
import typingsSlinky.nukaCarousel.mod.CarouselControlContainerProp
import typingsSlinky.nukaCarousel.mod.CarouselHeightModeProp
import typingsSlinky.nukaCarousel.mod.CarouselProps
import typingsSlinky.nukaCarousel.mod.CarouselSlideRenderControlProps
import typingsSlinky.nukaCarousel.mod.CarouselSlideWidthProp
import typingsSlinky.nukaCarousel.mod.CarouselSlidesToScrollProp
import typingsSlinky.nukaCarousel.mod.CarouselTransitionModeProp
import typingsSlinky.nukaCarousel.mod.default
import typingsSlinky.nukaCarousel.nukaCarouselStrings.zoom
import typingsSlinky.nukaCarousel.slideActioninCarouselSlid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NukaCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("nuka-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    afterSlide: /* prevSlide */ Double => Unit = null,
    animation: zoom = null,
    autoGenerateStyleTag: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    autoplayReverse: js.UndefOr[Boolean] = js.undefined,
    beforeSlide: (/* currentSlide */ Double, /* endSlide */ Double) => Unit = null,
    cellAlign: CarouselCellAlignProp = null,
    cellSpacing: Int | Double = null,
    defaultControlsConfig: AnonContainerClassName = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeEasing: String = null,
    enableKeyboardControls: js.UndefOr[Boolean] = js.undefined,
    frameOverflow: String = null,
    framePadding: String = null,
    getControlContainerStyle: /* key */ CarouselControlContainerProp => CSSProperties = null,
    height: String = null,
    heightMode: CarouselHeightModeProp = null,
    initialSlideHeight: Int | Double = null,
    initialSlideWidth: Int | Double = null,
    keyCodeConfig: slideActioninCarouselSlid = null,
    onDragStart: () => Unit = null,
    onResize: () => Unit = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    renderAnnounceSlideMessage: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String = null,
    renderBottomCenterControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderBottomLeftControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderBottomRightControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderCenterCenterControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderCenterLeftControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderCenterRightControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderTopCenterControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderTopLeftControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    renderTopRightControls: /* props */ CarouselSlideRenderControlProps => TagMod[Any] = null,
    slideIndex: Int | Double = null,
    slideWidth: CarouselSlideWidthProp = null,
    slidesToScroll: CarouselSlidesToScrollProp = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    style: CSSProperties = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    transitionMode: CarouselTransitionModeProp = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: String = null,
    withoutControls: js.UndefOr[Boolean] = js.undefined,
    wrapAround: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGenerateStyleTag)) __obj.updateDynamic("autoGenerateStyleTag")(autoGenerateStyleTag.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayReverse)) __obj.updateDynamic("autoplayReverse")(autoplayReverse.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (defaultControlsConfig != null) __obj.updateDynamic("defaultControlsConfig")(defaultControlsConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEdgeSwiping)) __obj.updateDynamic("disableEdgeSwiping")(disableEdgeSwiping.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardControls)) __obj.updateDynamic("enableKeyboardControls")(enableKeyboardControls.asInstanceOf[js.Any])
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding.asInstanceOf[js.Any])
    if (getControlContainerStyle != null) __obj.updateDynamic("getControlContainerStyle")(js.Any.fromFunction1(getControlContainerStyle))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightMode != null) __obj.updateDynamic("heightMode")(heightMode.asInstanceOf[js.Any])
    if (initialSlideHeight != null) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (keyCodeConfig != null) __obj.updateDynamic("keyCodeConfig")(keyCodeConfig.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction0(onResize))
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (renderAnnounceSlideMessage != null) __obj.updateDynamic("renderAnnounceSlideMessage")(js.Any.fromFunction1(renderAnnounceSlideMessage))
    if (renderBottomCenterControls != null) __obj.updateDynamic("renderBottomCenterControls")(js.Any.fromFunction1(renderBottomCenterControls))
    if (renderBottomLeftControls != null) __obj.updateDynamic("renderBottomLeftControls")(js.Any.fromFunction1(renderBottomLeftControls))
    if (renderBottomRightControls != null) __obj.updateDynamic("renderBottomRightControls")(js.Any.fromFunction1(renderBottomRightControls))
    if (renderCenterCenterControls != null) __obj.updateDynamic("renderCenterCenterControls")(js.Any.fromFunction1(renderCenterCenterControls))
    if (renderCenterLeftControls != null) __obj.updateDynamic("renderCenterLeftControls")(js.Any.fromFunction1(renderCenterLeftControls))
    if (renderCenterRightControls != null) __obj.updateDynamic("renderCenterRightControls")(js.Any.fromFunction1(renderCenterRightControls))
    if (renderTopCenterControls != null) __obj.updateDynamic("renderTopCenterControls")(js.Any.fromFunction1(renderTopCenterControls))
    if (renderTopLeftControls != null) __obj.updateDynamic("renderTopLeftControls")(js.Any.fromFunction1(renderTopLeftControls))
    if (renderTopRightControls != null) __obj.updateDynamic("renderTopRightControls")(js.Any.fromFunction1(renderTopRightControls))
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.asInstanceOf[js.Any])
    if (transitionMode != null) __obj.updateDynamic("transitionMode")(transitionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutControls)) __obj.updateDynamic("withoutControls")(withoutControls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.nukaCarousel.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CarouselProps
}

