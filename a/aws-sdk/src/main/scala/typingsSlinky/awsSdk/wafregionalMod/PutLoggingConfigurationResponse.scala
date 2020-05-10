package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingConfigurationResponse extends js.Object {
  /**
    * The LoggingConfiguration that you submitted in the request.
    */
  var LoggingConfiguration: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.LoggingConfiguration] = js.native
}

object PutLoggingConfigurationResponse {
  @scala.inline
  def apply(): PutLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLoggingConfigurationResponse]
  }
  @scala.inline
  implicit class PutLoggingConfigurationResponseOps[Self <: PutLoggingConfigurationResponse] (val x: Self) extends AnyVal {
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

