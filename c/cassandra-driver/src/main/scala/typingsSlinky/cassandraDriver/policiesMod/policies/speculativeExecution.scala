package typingsSlinky.cassandraDriver.policiesMod.policies

import typingsSlinky.cassandraDriver.anon.NextExecution
import typingsSlinky.cassandraDriver.mod.Client
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/policies", "policies.speculativeExecution")
@js.native
object speculativeExecution extends js.Object {
  
  @js.native
  class ConstantSpeculativeExecutionPolicy protected () extends SpeculativeExecutionPolicy {
    def this(delay: Double, maxSpeculativeExecutions: Double) = this()
  }
  
  @js.native
  class NoSpeculativeExecutionPolicy () extends SpeculativeExecutionPolicy
  
  @js.native
  trait SpeculativeExecutionPolicy extends js.Object {
    
    def getOptions(): Map[String, js.Object] = js.native
    
    def init(client: Client): Unit = js.native
    
    def newPlan(keyspace: String, queryInfo: String): NextExecution = js.native
    def newPlan(keyspace: String, queryInfo: js.Array[js.Object]): NextExecution = js.native
    
    def shutdown(): Unit = js.native
  }
}
