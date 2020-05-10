package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteSettingsRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The route key.
    */
  var RouteKey: string = js.native
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: string = js.native
}

object DeleteRouteSettingsRequest {
  @scala.inline
  def apply(ApiId: string, RouteKey: string, StageName: string): DeleteRouteSettingsRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteKey = RouteKey.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteSettingsRequest]
  }
  @scala.inline
  implicit class DeleteRouteSettingsRequestOps[Self <: DeleteRouteSettingsRequest] (val x: Self) extends AnyVal {
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
    def withRouteKey(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

