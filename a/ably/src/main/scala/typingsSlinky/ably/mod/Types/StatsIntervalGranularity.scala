package typingsSlinky.ably.mod.Types

import typingsSlinky.ably.ablyStrings.day
import typingsSlinky.ably.ablyStrings.hour
import typingsSlinky.ably.ablyStrings.minute
import typingsSlinky.ably.ablyStrings.month
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.mod.Types.StatsIntervalGranularity.MINUTE
  - typingsSlinky.ably.mod.Types.StatsIntervalGranularity.HOUR
  - typingsSlinky.ably.mod.Types.StatsIntervalGranularity.DAY
  - typingsSlinky.ably.mod.Types.StatsIntervalGranularity.MONTH
*/
trait StatsIntervalGranularity extends js.Object

@JSImport("ably", "Types.StatsIntervalGranularity")
@js.native
object StatsIntervalGranularity extends js.Object {
  type DAY = day
  type HOUR = hour
  type MINUTE = minute
  type MONTH = month
}

