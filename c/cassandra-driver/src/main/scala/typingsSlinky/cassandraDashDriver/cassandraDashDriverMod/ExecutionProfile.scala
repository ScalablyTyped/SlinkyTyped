package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod

import typingsSlinky.cassandraDashDriver.Anon_Consistency
import typingsSlinky.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsSlinky.cassandraDashDriver.libPoliciesMod.policies.retry.RetryPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "ExecutionProfile")
@js.native
class ExecutionProfile protected () extends js.Object {
  def this(name: String, options: Anon_Consistency) = this()
  var consistency: js.UndefOr[Double] = js.native
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  var name: String = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var serialConsistency: js.UndefOr[Double] = js.native
}

