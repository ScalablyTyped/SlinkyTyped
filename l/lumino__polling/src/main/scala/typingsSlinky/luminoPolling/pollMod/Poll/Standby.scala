package typingsSlinky.luminoPolling.pollMod.Poll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates when the poll switches to standby.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.luminoPolling.luminoPollingStrings.never
  - typingsSlinky.luminoPolling.luminoPollingStrings.`when-hidden`
*/
trait Standby extends js.Object

object Standby {
  @scala.inline
  def never: typingsSlinky.luminoPolling.luminoPollingStrings.never = "never".asInstanceOf[typingsSlinky.luminoPolling.luminoPollingStrings.never]
  @scala.inline
  def `when-hidden`: typingsSlinky.luminoPolling.luminoPollingStrings.`when-hidden` = "when-hidden".asInstanceOf[typingsSlinky.luminoPolling.luminoPollingStrings.`when-hidden`]
}

