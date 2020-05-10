package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateResourceConfigResponse extends js.Object {
  /**
    * Returns a ConfigurationItem object.
    */
  var ConfigurationItem: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigurationItem] = js.native
}

object GetAggregateResourceConfigResponse {
  @scala.inline
  def apply(): GetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateResourceConfigResponse]
  }
  @scala.inline
  implicit class GetAggregateResourceConfigResponseOps[Self <: GetAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationItem(value: ConfigurationItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationItem")(js.undefined)
        ret
    }
  }
  
}

