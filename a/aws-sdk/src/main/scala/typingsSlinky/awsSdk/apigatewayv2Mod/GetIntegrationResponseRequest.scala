package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntegrationResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The integration ID.
    */
  var IntegrationId: string = js.native
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: string = js.native
}

object GetIntegrationResponseRequest {
  @scala.inline
  def apply(ApiId: string, IntegrationId: string, IntegrationResponseId: string): GetIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any], IntegrationResponseId = IntegrationResponseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntegrationResponseRequest]
  }
  @scala.inline
  implicit class GetIntegrationResponseRequestOps[Self <: GetIntegrationResponseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrationResponseId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationResponseId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

