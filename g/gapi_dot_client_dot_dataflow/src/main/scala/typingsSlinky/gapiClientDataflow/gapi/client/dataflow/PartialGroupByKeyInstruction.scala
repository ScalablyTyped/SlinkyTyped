package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialGroupByKeyInstruction extends js.Object {
  /** Describes the input to the partial group-by-key instruction. */
  var input: js.UndefOr[InstructionInput] = js.native
  /** The codec to use for interpreting an element in the input PTable. */
  var inputElementCodec: js.UndefOr[Record[String, _]] = js.native
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.native
  /**
    * If this instruction includes a combining function, this is the name of the
    * CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String] = js.native
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.native
  /** The value combining function to invoke. */
  var valueCombiningFn: js.UndefOr[Record[String, _]] = js.native
}

object PartialGroupByKeyInstruction {
  @scala.inline
  def apply(): PartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGroupByKeyInstruction]
  }
  @scala.inline
  implicit class PartialGroupByKeyInstructionOps[Self <: PartialGroupByKeyInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: InstructionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputElementCodec(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputElementCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputElementCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputElementCodec")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalCombineValuesInputStoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalCombineValuesInputStoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalCombineValuesInputStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalCombineValuesInputStoreName")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalCombineValuesStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalCombineValuesStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalCombineValuesStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalCombineValuesStepName")(js.undefined)
        ret
    }
    @scala.inline
    def withSideInputs(value: js.Array[SideInputInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCombiningFn(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCombiningFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCombiningFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCombiningFn")(js.undefined)
        ret
    }
  }
  
}

