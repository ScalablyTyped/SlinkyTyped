package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictInput extends js.Object {
  /**
    * A unique identifier of the MLModel.
    */
  var MLModelId: EntityId = js.native
  var PredictEndpoint: VipURL = js.native
  var Record: typingsSlinky.awsSdk.machinelearningMod.Record = js.native
}

object PredictInput {
  @scala.inline
  def apply(MLModelId: EntityId, PredictEndpoint: VipURL, Record: Record): PredictInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any], PredictEndpoint = PredictEndpoint.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictInput]
  }
  @scala.inline
  implicit class PredictInputOps[Self <: PredictInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMLModelId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredictEndpoint(value: VipURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecord(value: Record): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Record")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

