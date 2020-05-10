package typingsSlinky.baseui.progressStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleProps extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  @JSName("$isActive")
  var $isActive: js.UndefOr[Boolean] = js.native
  @JSName("$isCompleted")
  var $isCompleted: js.UndefOr[Boolean] = js.native
}

object StyleProps {
  @scala.inline
  def apply(): StyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleProps]
  }
  @scala.inline
  implicit class StylePropsOps[Self <: StyleProps] (val x: Self) extends AnyVal {
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
    def with$isActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isActive")(js.undefined)
        ret
    }
    @scala.inline
    def with$isCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isCompleted")(js.undefined)
        ret
    }
  }
  
}

