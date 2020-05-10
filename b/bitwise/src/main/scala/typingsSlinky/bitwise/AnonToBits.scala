package typingsSlinky.bitwise

import typingsSlinky.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToBits extends js.Object {
  def toBits(string: String): js.Array[Bit] = js.native
}

object AnonToBits {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): AnonToBits = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[AnonToBits]
  }
  @scala.inline
  implicit class AnonToBitsOps[Self <: AnonToBits] (val x: Self) extends AnyVal {
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

