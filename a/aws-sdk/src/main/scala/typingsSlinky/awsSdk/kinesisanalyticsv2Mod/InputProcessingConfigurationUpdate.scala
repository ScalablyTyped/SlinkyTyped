package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProcessingConfigurationUpdate extends js.Object {
  /**
    * Provides update information for an InputLambdaProcessor.
    */
  var InputLambdaProcessorUpdate: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.InputLambdaProcessorUpdate = js.native
}

object InputProcessingConfigurationUpdate {
  @scala.inline
  def apply(InputLambdaProcessorUpdate: InputLambdaProcessorUpdate): InputProcessingConfigurationUpdate = {
    val __obj = js.Dynamic.literal(InputLambdaProcessorUpdate = InputLambdaProcessorUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfigurationUpdate]
  }
  @scala.inline
  implicit class InputProcessingConfigurationUpdateOps[Self <: InputProcessingConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputLambdaProcessorUpdate(value: InputLambdaProcessorUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLambdaProcessorUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

