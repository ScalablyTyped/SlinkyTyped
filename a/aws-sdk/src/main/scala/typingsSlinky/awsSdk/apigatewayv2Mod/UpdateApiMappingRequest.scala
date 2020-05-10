package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiMappingRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string = js.native
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The domain name.
    */
  var DomainName: string = js.native
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.native
}

object UpdateApiMappingRequest {
  @scala.inline
  def apply(ApiId: Id, ApiMappingId: string, DomainName: string): UpdateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiMappingRequest]
  }
  @scala.inline
  implicit class UpdateApiMappingRequestOps[Self <: UpdateApiMappingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withApiMappingKey(value: SelectionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiMappingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiMappingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiMappingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStage(value: StringWithLengthBetween1And128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stage")(js.undefined)
        ret
    }
  }
  
}

