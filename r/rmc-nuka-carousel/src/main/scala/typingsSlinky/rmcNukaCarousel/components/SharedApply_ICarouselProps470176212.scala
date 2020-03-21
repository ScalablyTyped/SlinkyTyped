package typingsSlinky.rmcNukaCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rmcNukaCarousel.carouselMod.ICarouselProps
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ICarouselProps470176212[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    afterSlide: /* index */ Double => Unit = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    beforeSlide: (/* currentIndex */ Double, /* endIndex */ Double) => Unit = null,
    cellAlign: left | center | right = null,
    cellSpacing: Int | Double = null,
    data: () => Unit = null,
    decorators: js.Array[_] = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easing: js.Function = null,
    edgeEasing: js.Function = null,
    frameOverflow: String = null,
    framePadding: String = null,
    initialSlideHeight: Int | Double = null,
    initialSlideWidth: Int | Double = null,
    resetAutoplay: js.UndefOr[Boolean] = js.undefined,
    slideIndex: Int | Double = null,
    slideWidth: String | Double = null,
    slidesToScroll: Double | auto = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    style: js.Any = null,
    swipeSpeed: Int | Double = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: String = null,
    wrapAround: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction0(data))
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing.asInstanceOf[js.Any])
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding.asInstanceOf[js.Any])
    if (initialSlideHeight != null) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(resetAutoplay)) __obj.updateDynamic("resetAutoplay")(resetAutoplay.asInstanceOf[js.Any])
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeSpeed != null) __obj.updateDynamic("swipeSpeed")(swipeSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ICarouselProps
}

