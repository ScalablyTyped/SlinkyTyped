package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateResourceConfigRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * An object that identifies aggregate resource.
    */
  var ResourceIdentifier: AggregateResourceIdentifier = js.native
}

object GetAggregateResourceConfigRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifier: AggregateResourceIdentifier
  ): GetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateResourceConfigRequest]
  }
  @scala.inline
  implicit class GetAggregateResourceConfigRequestOps[Self <: GetAggregateResourceConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceIdentifier(value: AggregateResourceIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

