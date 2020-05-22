package typingsSlinky.baseui.buttonMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.baseuiStrings.button
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.minimal
import typingsSlinky.baseui.baseuiStrings.pill
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.baseui.baseuiStrings.round
import typingsSlinky.baseui.baseuiStrings.secondary
import typingsSlinky.baseui.baseuiStrings.square
import typingsSlinky.baseui.baseuiStrings.submit
import typingsSlinky.baseui.baseuiStrings.tertiary
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends StyletronComponentInjectedProps[ButtonProps] {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var endEnhancer: js.UndefOr[TagMod[Any]] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], _]] = js.undefined
  var overrides: js.UndefOr[ButtonOverrides] = js.undefined
  var shape: js.UndefOr[default_ | pill | round | square] = js.undefined
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
  var startEnhancer: js.UndefOr[TagMod[Any]] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    $as: StyletronBase = null,
    $style: StyleProp[ButtonProps] = null,
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endEnhancer: TagMod[Any] = null,
    href: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    kind: primary | secondary | tertiary | minimal = null,
    onClick: /* event */ SyntheticMouseEvent[HTMLButtonElement] => _ = null,
    overrides: ButtonOverrides = null,
    shape: default_ | pill | round | square = null,
    size: compact | default_ | large_ | mini = null,
    startEnhancer: TagMod[Any] = null,
    target: String = null,
    `type`: submit | reset | button = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if ($as != null) __obj.updateDynamic("$as")($as.asInstanceOf[js.Any])
    if ($style != null) __obj.updateDynamic("$style")($style.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startEnhancer != null) __obj.updateDynamic("startEnhancer")(startEnhancer.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

