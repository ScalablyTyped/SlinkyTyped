package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that writes records. Takes one input, produces no outputs.
  */
@js.native
trait SchemaWriteInstruction extends js.Object {
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  /**
    * The sink to write to.
    */
  var sink: js.UndefOr[SchemaSink] = js.native
}

object SchemaWriteInstruction {
  @scala.inline
  def apply(): SchemaWriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteInstruction]
  }
  @scala.inline
  implicit class SchemaWriteInstructionOps[Self <: SchemaWriteInstruction] (val x: Self) extends AnyVal {
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
    def withSink(value: SchemaSink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sink")(js.undefined)
        ret
    }
  }
  
}

