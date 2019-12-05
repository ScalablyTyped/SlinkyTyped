package typingsSlinky.atNivoTooltip.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoTooltip.PickimportwarningtransformsQualifyReferencesresolv
import typingsSlinky.atNivoTooltip.atNivoTooltipMod.BasicTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BasicTooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoTooltip.atNivoTooltipMod.BasicTooltip] {
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: value */
  def apply(
    color: String,
    id: TagMod[Any],
    theme: PickimportwarningtransformsQualifyReferencesresolv,
    enableChip: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double | String => Double | String = null,
    renderContent: () => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoTooltip.atNivoTooltipMod.BasicTooltip] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(enableChip)) __obj.updateDynamic("enableChip")(enableChip.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BasicTooltipProps
}

