package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: string = js.native
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.native
}

object UpdateDomainNameRequest {
  @scala.inline
  def apply(DomainName: string): UpdateDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameRequest]
  }
  @scala.inline
  implicit class UpdateDomainNameRequestOps[Self <: UpdateDomainNameRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainNameConfigurations(value: DomainNameConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNameConfigurations")(js.undefined)
        ret
    }
  }
  
}

