package typingsSlinky.reactDashLottie.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLottie.reactDashLottieMod.EventListener
import typingsSlinky.reactDashLottie.reactDashLottieMod.LottieProps
import typingsSlinky.reactDashLottie.reactDashLottieMod.Options
import typingsSlinky.reactDashLottie.reactDashLottieMod.default
import typingsSlinky.reactDashLottie.reactDashLottieStrings.animation
import typingsSlinky.reactDashLottie.reactDashLottieStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashLottie
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lottie", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: height, width */
  def apply(
    options: Options,
    ariaLabel: String | animation = null,
    ariaRole: String | button = null,
    direction: Int | Double = null,
    eventListeners: js.Array[EventListener] = null,
    isClickToPauseDisabled: js.UndefOr[Boolean] = js.undefined,
    isPaused: js.UndefOr[Boolean] = js.undefined,
    isStopped: js.UndefOr[Boolean] = js.undefined,
    segments: js.Array[Double] = null,
    speed: Int | Double = null,
    title: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (eventListeners != null) __obj.updateDynamic("eventListeners")(eventListeners.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickToPauseDisabled)) __obj.updateDynamic("isClickToPauseDisabled")(isClickToPauseDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused.asInstanceOf[js.Any])
    if (!js.isUndefined(isStopped)) __obj.updateDynamic("isStopped")(isStopped.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LottieProps
}

