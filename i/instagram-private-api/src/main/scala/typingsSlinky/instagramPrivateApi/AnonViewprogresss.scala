package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonViewprogresss extends js.Object {
  var view_progress_s: Double = js.native
}

object AnonViewprogresss {
  @scala.inline
  def apply(view_progress_s: Double): AnonViewprogresss = {
    val __obj = js.Dynamic.literal(view_progress_s = view_progress_s.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonViewprogresss]
  }
  @scala.inline
  implicit class AnonViewprogresssOps[Self <: AnonViewprogresss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withView_progress_s(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_progress_s")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

