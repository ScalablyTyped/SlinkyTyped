package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The model selection expression for the route response. Supported only for WebSocket APIs.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The response models for the route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.native
  /**
    * The route response parameters.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.native
  /**
    * The route ID.
    */
  var RouteId: string = js.native
  /**
    * The route response key.
    */
  var RouteResponseKey: SelectionKey = js.native
}

object CreateRouteResponseRequest {
  @scala.inline
  def apply(ApiId: string, RouteId: string, RouteResponseKey: SelectionKey): CreateRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseKey = RouteResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteResponseRequest]
  }
  @scala.inline
  implicit class CreateRouteResponseRequestOps[Self <: CreateRouteResponseRequest] (val x: Self) extends AnyVal {
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
    def withRouteId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteResponseKey(value: SelectionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteResponseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelSelectionExpression(value: SelectionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelSelectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelSelectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelSelectionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseModels(value: RouteModels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseModels")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseParameters(value: RouteParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseParameters")(js.undefined)
        ret
    }
  }
  
}

