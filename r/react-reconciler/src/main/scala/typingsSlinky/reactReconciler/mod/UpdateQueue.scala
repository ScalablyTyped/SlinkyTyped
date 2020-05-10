package typingsSlinky.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQueue[State] extends js.Object {
  var baseState: State = js.native
  var firstCapturedEffect: Update[State] | Null = js.native
  var firstCapturedUpdate: Update[State] | Null = js.native
  var firstEffect: Update[State] | Null = js.native
  var firstUpdate: Update[State] | Null = js.native
  var lastCapturedEffect: Update[State] | Null = js.native
  var lastCapturedUpdate: Update[State] | Null = js.native
  var lastEffect: Update[State] | Null = js.native
  var lastUpdate: Update[State] | Null = js.native
}

object UpdateQueue {
  @scala.inline
  def apply[State](baseState: State): UpdateQueue[State] = {
    val __obj = js.Dynamic.literal(baseState = baseState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueue[State]]
  }
  @scala.inline
  implicit class UpdateQueueOps[Self[state] <: UpdateQueue[state], State] (val x: Self[State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[State] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[State] with Other]
    @scala.inline
    def withBaseState(value: State): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstCapturedEffect(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCapturedEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstCapturedEffectNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCapturedEffect")(null)
        ret
    }
    @scala.inline
    def withFirstCapturedUpdate(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCapturedUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstCapturedUpdateNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCapturedUpdate")(null)
        ret
    }
    @scala.inline
    def withFirstEffect(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstEffectNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstEffect")(null)
        ret
    }
    @scala.inline
    def withFirstUpdate(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstUpdateNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstUpdate")(null)
        ret
    }
    @scala.inline
    def withLastCapturedEffect(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCapturedEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastCapturedEffectNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCapturedEffect")(null)
        ret
    }
    @scala.inline
    def withLastCapturedUpdate(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCapturedUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastCapturedUpdateNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCapturedUpdate")(null)
        ret
    }
    @scala.inline
    def withLastEffect(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastEffectNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEffect")(null)
        ret
    }
    @scala.inline
    def withLastUpdate(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdateNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdate")(null)
        ret
    }
  }
  
}

