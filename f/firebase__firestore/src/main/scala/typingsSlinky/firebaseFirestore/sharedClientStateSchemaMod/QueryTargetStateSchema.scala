package typingsSlinky.firebaseFirestore.sharedClientStateSchemaMod

import typingsSlinky.firebaseFirestore.AnonCode
import typingsSlinky.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTargetStateSchema extends js.Object {
  var error: js.UndefOr[AnonCode] = js.native
  var state: QueryTargetState = js.native
  var updateTimeMs: Double = js.native
}

object QueryTargetStateSchema {
  @scala.inline
  def apply(state: QueryTargetState, updateTimeMs: Double): QueryTargetStateSchema = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTargetStateSchema]
  }
  @scala.inline
  implicit class QueryTargetStateSchemaOps[Self <: QueryTargetStateSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: QueryTargetState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: AnonCode): Self = {
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
  }
  
}

