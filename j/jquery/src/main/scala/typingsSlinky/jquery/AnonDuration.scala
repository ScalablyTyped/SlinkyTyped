package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery_.Duration
import typingsSlinky.jquery.JQuery_._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDuration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: Duration = js.native
}

object AnonDuration {
  @scala.inline
  def apply(duration: Duration): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
  @scala.inline
  implicit class AnonDurationOps[Self <: AnonDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

