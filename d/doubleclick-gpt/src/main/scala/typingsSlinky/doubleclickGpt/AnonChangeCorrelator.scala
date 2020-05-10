package typingsSlinky.doubleclickGpt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangeCorrelator extends js.Object {
  var changeCorrelator: Boolean = js.native
}

object AnonChangeCorrelator {
  @scala.inline
  def apply(changeCorrelator: Boolean): AnonChangeCorrelator = {
    val __obj = js.Dynamic.literal(changeCorrelator = changeCorrelator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangeCorrelator]
  }
  @scala.inline
  implicit class AnonChangeCorrelatorOps[Self <: AnonChangeCorrelator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeCorrelator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCorrelator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

