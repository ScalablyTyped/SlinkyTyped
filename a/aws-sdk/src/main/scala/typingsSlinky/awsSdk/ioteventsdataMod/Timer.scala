package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timer extends js.Object {
  /**
    * The name of the timer.
    */
  var name: TimerName = js.native
  /**
    * The number of seconds which have elapsed on the timer.
    */
  var timestamp: js.Date = js.native
}

object Timer {
  @scala.inline
  def apply(name: TimerName, timestamp: js.Date): Timer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
}

