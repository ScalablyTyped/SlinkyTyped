package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsHighlighted extends js.Object {
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  @JSName("$selected")
  var $selected: Boolean = js.native
}

object IsHighlighted {
  @scala.inline
  def apply($disabled: Boolean, $isHighlighted: Boolean, $selected: Boolean): IsHighlighted = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  @scala.inline
  implicit class IsHighlightedOps[Self <: IsHighlighted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$selected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

