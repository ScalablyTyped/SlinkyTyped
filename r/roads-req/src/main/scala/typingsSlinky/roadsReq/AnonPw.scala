package typingsSlinky.roadsReq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPw extends js.Object {
  var pw: String = js.native
  var un: String = js.native
}

object AnonPw {
  @scala.inline
  def apply(pw: String, un: String): AnonPw = {
    val __obj = js.Dynamic.literal(pw = pw.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPw]
  }
  @scala.inline
  implicit class AnonPwOps[Self <: AnonPw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("un")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

