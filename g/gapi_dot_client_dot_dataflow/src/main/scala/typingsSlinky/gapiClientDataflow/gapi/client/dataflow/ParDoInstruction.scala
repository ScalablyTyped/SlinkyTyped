package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParDoInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.native
  /** Information about each of the outputs, if user_fn is a  MultiDoFn. */
  var multiOutputInfos: js.UndefOr[js.Array[MultiOutputInfo]] = js.native
  /** The number of outputs. */
  var numOutputs: js.UndefOr[Double] = js.native
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.native
  /** The user function to invoke. */
  var userFn: js.UndefOr[Record[String, _]] = js.native
}

object ParDoInstruction {
  @scala.inline
  def apply(): ParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParDoInstruction]
  }
  @scala.inline
  implicit class ParDoInstructionOps[Self <: ParDoInstruction] (val x: Self) extends AnyVal {
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
    def withMultiOutputInfos(value: js.Array[MultiOutputInfo]): Self = {
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
    def withUserFn(value: Record[String, _]): Self = {
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

