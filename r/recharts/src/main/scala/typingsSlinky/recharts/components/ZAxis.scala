package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.mod.DataKey
import typingsSlinky.recharts.mod.RechartsFunction
import typingsSlinky.recharts.mod.ScaleType
import typingsSlinky.recharts.mod.ZAxisProps
import typingsSlinky.recharts.rechartsStrings.category
import typingsSlinky.recharts.rechartsStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ZAxis
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.mod.ZAxis] {
  @JSImport("recharts", "ZAxis")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    dataKey: DataKey = null,
    name: String | Double = null,
    range: js.Array[Double] = null,
    scale: ScaleType | RechartsFunction = null,
    `type`: number | category = null,
    unit: String | Double = null,
    zAxisId: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.mod.ZAxis] = {
    val __obj = js.Dynamic.literal()
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (zAxisId != null) __obj.updateDynamic("zAxisId")(zAxisId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.mod.ZAxis] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.mod.ZAxis](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ZAxisProps
}

