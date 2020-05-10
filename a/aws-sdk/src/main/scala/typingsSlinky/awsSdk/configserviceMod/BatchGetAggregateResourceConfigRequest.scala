package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetAggregateResourceConfigRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * A list of aggregate ResourceIdentifiers objects. 
    */
  var ResourceIdentifiers: ResourceIdentifiersList = js.native
}

object BatchGetAggregateResourceConfigRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifiers: ResourceIdentifiersList
  ): BatchGetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceIdentifiers = ResourceIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAggregateResourceConfigRequest]
  }
  @scala.inline
  implicit class BatchGetAggregateResourceConfigRequestOps[Self <: BatchGetAggregateResourceConfigRequest] (val x: Self) extends AnyVal {
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
    def withResourceIdentifiers(value: ResourceIdentifiersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

