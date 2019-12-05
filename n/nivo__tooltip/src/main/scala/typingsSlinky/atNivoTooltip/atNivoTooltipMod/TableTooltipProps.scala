package typingsSlinky.atNivoTooltip.atNivoTooltipMod

import slinky.core.TagMod
import typingsSlinky.atNivoTooltip.PickimportwarningtransformsQualifyReferencesresolv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTooltipProps extends js.Object {
  var renderContent: js.UndefOr[js.Function0[TagMod[Any]]] = js.undefined
  var rows: js.Array[js.Array[TagMod[Any]]]
  var theme: PickimportwarningtransformsQualifyReferencesresolv
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object TableTooltipProps {
  @scala.inline
  def apply(
    rows: js.Array[js.Array[TagMod[Any]]],
    theme: PickimportwarningtransformsQualifyReferencesresolv,
    renderContent: () => TagMod[Any] = null,
    title: TagMod[Any] = null
  ): TableTooltipProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTooltipProps]
  }
}

