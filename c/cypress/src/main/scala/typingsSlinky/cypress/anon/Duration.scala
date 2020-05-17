package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery.SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration
  extends SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typingsSlinky.cypress.JQuery.Duration = js.native
}

object Duration {
  @scala.inline
  def apply(duration: typingsSlinky.cypress.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: typingsSlinky.cypress.JQuery.Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

