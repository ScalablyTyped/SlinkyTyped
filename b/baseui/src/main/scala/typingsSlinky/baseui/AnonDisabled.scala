package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabled extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  @JSName("$selected")
  var $selected: js.UndefOr[Boolean] = js.native
}

object AnonDisabled {
  @scala.inline
  def apply(): AnonDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisabled]
  }
  @scala.inline
  implicit class AnonDisabledOps[Self <: AnonDisabled] (val x: Self) extends AnyVal {
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
    def without$disabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(js.undefined)
        ret
    }
    @scala.inline
    def with$isHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHighlighted")(js.undefined)
        ret
    }
    @scala.inline
    def with$selected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$selected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selected")(js.undefined)
        ret
    }
  }
  
}

