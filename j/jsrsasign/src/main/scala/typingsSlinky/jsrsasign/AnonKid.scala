package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKid extends js.Object {
  var kid: String = js.native
}

object AnonKid {
  @scala.inline
  def apply(kid: String): AnonKid = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKid]
  }
  @scala.inline
  implicit class AnonKidOps[Self <: AnonKid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

