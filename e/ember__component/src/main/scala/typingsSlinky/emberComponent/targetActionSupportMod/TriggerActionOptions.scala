package typingsSlinky.emberComponent.targetActionSupportMod

import typingsSlinky.emberObject.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
@js.native
trait TriggerActionOptions extends js.Object {
  var action: js.UndefOr[String] = js.native
  var actionContext: js.UndefOr[default] = js.native
  var target: js.UndefOr[default] = js.native
}

object TriggerActionOptions {
  @scala.inline
  def apply(): TriggerActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerActionOptions]
  }
  @scala.inline
  implicit class TriggerActionOptionsOps[Self <: TriggerActionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withActionContext(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionContext")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

