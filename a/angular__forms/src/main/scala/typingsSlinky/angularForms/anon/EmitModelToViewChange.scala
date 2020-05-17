package typingsSlinky.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitModelToViewChange extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.native
  var emitModelToViewChange: js.UndefOr[Boolean] = js.native
  var emitViewToModelChange: js.UndefOr[Boolean] = js.native
  var onlySelf: js.UndefOr[Boolean] = js.native
}

object EmitModelToViewChange {
  @scala.inline
  def apply(): EmitModelToViewChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitModelToViewChange]
  }
  @scala.inline
  implicit class EmitModelToViewChangeOps[Self <: EmitModelToViewChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitModelToViewChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitModelToViewChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitModelToViewChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitModelToViewChange")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitViewToModelChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitViewToModelChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitViewToModelChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitViewToModelChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlySelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(js.undefined)
        ret
    }
  }
  
}

