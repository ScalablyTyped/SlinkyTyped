package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that does a partial group-by-key. One input and one output.
  */
@js.native
trait SchemaPartialGroupByKeyInstruction extends js.Object {
  /**
    * Describes the input to the partial group-by-key instruction.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  /**
    * The codec to use for interpreting an element in the input PTable.
    */
  var inputElementCodec: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.native
  /**
    * If this instruction includes a combining function, this is the name of
    * the CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String] = js.native
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  /**
    * The value combining function to invoke.
    */
  var valueCombiningFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaPartialGroupByKeyInstruction {
  @scala.inline
  def apply(): SchemaPartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartialGroupByKeyInstruction]
  }
  @scala.inline
  implicit class SchemaPartialGroupByKeyInstructionOps[Self <: SchemaPartialGroupByKeyInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: SchemaInstructionInput): Self = {
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
    def withInputElementCodec(value: StringDictionary[js.Any]): Self = {
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
    def withSideInputs(value: js.Array[SchemaSideInputInfo]): Self = {
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
    def withValueCombiningFn(value: StringDictionary[js.Any]): Self = {
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

