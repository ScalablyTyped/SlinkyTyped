package typingsSlinky.carbonColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon40 extends js.Object {
  var `40`: String = js.native
}

object Anon40 {
  @scala.inline
  def apply(`40`: String): Anon40 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon40]
  }
  @scala.inline
  implicit class Anon40Ops[Self <: Anon40] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with40(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("40")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

