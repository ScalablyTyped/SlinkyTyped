package typingsSlinky.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSv extends js.Object {
  @JSName(".sv")
  var Dotsv: String = js.native
}

object AnonSv {
  @scala.inline
  def apply(Dotsv: String): AnonSv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSv]
  }
  @scala.inline
  implicit class AnonSvOps[Self <: AnonSv] (val x: Self) extends AnyVal {
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

