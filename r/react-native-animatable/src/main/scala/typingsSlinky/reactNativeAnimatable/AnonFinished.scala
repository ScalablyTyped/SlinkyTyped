package typingsSlinky.reactNativeAnimatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFinished extends js.Object {
  var finished: Boolean = js.native
}

object AnonFinished {
  @scala.inline
  def apply(finished: Boolean): AnonFinished = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFinished]
  }
  @scala.inline
  implicit class AnonFinishedOps[Self <: AnonFinished] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

