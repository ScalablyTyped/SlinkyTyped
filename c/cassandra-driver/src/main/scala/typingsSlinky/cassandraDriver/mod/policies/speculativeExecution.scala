package typingsSlinky.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "policies.speculativeExecution")
@js.native
object speculativeExecution extends js.Object {
  
  @js.native
  class ConstantSpeculativeExecutionPolicy protected ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.speculativeExecution.ConstantSpeculativeExecutionPolicy {
    def this(delay: Double, maxSpeculativeExecutions: Double) = this()
  }
  
  @js.native
  class NoSpeculativeExecutionPolicy ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.speculativeExecution.NoSpeculativeExecutionPolicy
}
