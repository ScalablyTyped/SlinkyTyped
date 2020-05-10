package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstructionInput extends js.Object {
  /** The output index (origin zero) within the producer. */
  var outputNum: js.UndefOr[Double] = js.native
  /**
    * The index (origin zero) of the parallel instruction that produces
    * the output to be consumed by this input.  This index is relative
    * to the list of instructions in this input's instruction's
    * containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[Double] = js.native
}

object InstructionInput {
  @scala.inline
  def apply(): InstructionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstructionInput]
  }
  @scala.inline
  implicit class InstructionInputOps[Self <: InstructionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputNum")(js.undefined)
        ret
    }
    @scala.inline
    def withProducerInstructionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerInstructionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducerInstructionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerInstructionIndex")(js.undefined)
        ret
    }
  }
  
}

