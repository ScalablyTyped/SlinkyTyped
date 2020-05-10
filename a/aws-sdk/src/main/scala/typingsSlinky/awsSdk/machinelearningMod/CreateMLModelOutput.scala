package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMLModelOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request. 
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
}

object CreateMLModelOutput {
  @scala.inline
  def apply(): CreateMLModelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMLModelOutput]
  }
  @scala.inline
  implicit class CreateMLModelOutputOps[Self <: CreateMLModelOutput] (val x: Self) extends AnyVal {
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
    def withoutMLModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(js.undefined)
        ret
    }
  }
  
}

