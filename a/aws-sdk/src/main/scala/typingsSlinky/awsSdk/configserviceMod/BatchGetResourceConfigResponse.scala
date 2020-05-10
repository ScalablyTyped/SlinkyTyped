package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetResourceConfigResponse extends js.Object {
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.native
  /**
    * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys list. 
    */
  var unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.native
}

object BatchGetResourceConfigResponse {
  @scala.inline
  def apply(): BatchGetResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetResourceConfigResponse]
  }
  @scala.inline
  implicit class BatchGetResourceConfigResponseOps[Self <: BatchGetResourceConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseConfigurationItems(value: BaseConfigurationItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseConfigurationItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseConfigurationItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseConfigurationItems")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedResourceKeys(value: ResourceKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedResourceKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedResourceKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedResourceKeys")(js.undefined)
        ret
    }
  }
  
}

