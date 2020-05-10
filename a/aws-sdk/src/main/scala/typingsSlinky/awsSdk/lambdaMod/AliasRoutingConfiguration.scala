package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingConfiguration extends js.Object {
  /**
    * The name of the second alias, and the percentage of traffic that's routed to it.
    */
  var AdditionalVersionWeights: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.AdditionalVersionWeights] = js.native
}

object AliasRoutingConfiguration {
  @scala.inline
  def apply(): AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasRoutingConfiguration]
  }
  @scala.inline
  implicit class AliasRoutingConfigurationOps[Self <: AliasRoutingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalVersionWeights(value: AdditionalVersionWeights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalVersionWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalVersionWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalVersionWeights")(js.undefined)
        ret
    }
  }
  
}

