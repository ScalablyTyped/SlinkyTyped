package typingsSlinky.gcStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GCStatsListener = js.Function1[/* stats */ typingsSlinky.gcStats.mod.GCStatistics, scala.Unit]
}
