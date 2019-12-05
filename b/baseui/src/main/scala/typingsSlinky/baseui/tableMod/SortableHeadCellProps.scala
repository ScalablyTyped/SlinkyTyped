package typingsSlinky.baseui.tableMod

import slinky.core.TagMod
import typingsSlinky.baseui.Anon_HeadCell
import typingsSlinky.baseui.baseuiStrings.ASC
import typingsSlinky.baseui.baseuiStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableHeadCellProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var direction: ASC | DESC | Null
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fillClickTarget: js.UndefOr[Boolean] = js.undefined
  var onSort: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[Anon_HeadCell] = js.undefined
  var title: String
}

object SortableHeadCellProps {
  @scala.inline
  def apply(
    title: String,
    children: TagMod[Any] = null,
    direction: ASC | DESC = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fillClickTarget: js.UndefOr[Boolean] = js.undefined,
    onSort: () => _ = null,
    overrides: Anon_HeadCell = null
  ): SortableHeadCellProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fillClickTarget)) __obj.updateDynamic("fillClickTarget")(fillClickTarget.asInstanceOf[js.Any])
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction0(onSort))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableHeadCellProps]
  }
}

