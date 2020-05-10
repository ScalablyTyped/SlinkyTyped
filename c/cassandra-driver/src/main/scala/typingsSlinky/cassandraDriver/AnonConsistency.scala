package typingsSlinky.cassandraDriver

import typingsSlinky.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsSlinky.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typingsSlinky.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConsistency extends js.Object {
  var consistency: js.UndefOr[consistencies] = js.native
  var graphOptions: js.UndefOr[AnonLanguage] = js.native
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var serialConsistency: js.UndefOr[consistencies] = js.native
}

object AnonConsistency {
  @scala.inline
  def apply(): AnonConsistency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConsistency]
  }
  @scala.inline
  implicit class AnonConsistencyOps[Self <: AnonConsistency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsistency(value: consistencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphOptions(value: AnonLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphOptions")(js.undefined)
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
    def withReadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(js.undefined)
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
    def withSerialConsistency(value: consistencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialConsistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialConsistency")(js.undefined)
        ret
    }
  }
  
}

