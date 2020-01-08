package typingsSlinky.reactDashCountdownDashCircleDashTimer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCountdownDashCircleDashTimer.reactDashCountdownDashCircleDashTimerMod.ColorType
import typingsSlinky.reactDashCountdownDashCircleDashTimer.reactDashCountdownDashCircleDashTimerMod.StrokeLinecapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CountdownCircleTimer
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashCountdownDashCircleDashTimer.reactDashCountdownDashCircleDashTimerMod.CountdownCircleTimer
    ] {
  @JSImport("react-countdown-circle-timer", "CountdownCircleTimer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    colors: ColorType,
    durationSeconds: Double,
    gradientUniqueKey: String = null,
    isLinearGradient: js.UndefOr[Boolean] = js.undefined,
    isPlaying: js.UndefOr[Boolean] = js.undefined,
    onComplete: () => js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit] = null,
    renderTime: (/* remainingTime */ Double, /* elapsedTime */ Double, /* isPlaying */ Boolean) => TagMod[Any] = null,
    strokeLinecap: StrokeLinecapType = null,
    strokeWidth: Int | Double = null,
    trailColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCountdownDashCircleDashTimer.reactDashCountdownDashCircleDashTimerMod.CountdownCircleTimer
  ] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], durationSeconds = durationSeconds.asInstanceOf[js.Any])
    if (gradientUniqueKey != null) __obj.updateDynamic("gradientUniqueKey")(gradientUniqueKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isLinearGradient)) __obj.updateDynamic("isLinearGradient")(isLinearGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlaying)) __obj.updateDynamic("isPlaying")(isPlaying.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (renderTime != null) __obj.updateDynamic("renderTime")(js.Any.fromFunction3(renderTime))
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashCountdownDashCircleDashTimer.reactDashCountdownDashCircleDashTimerMod.Props
}

