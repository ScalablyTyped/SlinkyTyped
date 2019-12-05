package typingsSlinky.cassandraDashDriver.libPoliciesMod.policies.timestampGeneration

import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.Client
import typingsSlinky.cassandraDashDriver.libTypesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.timestampGeneration.MonotonicTimestampGenerator")
@js.native
class MonotonicTimestampGenerator protected () extends TimestampGenerator {
  def this(warningThreshold: Double, minLogInterval: Double) = this()
  def getDate(): Double = js.native
  /* CompleteClass */
  override def next(client: Client): Long | Double = js.native
}

