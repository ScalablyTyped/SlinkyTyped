package typingsSlinky.atNivoTooltip.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoTooltip.PickimportwarningtransformsQualifyReferencesresolv
import typingsSlinky.atNivoTooltip.atNivoTooltipMod.TableTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableTooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoTooltip.atNivoTooltipMod.TableTooltip] {
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    rows: js.Array[js.Array[TagMod[Any]]],
    theme: PickimportwarningtransformsQualifyReferencesresolv,
    renderContent: () => TagMod[Any] = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoTooltip.atNivoTooltipMod.TableTooltip] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableTooltipProps
}

