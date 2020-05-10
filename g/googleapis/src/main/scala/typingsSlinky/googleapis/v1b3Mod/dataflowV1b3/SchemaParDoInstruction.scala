package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that does a ParDo operation. Takes one main input and zero
  * or more side inputs, and produces zero or more outputs. Runs user code.
  */
@js.native
trait SchemaParDoInstruction extends js.Object {
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  /**
    * Information about each of the outputs, if user_fn is a  MultiDoFn.
    */
  var multiOutputInfos: js.UndefOr[js.Array[SchemaMultiOutputInfo]] = js.native
  /**
    * The number of outputs.
    */
  var numOutputs: js.UndefOr[Double] = js.native
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaParDoInstruction {
  @scala.inline
  def apply(): SchemaParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParDoInstruction]
  }
  @scala.inline
  implicit class SchemaParDoInstructionOps[Self <: SchemaParDoInstruction] (val x: Self) extends AnyVal {
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
    def withMultiOutputInfos(value: js.Array[SchemaMultiOutputInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiOutputInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiOutputInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiOutputInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withNumOutputs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOutputs")(js.undefined)
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
    def withUserFn(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFn")(js.undefined)
        ret
    }
  }
  
}

