package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStandard extends js.Object {
  var standard: AnonAM = js.native
}

object AnonStandard {
  @scala.inline
  def apply(standard: AnonAM): AnonStandard = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStandard]
  }
  @scala.inline
  implicit class AnonStandardOps[Self <: AnonStandard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandard(value: AnonAM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

