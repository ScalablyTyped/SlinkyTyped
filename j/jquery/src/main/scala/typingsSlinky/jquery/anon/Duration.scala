package typingsSlinky.jquery.anon

import typingsSlinky.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typingsSlinky.jquery.JQuery.Duration
}

object Duration {
  @scala.inline
  def apply(duration: typingsSlinky.jquery.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

