package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var analyticsMetadata: ClientAnalyticsMetadata = js.native
  var client: Client_ = js.native
  var gatewayConfiguration: js.Any = js.native
}

object Configuration {
  @scala.inline
  def apply(analyticsMetadata: ClientAnalyticsMetadata, client: Client_, gatewayConfiguration: js.Any): Configuration = {
    val __obj = js.Dynamic.literal(analyticsMetadata = analyticsMetadata.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], gatewayConfiguration = gatewayConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsMetadata(value: ClientAnalyticsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: Client_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayConfiguration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

