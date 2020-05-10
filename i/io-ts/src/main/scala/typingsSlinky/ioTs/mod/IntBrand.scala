package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntBrand extends js.Object {
  val Int: js.Symbol = js.native
}

object IntBrand {
  @scala.inline
  def apply(Int: js.Symbol): IntBrand = {
    val __obj = js.Dynamic.literal(Int = Int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntBrand]
  }
  @scala.inline
  implicit class IntBrandOps[Self <: IntBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInt(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Int")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

