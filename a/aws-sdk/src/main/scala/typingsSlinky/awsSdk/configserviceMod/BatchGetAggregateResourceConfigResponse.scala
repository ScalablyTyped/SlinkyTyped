package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetAggregateResourceConfigResponse extends js.Object {
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var BaseConfigurationItems: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.BaseConfigurationItems] = js.native
  /**
    * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources are processed.
    */
  var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.native
}

object BatchGetAggregateResourceConfigResponse {
  @scala.inline
  def apply(): BatchGetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAggregateResourceConfigResponse]
  }
  @scala.inline
  implicit class BatchGetAggregateResourceConfigResponseOps[Self <: BatchGetAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseConfigurationItems(value: BaseConfigurationItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseConfigurationItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseConfigurationItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseConfigurationItems")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedResourceIdentifiers(value: UnprocessedResourceIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedResourceIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedResourceIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedResourceIdentifiers")(js.undefined)
        ret
    }
  }
  
}

