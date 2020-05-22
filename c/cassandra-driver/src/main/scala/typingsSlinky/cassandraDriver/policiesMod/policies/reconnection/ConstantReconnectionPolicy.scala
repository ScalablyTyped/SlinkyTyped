package typingsSlinky.cassandraDriver.policiesMod.policies.reconnection

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.reconnection.ConstantReconnectionPolicy")
@js.native
class ConstantReconnectionPolicy protected () extends ReconnectionPolicy {
  def this(delay: Double) = this()
  /* CompleteClass */
  override def getOptions(): Map[String, js.Object] = js.native
  /* CompleteClass */
  override def newSchedule(): js.Iterator[Double] = js.native
}

