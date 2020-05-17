package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instruction extends js.Object {
  var instruction: js.UndefOr[String] = js.native
}

object Instruction {
  @scala.inline
  def apply(): Instruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instruction]
  }
  @scala.inline
  implicit class InstructionOps[Self <: Instruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(js.undefined)
        ret
    }
  }
  
}

