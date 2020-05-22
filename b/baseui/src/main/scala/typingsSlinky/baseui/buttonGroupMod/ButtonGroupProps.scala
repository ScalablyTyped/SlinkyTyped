package typingsSlinky.baseui.buttonGroupMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.baseuiStrings.checkbox
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.minimal
import typingsSlinky.baseui.baseuiStrings.pill
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.radio
import typingsSlinky.baseui.baseuiStrings.round
import typingsSlinky.baseui.baseuiStrings.secondary
import typingsSlinky.baseui.baseuiStrings.square
import typingsSlinky.baseui.baseuiStrings.tertiary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var children: TagMod[Any]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.undefined
  var mode: js.UndefOr[checkbox | radio] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLButtonElement], /* index */ Double, _]
  ] = js.undefined
  var overrides: js.UndefOr[ButtonGroupOverrides] = js.undefined
  var selected: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var shape: js.UndefOr[default_ | pill | round | square] = js.undefined
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    kind: primary | secondary | tertiary | minimal = null,
    mode: checkbox | radio = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLButtonElement], /* index */ Double) => _ = null,
    overrides: ButtonGroupOverrides = null,
    selected: Double | js.Array[Double] = null,
    shape: default_ | pill | round | square = null,
    size: compact | default_ | large_ | mini = null
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

