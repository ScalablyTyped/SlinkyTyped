package typingsSlinky.reactSparklines.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSparklines.mod.SparklinesReferenceLineProps
import typingsSlinky.reactSparklines.reactSparklinesStrings.avg
import typingsSlinky.reactSparklines.reactSparklinesStrings.custom
import typingsSlinky.reactSparklines.reactSparklinesStrings.max
import typingsSlinky.reactSparklines.reactSparklinesStrings.mean
import typingsSlinky.reactSparklines.reactSparklinesStrings.median
import typingsSlinky.reactSparklines.reactSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesReferenceLine
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSparklines.mod.SparklinesReferenceLine] {
  @JSImport("react-sparklines", "SparklinesReferenceLine")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    `type`: max | min | mean | avg | median | custom = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesReferenceLine] = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesReferenceLine] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactSparklines.mod.SparklinesReferenceLine](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SparklinesReferenceLineProps
}

