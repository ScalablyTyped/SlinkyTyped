package typingsSlinky.bcryptjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.ArrayLike<number>> */
@js.native
trait ReadonlyArrayLikenumber extends js.Object {
  val length: Double = js.native
}

object ReadonlyArrayLikenumber {
  @scala.inline
  def apply(length: Double): ReadonlyArrayLikenumber = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyArrayLikenumber]
  }
  @scala.inline
  implicit class ReadonlyArrayLikenumberOps[Self <: ReadonlyArrayLikenumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

