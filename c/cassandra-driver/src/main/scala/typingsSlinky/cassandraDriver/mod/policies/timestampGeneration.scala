package typingsSlinky.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.timestampGeneration")
@js.native
object timestampGeneration extends js.Object {
  @js.native
  class MonotonicTimestampGenerator protected ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.timestampGeneration.MonotonicTimestampGenerator {
    def this(warningThreshold: Double, minLogInterval: Double) = this()
  }
  
}

