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

@js.native
trait SharedProps extends js.Object {
  /** Defines styles for inputs that are grouped with other controls. */
  @JSName("$adjoined")
  var $adjoined: /* keyof baseui.baseui/input.ADJOINED */ none | left | right | both = js.native
  /** Renders UI in 'disabled' state */
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  /** Renders UI in 'error' state */
  @JSName("$error")
  var $error: Boolean = js.native
  /** Renders UI in 'focus' state */
  @JSName("$isFocused")
  var $isFocused: Boolean = js.native
  @JSName("$position")
  var $position: /* keyof baseui.baseui/input.ENHANCER_POSITION */ start | end = js.native
  /** Renders UI in 'positive' state */
  @JSName("$positive")
  var $positive: Boolean = js.native
  /** Renders UI in 'required' state */
  @JSName("$required")
  var $required: Boolean = js.native
  /** Renders UI in provided size. */
  @JSName("$size")
  var $size: /* keyof baseui.baseui/input.SIZE */ mini | default_ | compact | large_ = js.native
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
  @scala.inline
  implicit class SharedPropsOps[Self <: SharedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$adjoined(value: /* keyof baseui.baseui/input.ADJOINED */ none | left | right | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$adjoined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$error(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$position(value: /* keyof baseui.baseui/input.ENHANCER_POSITION */ start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$positive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$size(value: /* keyof baseui.baseui/input.SIZE */ mini | default_ | compact | large_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

