package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiMappingResponse extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: js.UndefOr[Id] = js.native
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.native
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.native
}

object CreateApiMappingResponse {
  @scala.inline
  def apply(): CreateApiMappingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiMappingResponse]
  }
  @scala.inline
  implicit class CreateApiMappingResponseOps[Self <: CreateApiMappingResponse] (val x: Self) extends AnyVal {
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
    def withoutApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(js.undefined)
        ret
    }
    @scala.inline
    def withApiMappingId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiMappingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiMappingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiMappingId")(js.undefined)
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

