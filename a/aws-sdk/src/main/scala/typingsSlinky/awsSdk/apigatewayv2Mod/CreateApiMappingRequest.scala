package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiMappingRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
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
  var Stage: StringWithLengthBetween1And128 = js.native
}

object CreateApiMappingRequest {
  @scala.inline
  def apply(ApiId: Id, DomainName: string, Stage: StringWithLengthBetween1And128): CreateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiMappingRequest]
  }
  @scala.inline
  implicit class CreateApiMappingRequestOps[Self <: CreateApiMappingRequest] (val x: Self) extends AnyVal {
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
    def withDomainName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: StringWithLengthBetween1And128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stage")(value.asInstanceOf[js.Any])
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
  }
  
}

