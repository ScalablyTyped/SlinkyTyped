package typingsSlinky.reactNativeSvgCharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvgCharts.mod.ProgressCircleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressCircle
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeSvgCharts.mod.ProgressCircle] {
  @JSImport("react-native-svg-charts", "ProgressCircle")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    progress: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animateDuration: Int | Double = null,
    backgroundColor: String = null,
    endAngle: Int | Double = null,
    progressColor: String = null,
    startAngle: Int | Double = null,
    strokeWidth: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.ProgressCircle] = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animateDuration != null) __obj.updateDynamic("animateDuration")(animateDuration.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProgressCircleProps
}

