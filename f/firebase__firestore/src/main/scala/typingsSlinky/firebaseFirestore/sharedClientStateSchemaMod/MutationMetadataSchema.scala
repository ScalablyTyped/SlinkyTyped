package typingsSlinky.firebaseFirestore.sharedClientStateSchemaMod

import typingsSlinky.firebaseFirestore.AnonCode
import typingsSlinky.firebaseFirestore.typesMod.MutationBatchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationMetadataSchema extends js.Object {
  var error: js.UndefOr[AnonCode] = js.native
  var state: MutationBatchState = js.native
  var updateTimeMs: Double = js.native
}

object MutationMetadataSchema {
  @scala.inline
  def apply(state: MutationBatchState, updateTimeMs: Double): MutationMetadataSchema = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationMetadataSchema]
  }
  @scala.inline
  implicit class MutationMetadataSchemaOps[Self <: MutationMetadataSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: MutationBatchState): Self = {
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

