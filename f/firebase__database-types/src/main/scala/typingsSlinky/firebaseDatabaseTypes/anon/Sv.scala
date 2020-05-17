package typingsSlinky.firebaseDatabaseTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sv extends js.Object {
  @JSName(".sv")
  var Dotsv: String = js.native
}

object Sv {
  @scala.inline
  def apply(Dotsv: String): Sv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sv]
  }
  @scala.inline
  implicit class SvOps[Self <: Sv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotsv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".sv")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

