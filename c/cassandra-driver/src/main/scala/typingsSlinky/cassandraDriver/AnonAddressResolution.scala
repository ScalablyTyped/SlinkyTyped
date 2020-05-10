package typingsSlinky.cassandraDriver

import typingsSlinky.cassandraDriver.policiesMod.policies.addressResolution.AddressTranslator
import typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsSlinky.cassandraDriver.policiesMod.policies.reconnection.ReconnectionPolicy
import typingsSlinky.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typingsSlinky.cassandraDriver.policiesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typingsSlinky.cassandraDriver.policiesMod.policies.timestampGeneration.TimestampGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddressResolution extends js.Object {
  var addressResolution: js.UndefOr[AddressTranslator] = js.native
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  var reconnection: js.UndefOr[ReconnectionPolicy] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var speculativeExecution: js.UndefOr[SpeculativeExecutionPolicy] = js.native
  var timestampGeneration: js.UndefOr[TimestampGenerator] = js.native
}

object AnonAddressResolution {
  @scala.inline
  def apply(): AnonAddressResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddressResolution]
  }
  @scala.inline
  implicit class AnonAddressResolutionOps[Self <: AnonAddressResolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressResolution(value: AddressTranslator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancing(value: LoadBalancingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancing")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnection(value: ReconnectionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnection")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeculativeExecution(value: SpeculativeExecutionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speculativeExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeculativeExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speculativeExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampGeneration(value: TimestampGenerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampGeneration")(js.undefined)
        ret
    }
  }
  
}

