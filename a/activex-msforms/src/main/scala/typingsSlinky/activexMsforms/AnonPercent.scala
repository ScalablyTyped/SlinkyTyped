package typingsSlinky.activexMsforms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPercent extends js.Object {
  var Percent: Double = js.native
}

object AnonPercent {
  @scala.inline
  def apply(Percent: Double): AnonPercent = {
    val __obj = js.Dynamic.literal(Percent = Percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPercent]
  }
  @scala.inline
  implicit class AnonPercentOps[Self <: AnonPercent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

