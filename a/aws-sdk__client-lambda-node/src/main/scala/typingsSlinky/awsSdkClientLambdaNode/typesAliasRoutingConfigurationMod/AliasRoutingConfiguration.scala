package typingsSlinky.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingConfiguration extends js.Object {
  /**
    * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
    */
  var AdditionalVersionWeights: js.UndefOr[StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]])] = js.native
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
    def withAdditionalVersionWeightsIterable(value: js.Iterable[js.Tuple2[String, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalVersionWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalVersionWeights(value: StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]])): Self = {
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

