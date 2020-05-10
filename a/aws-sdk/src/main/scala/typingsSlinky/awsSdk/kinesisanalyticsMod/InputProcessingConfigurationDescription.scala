package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProcessingConfigurationDescription extends js.Object {
  /**
    * Provides configuration information about the associated InputLambdaProcessorDescription.
    */
  var InputLambdaProcessorDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputLambdaProcessorDescription] = js.native
}

object InputProcessingConfigurationDescription {
  @scala.inline
  def apply(): InputProcessingConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProcessingConfigurationDescription]
  }
  @scala.inline
  implicit class InputProcessingConfigurationDescriptionOps[Self <: InputProcessingConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputLambdaProcessorDescription(value: InputLambdaProcessorDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLambdaProcessorDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLambdaProcessorDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLambdaProcessorDescription")(js.undefined)
        ret
    }
  }
  
}

