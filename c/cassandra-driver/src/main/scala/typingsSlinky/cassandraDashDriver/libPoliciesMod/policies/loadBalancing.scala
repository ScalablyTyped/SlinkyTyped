package typingsSlinky.cassandraDashDriver.libPoliciesMod.policies

import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.Client
import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.EmptyCallback
import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.ExecutionOptions
import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.Host
import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.HostMap
import typingsSlinky.cassandraDashDriver.libTypesMod.types.distance
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

