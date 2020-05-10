package typingsSlinky.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAliasRoutingConfiguration extends AliasRoutingConfiguration {
  /**
    * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
    */
  @JSName("AdditionalVersionWeights")
  var AdditionalVersionWeights_UnmarshalledAliasRoutingConfiguration: js.UndefOr[StringDictionary[Double]] = js.native
}

object UnmarshalledAliasRoutingConfiguration {
  @scala.inline
  def apply(): UnmarshalledAliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAliasRoutingConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledAliasRoutingConfigurationOps[Self <: UnmarshalledAliasRoutingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalVersionWeights(value: StringDictionary[Double]): Self = {
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

