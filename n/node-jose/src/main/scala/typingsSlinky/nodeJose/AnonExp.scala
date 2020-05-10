package typingsSlinky.nodeJose

import typingsSlinky.nodeJose.mod.JWS.Exp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExp extends js.Object {
  var exp: Boolean | Exp = js.native
}

object AnonExp {
  @scala.inline
  def apply(exp: Boolean | Exp): AnonExp = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExp]
  }
  @scala.inline
  implicit class AnonExpOps[Self <: AnonExp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExp(value: Boolean | Exp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

