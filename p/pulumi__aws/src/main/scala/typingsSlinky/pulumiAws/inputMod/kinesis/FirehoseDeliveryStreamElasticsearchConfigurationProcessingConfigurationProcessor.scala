package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor extends js.Object {
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ]
  ] = js.native
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: Input[String] = js.native
}

object FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor {
  @scala.inline
  def apply(`type`: Input[String]): FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorOps[Self <: FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(
      value: Input[
          js.Array[
            Input[
              FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter
            ]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

