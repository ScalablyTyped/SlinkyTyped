package typingsSlinky.baseui.inputMod

import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.end
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  /** Defines styles for inputs that are grouped with other controls. */
  @JSName("$adjoined")
  var $adjoined: /* keyof baseui.baseui/input.ADJOINED */ none | left | right | both
  /** Renders UI in 'disabled' state */
  @JSName("$disabled")
  var $disabled: Boolean
  /** Renders UI in 'error' state */
  @JSName("$error")
  var $error: Boolean
  /** Renders UI in 'focus' state */
  @JSName("$isFocused")
  var $isFocused: Boolean
  @JSName("$position")
  var $position: /* keyof baseui.baseui/input.ENHANCER_POSITION */ start | end
  /** Renders UI in 'positive' state */
  @JSName("$positive")
  var $positive: Boolean
  /** Renders UI in 'required' state */
  @JSName("$required")
  var $required: Boolean
  /** Renders UI in provided size. */
  @JSName("$size")
  var $size: /* keyof baseui.baseui/input.SIZE */ mini | default_ | compact | large_
}

object SharedProps {
  @scala.inline
  def apply(
    $adjoined: /* keyof baseui.baseui/input.ADJOINED */ none | left | right | both,
    $disabled: Boolean,
    $error: Boolean,
    $isFocused: Boolean,
    $position: /* keyof baseui.baseui/input.ENHANCER_POSITION */ start | end,
    $positive: Boolean,
    $required: Boolean,
    $size: /* keyof baseui.baseui/input.SIZE */ mini | default_ | compact | large_
  ): SharedProps = {
    val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}

