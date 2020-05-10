package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRevisionRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string = js.native
  /**
    * The revision of the configuration.
    */
  var ConfigurationRevision: string = js.native
}

object DescribeConfigurationRevisionRequest {
  @scala.inline
  def apply(ConfigurationId: string, ConfigurationRevision: string): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any], ConfigurationRevision = ConfigurationRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
  @scala.inline
  implicit class DescribeConfigurationRevisionRequestOps[Self <: DescribeConfigurationRevisionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationRevision(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRevision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

