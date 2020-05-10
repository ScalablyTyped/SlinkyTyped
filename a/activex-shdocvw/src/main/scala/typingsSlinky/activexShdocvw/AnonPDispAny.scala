package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPDispAny extends js.Object {
  val pDisp: js.Any = js.native
}

object AnonPDispAny {
  @scala.inline
  def apply(pDisp: js.Any): AnonPDispAny = {
    val __obj = js.Dynamic.literal(pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPDispAny]
  }
  @scala.inline
  implicit class AnonPDispAnyOps[Self <: AnonPDispAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPDisp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDisp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

