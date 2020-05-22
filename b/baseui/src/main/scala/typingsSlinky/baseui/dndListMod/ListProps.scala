package typingsSlinky.baseui.dndListMod

import slinky.core.TagMod
import typingsSlinky.baseui.anon.OldIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends js.Object {
  var items: js.UndefOr[js.Array[TagMod[Any]]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ OldIndex, _]] = js.undefined
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  var removable: js.UndefOr[Boolean] = js.undefined
  var removableByMove: js.UndefOr[Boolean] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    items: js.Array[TagMod[Any]] = null,
    onChange: /* args */ OldIndex => _ = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    removableByMove: js.UndefOr[Boolean] = js.undefined
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removableByMove)) __obj.updateDynamic("removableByMove")(removableByMove.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

