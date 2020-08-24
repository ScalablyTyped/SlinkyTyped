package typingsSlinky.luminoPolling.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPoll {
  /**
    * The phase of the poll when the current tick was scheduled.
    *
    * @typeparam T - A type for any additional tick phases a poll supports.
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsSlinky.luminoPolling.luminoPollingStrings.constructed
    - typingsSlinky.luminoPolling.luminoPollingStrings.disposed
    - typingsSlinky.luminoPolling.luminoPollingStrings.reconnected
    - typingsSlinky.luminoPolling.luminoPollingStrings.refreshed
    - typingsSlinky.luminoPolling.luminoPollingStrings.rejected
    - typingsSlinky.luminoPolling.luminoPollingStrings.resolved
    - typingsSlinky.luminoPolling.luminoPollingStrings.standby
    - typingsSlinky.luminoPolling.luminoPollingStrings.started
    - typingsSlinky.luminoPolling.luminoPollingStrings.stopped
  */
  type Phase[T /* <: java.lang.String */] = typingsSlinky.luminoPolling.mod.IPoll._Phase[T] | T
}
