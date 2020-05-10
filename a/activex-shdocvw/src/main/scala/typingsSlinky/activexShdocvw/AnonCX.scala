package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCX extends js.Object {
  var CX: Double = js.native
  var CY: Double = js.native
}

object AnonCX {
  @scala.inline
  def apply(CX: Double, CY: Double): AnonCX = {
    val __obj = js.Dynamic.literal(CX = CX.asInstanceOf[js.Any], CY = CY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCX]
  }
  @scala.inline
  implicit class AnonCXOps[Self <: AnonCX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

