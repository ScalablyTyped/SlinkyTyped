package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that copies its inputs (zero or more) to its (single)
  * output.
  */
@js.native
trait SchemaFlattenInstruction extends js.Object {
  /**
    * Describes the inputs to the flatten instruction.
    */
  var inputs: js.UndefOr[js.Array[SchemaInstructionInput]] = js.native
}

object SchemaFlattenInstruction {
  @scala.inline
  def apply(): SchemaFlattenInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlattenInstruction]
  }
  @scala.inline
  implicit class SchemaFlattenInstructionOps[Self <: SchemaFlattenInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: js.Array[SchemaInstructionInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
  }
  
}

