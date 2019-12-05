package typingsSlinky.reactDashMotionDashSlider.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMotion.reactDashMotionMod.OpaqueConfig
import typingsSlinky.reactDashMotionDashSlider.reactDashMotionDashSliderMod.SliderProps
import typingsSlinky.reactDashMotionDashSlider.reactDashMotionDashSliderMod.default
import typingsSlinky.reactDashMotionDashSlider.reactDashMotionDashSliderStrings.center
import typingsSlinky.reactDashMotionDashSlider.reactDashMotionDashSliderStrings.left
import typingsSlinky.reactDashMotionDashSlider.reactDashMotionDashSliderStrings.mouse
import typingsSlinky.reactDashMotionDashSlider.reactDashMotionDashSliderStrings.right
import typingsSlinky.reactDashMotionDashSlider.reactDashMotionDashSliderStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashMotionDashSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-motion-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    afterSlide: /* currentIndex */ Double => Unit = null,
    align: left | center | right = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    beforeSlide: (/* currentIndex */ Double, /* nextIndex */ Double) => Unit = null,
    currentIndex: Int | Double = null,
    currentKey: String | Double = null,
    flickTimeout: Int | Double = null,
    slidesToMove: Int | Double = null,
    slidesToShow: Int | Double = null,
    springConfig: OpaqueConfig = null,
    swipe: Boolean | touch | mouse = null,
    swipeThreshold: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (currentIndex != null) __obj.updateDynamic("currentIndex")(currentIndex.asInstanceOf[js.Any])
    if (currentKey != null) __obj.updateDynamic("currentKey")(currentKey.asInstanceOf[js.Any])
    if (flickTimeout != null) __obj.updateDynamic("flickTimeout")(flickTimeout.asInstanceOf[js.Any])
    if (slidesToMove != null) __obj.updateDynamic("slidesToMove")(slidesToMove.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SliderProps
}

