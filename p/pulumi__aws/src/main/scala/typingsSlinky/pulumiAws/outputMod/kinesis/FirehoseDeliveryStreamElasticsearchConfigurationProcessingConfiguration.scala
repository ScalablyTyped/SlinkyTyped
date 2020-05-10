package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]
  ] = js.native
}

object FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration {
  @scala.inline
  def apply(): FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationOps[Self <: FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessors(value: js.Array[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(js.undefined)
        ret
    }
  }
  
}

