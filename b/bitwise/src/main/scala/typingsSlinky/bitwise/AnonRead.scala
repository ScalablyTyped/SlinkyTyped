package typingsSlinky.bitwise

import typingsSlinky.bitwise.typesMod.Bit
import typingsSlinky.bitwise.typesMod.UInt8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRead extends js.Object {
  def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = js.native
  def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = js.native
}

object AnonRead {
  @scala.inline
  def apply(
    read: UInt8 => js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit],
    write: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] => UInt8
  ): AnonRead = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[AnonRead]
  }
  @scala.inline
  implicit class AnonReadOps[Self <: AnonRead] (val x: Self) extends AnyVal {
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

