package typingsSlinky.cassandraDriver.mod.policies

import typingsSlinky.cassandraDriver.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy protected ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.DCAwareRoundRobinPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  class DefaultLoadBalancingPolicy ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.DefaultLoadBalancingPolicy {
    def this(options: Filter) = this()
  }
  
  @js.native
  abstract class LoadBalancingPolicy ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
  
  @js.native
  class RoundRobinPolicy ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.RoundRobinPolicy
  
  @js.native
  class TokenAwarePolicy protected ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.TokenAwarePolicy {
    def this(childPolicy: typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy protected ()
    extends typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.WhiteListPolicy {
    def this(
      childPolicy: typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy,
      whiteList: js.Array[String]
    ) = this()
  }
  
}

