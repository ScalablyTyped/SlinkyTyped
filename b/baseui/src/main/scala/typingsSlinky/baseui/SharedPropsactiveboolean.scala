package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tabs.SharedProps & {  $active ? :boolean} */
@js.native
trait SharedPropsactiveboolean extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.native
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.native
}

object SharedPropsactiveboolean {
  @scala.inline
  def apply(): SharedPropsactiveboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPropsactiveboolean]
  }
  @scala.inline
  implicit class SharedPropsactivebooleanOps[Self <: SharedPropsactiveboolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$active(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$active: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$active")(js.undefined)
        ret
    }
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
    def with$orientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$orientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$orientation")(js.undefined)
        ret
    }
  }
  
}

