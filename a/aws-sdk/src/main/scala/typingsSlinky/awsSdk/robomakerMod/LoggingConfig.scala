package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfig extends js.Object {
  /**
    * A boolean indicating whether to record all ROS topics.
    */
  var recordAllRosTopics: BoxedBoolean = js.native
}

object LoggingConfig {
  @scala.inline
  def apply(recordAllRosTopics: BoxedBoolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(recordAllRosTopics = recordAllRosTopics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  @scala.inline
  implicit class LoggingConfigOps[Self <: LoggingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordAllRosTopics(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordAllRosTopics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

