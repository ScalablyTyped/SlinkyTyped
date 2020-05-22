package typingsSlinky.baseui.formControlMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlProps extends js.Object {
  var caption: js.UndefOr[TagMod[Any]] = js.undefined
  var children: TagMod[Any]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean | TagMod[Any]] = js.undefined
  var label: js.UndefOr[TagMod[Any]] = js.undefined
  var overrides: js.UndefOr[FormControlOverrides] = js.undefined
  var positive: js.UndefOr[TagMod[Any]] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    caption: TagMod[Any] = null,
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: Boolean | TagMod[Any] = null,
    label: TagMod[Any] = null,
    overrides: FormControlOverrides = null,
    positive: TagMod[Any] = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (positive != null) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlProps]
  }
}

