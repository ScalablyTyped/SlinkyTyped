package typingsSlinky.nivoTooltip.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.nivoTooltip.Pickanytooltip
import typingsSlinky.nivoTooltip.mod.BasicTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BasicTooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.nivoTooltip.mod.BasicTooltip] {
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    color: String,
    id: TagMod[Any],
    theme: Pickanytooltip,
    enableChip: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double | String => Double | String = null,
    renderContent: () => TagMod[Any] = null,
    value: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.nivoTooltip.mod.BasicTooltip] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(enableChip)) __obj.updateDynamic("enableChip")(enableChip.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BasicTooltipProps
}

