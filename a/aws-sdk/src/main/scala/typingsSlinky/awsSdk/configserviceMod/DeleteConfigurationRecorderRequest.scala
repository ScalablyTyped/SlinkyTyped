package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationRecorderRequest extends js.Object {
  /**
    * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by using the DescribeConfigurationRecorders action.
    */
  var ConfigurationRecorderName: RecorderName = js.native
}

object DeleteConfigurationRecorderRequest {
  @scala.inline
  def apply(ConfigurationRecorderName: RecorderName): DeleteConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationRecorderRequest]
  }
  @scala.inline
  implicit class DeleteConfigurationRecorderRequestOps[Self <: DeleteConfigurationRecorderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationRecorderName(value: RecorderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRecorderName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

