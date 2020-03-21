package typingsSlinky.reactEasyChart.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactEasyChart.AnonColorString
import typingsSlinky.reactEasyChart.mod.LegendProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Legend
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactEasyChart.mod.Legend] {
  @JSImport("react-easy-chart", "Legend")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[_],
    dataId: String,
    config: js.Array[AnonColorString] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.Legend] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LegendProps
}

