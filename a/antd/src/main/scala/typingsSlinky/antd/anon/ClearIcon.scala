package typingsSlinky.antd.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearIcon extends js.Object {
  var clearIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var menuItemSelectedIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var removeIcon: js.UndefOr[TagMod[Any]] = js.undefined
  var suffixIcon: js.UndefOr[TagMod[Any]] = js.undefined
}

object ClearIcon {
  @scala.inline
  def apply(
    clearIcon: TagMod[Any] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuItemSelectedIcon: TagMod[Any] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    removeIcon: TagMod[Any] = null,
    suffixIcon: TagMod[Any] = null
  ): ClearIcon = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearIcon]
  }
}

