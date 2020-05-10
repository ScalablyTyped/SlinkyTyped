package typingsSlinky.bitwise

import typingsSlinky.bitwise.bitwiseTypesMod.Bit
import typingsSlinky.bitwise.bitwiseTypesMod.UInt4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
}

object Anon0 {
  @scala.inline
  def apply(read: UInt4 => js.Tuple4[Bit, Bit, Bit, Bit], write: js.Tuple4[Bit, Bit, Bit, Bit] => UInt4): Anon0 = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: UInt4 => js.Tuple4[Bit, Bit, Bit, Bit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: js.Tuple4[Bit, Bit, Bit, Bit] => UInt4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

