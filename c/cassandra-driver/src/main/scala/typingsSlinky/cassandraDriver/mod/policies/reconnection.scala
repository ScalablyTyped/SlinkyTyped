package typingsSlinky.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "policies.reconnection")
@js.native
object reconnection extends js.Object {
  
  @js.native
  class ConstantReconnectionPolicy protected ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.reconnection.ConstantReconnectionPolicy {
    def this(delay: Double) = this()
  }
  
  @js.native
  class ExponentialReconnectionPolicy protected ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.reconnection.ExponentialReconnectionPolicy {
    def this(baseDelay: Double, maxDelay: Double) = this()
    def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
  }
}
