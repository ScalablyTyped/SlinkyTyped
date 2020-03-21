package typingsSlinky.reactCircularProgressbar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactCircularProgressbar.AnonBackground
import typingsSlinky.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircularProgressbarWithChildren
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-circular-progressbar/dist/CircularProgressbarWithChildren", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    value: Double,
    background: js.UndefOr[Boolean] = js.undefined,
    backgroundPadding: Int | Double = null,
    circleRatio: Int | Double = null,
    classes: AnonBackground = null,
    counterClockwise: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    strokeWidth: Int | Double = null,
    styles: CircularProgressbarStyles = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundPadding != null) __obj.updateDynamic("backgroundPadding")(backgroundPadding.asInstanceOf[js.Any])
    if (circleRatio != null) __obj.updateDynamic("circleRatio")(circleRatio.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(counterClockwise)) __obj.updateDynamic("counterClockwise")(counterClockwise.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CircularProgressbarWithChildrenProps
}

