package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.anon.Consistency
import typingsSlinky.cassandraDriver.anon.Language
import typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsSlinky.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typingsSlinky.cassandraDriver.typesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "ExecutionProfile")
@js.native
class ExecutionProfile protected () extends StObject {
  def this(name: String, options: Consistency) = this()
  
  var consistency: js.UndefOr[consistencies] = js.native
  
  var graphOptions: js.UndefOr[Language] = js.native
  
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  
  var name: String = js.native
  
  var readTimeout: js.UndefOr[Double] = js.native
  
  var retry: js.UndefOr[RetryPolicy] = js.native
  
  var serialConsistency: js.UndefOr[consistencies] = js.native
}
