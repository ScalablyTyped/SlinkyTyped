package typingsSlinky.firebaseFirestore.sharedClientStateSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientStateSchema extends js.Object {
  var activeTargetIds: js.Array[Double] = js.native
  var updateTimeMs: Double = js.native
}

object ClientStateSchema {
  @scala.inline
  def apply(activeTargetIds: js.Array[Double], updateTimeMs: Double): ClientStateSchema = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientStateSchema]
  }
  @scala.inline
  implicit class ClientStateSchemaOps[Self <: ClientStateSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTargetIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTargetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

