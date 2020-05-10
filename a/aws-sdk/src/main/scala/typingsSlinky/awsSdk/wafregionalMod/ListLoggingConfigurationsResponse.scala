package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLoggingConfigurationsResponse extends js.Object {
  /**
    * An array of LoggingConfiguration objects.
    */
  var LoggingConfigurations: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.LoggingConfigurations] = js.native
  /**
    * If you have more LoggingConfigurations than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more LoggingConfigurations, submit another ListLoggingConfigurations request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
}

object ListLoggingConfigurationsResponse {
  @scala.inline
  def apply(): ListLoggingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoggingConfigurationsResponse]
  }
  @scala.inline
  implicit class ListLoggingConfigurationsResponseOps[Self <: ListLoggingConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingConfigurations(value: LoggingConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: NextMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

