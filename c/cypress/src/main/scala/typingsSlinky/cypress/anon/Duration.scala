package typingsSlinky.cypress.anon

import typingsSlinky.cypress.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typingsSlinky.cypress.JQuery.Duration
}

object Duration {
  @scala.inline
  def apply(duration: typingsSlinky.cypress.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

