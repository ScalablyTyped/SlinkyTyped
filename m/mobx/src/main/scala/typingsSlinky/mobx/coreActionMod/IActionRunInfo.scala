package typingsSlinky.mobx.coreActionMod

import typingsSlinky.mobx.derivationMod.IDerivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionRunInfo extends js.Object {
  var actionId: Double = js.native
  var error: js.UndefOr[js.Any] = js.native
  var notifySpy: Boolean = js.native
  var parentActionId: Double = js.native
  var prevAllowStateChanges: Boolean = js.native
  var prevAllowStateReads: Boolean = js.native
  var prevDerivation: IDerivation | Null = js.native
  var startTime: Double = js.native
}

object IActionRunInfo {
  @scala.inline
  def apply(
    actionId: Double,
    notifySpy: Boolean,
    parentActionId: Double,
    prevAllowStateChanges: Boolean,
    prevAllowStateReads: Boolean,
    startTime: Double
  ): IActionRunInfo = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], notifySpy = notifySpy.asInstanceOf[js.Any], parentActionId = parentActionId.asInstanceOf[js.Any], prevAllowStateChanges = prevAllowStateChanges.asInstanceOf[js.Any], prevAllowStateReads = prevAllowStateReads.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionRunInfo]
  }
  @scala.inline
  implicit class IActionRunInfoOps[Self <: IActionRunInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifySpy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySpy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentActionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentActionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevAllowStateChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevAllowStateChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevAllowStateReads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevAllowStateReads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevDerivation(value: IDerivation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevDerivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevDerivationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevDerivation")(null)
        ret
    }
  }
  
}

