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
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends StyletronComponentInjectedProps[ButtonProps] {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endEnhancer: js.UndefOr[TagMod[Any]] = js.native
  var href: js.UndefOr[String] = js.native
  var isLoading: js.UndefOr[Boolean] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], _]] = js.native
  var overrides: js.UndefOr[ButtonOverrides] = js.native
  var shape: js.UndefOr[default_ | pill | round | square] = js.native
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
  var startEnhancer: js.UndefOr[TagMod[Any]] = js.native
  var target: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

