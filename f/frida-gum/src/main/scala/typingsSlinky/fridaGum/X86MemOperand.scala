package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Base
import typingsSlinky.fridaGum.fridaGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X86MemOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: mem = js.native
  var value: Base = js.native
}

object X86MemOperand {
  @scala.inline
  def apply(size: Double, `type`: mem, value: Base): X86MemOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86MemOperand]
  }
  @scala.inline
  implicit class X86MemOperandOps[Self <: X86MemOperand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: mem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

