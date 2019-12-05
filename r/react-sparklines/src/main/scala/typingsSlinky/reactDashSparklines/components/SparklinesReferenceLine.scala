package typingsSlinky.reactDashSparklines.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesReferenceLineProps
import typingsSlinky.reactDashSparklines.reactDashSparklinesStrings.avg
import typingsSlinky.reactDashSparklines.reactDashSparklinesStrings.custom
import typingsSlinky.reactDashSparklines.reactDashSparklinesStrings.max
import typingsSlinky.reactDashSparklines.reactDashSparklinesStrings.mean
import typingsSlinky.reactDashSparklines.reactDashSparklinesStrings.median
import typingsSlinky.reactDashSparklines.reactDashSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesReferenceLine
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesReferenceLine
    ] {
  @JSImport("react-sparklines", "SparklinesReferenceLine")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    style: CSSProperties = null,
    `type`: max | min | mean | avg | median | custom = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesReferenceLine
  ] = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SparklinesReferenceLineProps
}

