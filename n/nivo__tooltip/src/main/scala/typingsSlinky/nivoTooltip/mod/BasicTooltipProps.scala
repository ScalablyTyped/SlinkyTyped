package typingsSlinky.nivoTooltip.mod

import slinky.core.TagMod
import typingsSlinky.nivoTooltip.anon.Pickanytooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicTooltipProps extends js.Object {
  var color: String
  var enableChip: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Function1[/* value */ Double | String, Double | String]] = js.undefined
  var id: TagMod[Any]
  var renderContent: js.UndefOr[js.Function0[TagMod[Any]]] = js.undefined
  var theme: Pickanytooltip
  var value: js.UndefOr[String | Double] = js.undefined
}

object BasicTooltipProps {
  @scala.inline
  def apply(
    color: String,
    theme: Pickanytooltip,
    enableChip: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double | String => Double | String = null,
    id: TagMod[Any] = null,
    renderContent: () => TagMod[Any] = null,
    value: String | Double = null
  ): BasicTooltipProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(enableChip)) __obj.updateDynamic("enableChip")(enableChip.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (renderContent != null) __obj.updateDynamic("renderContent")(js.Any.fromFunction0(renderContent))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicTooltipProps]
  }
}

