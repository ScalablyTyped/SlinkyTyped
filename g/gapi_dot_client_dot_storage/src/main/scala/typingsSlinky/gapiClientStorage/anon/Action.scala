package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /** The action to take. */
  var action: js.UndefOr[StorageClass] = js.native
  /** The condition(s) under which the action will be taken. */
  var condition: js.UndefOr[Age] = js.native
}

object Action {
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: StorageClass): Self = {
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
    def withCondition(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
  }
  
}

