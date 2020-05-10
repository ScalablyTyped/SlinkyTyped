package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationAggregatorResponse extends js.Object {
  /**
    * Returns a ConfigurationAggregator object.
    */
  var ConfigurationAggregator: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigurationAggregator] = js.native
}

object PutConfigurationAggregatorResponse {
  @scala.inline
  def apply(): PutConfigurationAggregatorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConfigurationAggregatorResponse]
  }
  @scala.inline
  implicit class PutConfigurationAggregatorResponseOps[Self <: PutConfigurationAggregatorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationAggregator(value: ConfigurationAggregator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationAggregator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationAggregator")(js.undefined)
        ret
    }
  }
  
}

