package typingsSlinky.reactDashAliceDashCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAliceDashCarousel.reactDashAliceDashCarouselMod.EventObject
import typingsSlinky.reactDashAliceDashCarousel.reactDashAliceDashCarouselMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashAliceDashCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-alice-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoPlayActionDisabled: js.UndefOr[Boolean] = js.undefined,
    autoPlayDirection: String = null,
    autoPlayInterval: Int | Double = null,
    buttonsDisabled: js.UndefOr[Boolean] = js.undefined,
    disableAutoPlayOnAction: js.UndefOr[Boolean] = js.undefined,
    dotsDisabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    fadeOutAnimation: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[js.Object] = null,
    keysControlDisabled: js.UndefOr[Boolean] = js.undefined,
    mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    onInitialized: /* e */ EventObject => Unit = null,
    onResized: /* e */ EventObject => Unit = null,
    onSlideChange: /* e */ EventObject => Unit = null,
    onSlideChanged: /* e */ EventObject => Unit = null,
    playButtonEnabled: js.UndefOr[Boolean] = js.undefined,
    preventEventOnTouchMove: js.UndefOr[Boolean] = js.undefined,
    responsive: js.Object = null,
    shouldHandleResizeEvent: /* e */ js.Any => Boolean = null,
    showSlideInfo: js.UndefOr[Boolean] = js.undefined,
    slideToIndex: Int | Double = null,
    stagePadding: js.Object = null,
    startIndex: Int | Double = null,
    stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined,
    swipeDisabled: js.UndefOr[Boolean] = js.undefined,
    touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlayActionDisabled)) __obj.updateDynamic("autoPlayActionDisabled")(autoPlayActionDisabled.asInstanceOf[js.Any])
    if (autoPlayDirection != null) __obj.updateDynamic("autoPlayDirection")(autoPlayDirection.asInstanceOf[js.Any])
    if (autoPlayInterval != null) __obj.updateDynamic("autoPlayInterval")(autoPlayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonsDisabled)) __obj.updateDynamic("buttonsDisabled")(buttonsDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPlayOnAction)) __obj.updateDynamic("disableAutoPlayOnAction")(disableAutoPlayOnAction.asInstanceOf[js.Any])
    if (!js.isUndefined(dotsDisabled)) __obj.updateDynamic("dotsDisabled")(dotsDisabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOutAnimation)) __obj.updateDynamic("fadeOutAnimation")(fadeOutAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(keysControlDisabled)) __obj.updateDynamic("keysControlDisabled")(keysControlDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseTrackingEnabled)) __obj.updateDynamic("mouseTrackingEnabled")(mouseTrackingEnabled.asInstanceOf[js.Any])
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onResized != null) __obj.updateDynamic("onResized")(js.Any.fromFunction1(onResized))
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction1(onSlideChange))
    if (onSlideChanged != null) __obj.updateDynamic("onSlideChanged")(js.Any.fromFunction1(onSlideChanged))
    if (!js.isUndefined(playButtonEnabled)) __obj.updateDynamic("playButtonEnabled")(playButtonEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(preventEventOnTouchMove)) __obj.updateDynamic("preventEventOnTouchMove")(preventEventOnTouchMove.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (shouldHandleResizeEvent != null) __obj.updateDynamic("shouldHandleResizeEvent")(js.Any.fromFunction1(shouldHandleResizeEvent))
    if (!js.isUndefined(showSlideInfo)) __obj.updateDynamic("showSlideInfo")(showSlideInfo.asInstanceOf[js.Any])
    if (slideToIndex != null) __obj.updateDynamic("slideToIndex")(slideToIndex.asInstanceOf[js.Any])
    if (stagePadding != null) __obj.updateDynamic("stagePadding")(stagePadding.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeDisabled)) __obj.updateDynamic("swipeDisabled")(swipeDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTrackingEnabled)) __obj.updateDynamic("touchTrackingEnabled")(touchTrackingEnabled.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashAliceDashCarousel.reactDashAliceDashCarouselMod.Props
}

