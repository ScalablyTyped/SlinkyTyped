package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.native
  /** The sink to write to. */
  var sink: js.UndefOr[Sink] = js.native
}

object WriteInstruction {
  @scala.inline
  def apply(): WriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteInstruction]
  }
  @scala.inline
  implicit class WriteInstructionOps[Self <: WriteInstruction] (val x: Self) extends AnyVal {
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
    def withSink(value: Sink): Self = {
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

