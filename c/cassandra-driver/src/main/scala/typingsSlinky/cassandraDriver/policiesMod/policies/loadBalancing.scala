package typingsSlinky.cassandraDriver.policiesMod.policies

import typingsSlinky.cassandraDriver.anon.Filter
import typingsSlinky.cassandraDriver.mod.Client
import typingsSlinky.cassandraDriver.mod.EmptyCallback
import typingsSlinky.cassandraDriver.mod.ExecutionOptions
import typingsSlinky.cassandraDriver.mod.Host
import typingsSlinky.cassandraDriver.mod.HostMap
import typingsSlinky.cassandraDriver.typesMod.types.distance
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy protected () extends LoadBalancingPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  class DefaultLoadBalancingPolicy () extends LoadBalancingPolicy {
    def this(options: Filter) = this()
  }
  
  @js.native
  abstract class LoadBalancingPolicy () extends js.Object {
    def getDistance(host: Host): distance = js.native
    def getOptions(): Map[String, js.Object] = js.native
    def init(client: Client, hosts: HostMap, callback: EmptyCallback): Unit = js.native
    def newQueryPlan(
      keyspace: String,
      executionOptions: ExecutionOptions,
      callback: js.Function2[/* error */ js.Error, /* iterator */ js.Iterator[Host], Unit]
    ): Unit = js.native
  }
  
  @js.native
  class RoundRobinPolicy () extends LoadBalancingPolicy
  
  @js.native
  class TokenAwarePolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy, whiteList: js.Array[String]) = this()
  }
  
}

