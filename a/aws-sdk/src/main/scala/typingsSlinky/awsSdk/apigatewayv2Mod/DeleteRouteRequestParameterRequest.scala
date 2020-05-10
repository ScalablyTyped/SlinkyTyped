package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteRequestParameterRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The route request parameter key.
    */
  var RequestParameterKey: string = js.native
  /**
    * The route ID.
    */
  var RouteId: string = js.native
}

object DeleteRouteRequestParameterRequest {
  @scala.inline
  def apply(ApiId: string, RequestParameterKey: string, RouteId: string): DeleteRouteRequestParameterRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RequestParameterKey = RequestParameterKey.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequestParameterRequest]
  }
  @scala.inline
  implicit class DeleteRouteRequestParameterRequestOps[Self <: DeleteRouteRequestParameterRequest] (val x: Self) extends AnyVal {
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
    def withRequestParameterKey(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestParameterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

