package typingsSlinky.bitwise

import typingsSlinky.bitwise.bitwiseTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1 extends js.Object {
  def toBits(string: String): js.Array[Bit] = js.native
}

object Anon1 {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): Anon1 = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[Anon1]
  }
  @scala.inline
  implicit class Anon1Ops[Self <: Anon1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToBits(value: String => js.Array[Bit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBits")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

