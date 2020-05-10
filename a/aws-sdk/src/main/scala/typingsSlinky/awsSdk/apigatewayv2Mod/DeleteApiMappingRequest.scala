package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiMappingRequest extends js.Object {
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string = js.native
  /**
    * The domain name.
    */
  var DomainName: string = js.native
}

object DeleteApiMappingRequest {
  @scala.inline
  def apply(ApiMappingId: string, DomainName: string): DeleteApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiMappingRequest]
  }
  @scala.inline
  implicit class DeleteApiMappingRequestOps[Self <: DeleteApiMappingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiMappingId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiMappingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

