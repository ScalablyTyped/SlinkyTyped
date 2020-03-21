package typingsSlinky.antdMobileRn.popoverPropsTypeMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverPropsType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
  var overlay: TagMod[Any]
}

object PopoverPropsType {
  @scala.inline
  def apply(
    overlay: TagMod[Any],
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null
  ): PopoverPropsType = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    __obj.asInstanceOf[PopoverPropsType]
  }
}

