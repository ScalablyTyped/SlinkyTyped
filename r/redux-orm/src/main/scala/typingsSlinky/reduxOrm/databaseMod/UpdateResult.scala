package typingsSlinky.reduxOrm.databaseMod

import typingsSlinky.reduxOrm.ormMod.IndexedModelClasses
import typingsSlinky.reduxOrm.ormMod.OrmState
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResult[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */, Payload /* <: js.Object */] extends js.Object {
  var payload: Payload = js.native
  var state: OrmState[I] = js.native
  var status: UpdateStatus = js.native
}

object UpdateResult {
  @scala.inline
  def apply[I, Payload](payload: Payload, state: OrmState[I], status: UpdateStatus): UpdateResult[I, Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[I, Payload]]
  }
  @scala.inline
  implicit class UpdateResultOps[Self[i, payload] <: UpdateResult[i, payload], I, Payload] (val x: Self[I, Payload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, Payload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, Payload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, Payload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, Payload]) with Other]
    @scala.inline
    def withPayload(value: Payload): Self[I, Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: OrmState[I]): Self[I, Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: UpdateStatus): Self[I, Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

