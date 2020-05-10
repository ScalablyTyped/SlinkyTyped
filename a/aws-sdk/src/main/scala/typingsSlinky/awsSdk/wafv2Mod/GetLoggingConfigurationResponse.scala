package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoggingConfigurationResponse extends js.Object {
  /**
    * The LoggingConfiguration for the specified web ACL.
    */
  var LoggingConfiguration: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.LoggingConfiguration] = js.native
}

object GetLoggingConfigurationResponse {
  @scala.inline
  def apply(): GetLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoggingConfigurationResponse]
  }
  @scala.inline
  implicit class GetLoggingConfigurationResponseOps[Self <: GetLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingConfiguration(value: LoggingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfiguration")(js.undefined)
        ret
    }
  }
  
}

