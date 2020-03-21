package typingsSlinky.reactCircularProgressbar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactCircularProgressbar.AnonBackground
import typingsSlinky.reactCircularProgressbar.circularProgressbarMod.default
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CircularProgressbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: AnonBackground,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String,
    value: Double,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CircularProgressbarProps
}

