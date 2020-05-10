package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.G
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUL extends js.Object {
  var UL: G = js.native
}

object AnonUL {
  @scala.inline
  def apply(UL: G): AnonUL = {
    val __obj = js.Dynamic.literal(UL = UL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUL]
  }
  @scala.inline
  implicit class AnonULOps[Self <: AnonUL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUL(value: G): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

