package typingsSlinky.bitwise

import typingsSlinky.bitwise.bitwiseTypesMod.Bit
import typingsSlinky.bitwise.bitwiseTypesMod.UInt8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReadWrite extends js.Object {
  def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = js.native
  def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = js.native
}

object AnonReadWrite {
  @scala.inline
  def apply(
    read: UInt8 => js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit],
    write: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] => UInt8
  ): AnonReadWrite = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[AnonReadWrite]
  }
  @scala.inline
  implicit class AnonReadWriteOps[Self <: AnonReadWrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: UInt8 => js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] => UInt8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

