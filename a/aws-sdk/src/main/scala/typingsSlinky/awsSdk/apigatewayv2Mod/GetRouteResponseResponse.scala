package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteResponseResponse extends js.Object {
  /**
    * Represents the model selection expression of a route response. Supported only for WebSocket APIs.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * Represents the response models of a route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.native
  /**
    * Represents the response parameters of a route response.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.native
  /**
    * Represents the identifier of a route response.
    */
  var RouteResponseId: js.UndefOr[Id] = js.native
  /**
    * Represents the route response key of a route response.
    */
  var RouteResponseKey: js.UndefOr[SelectionKey] = js.native
}

object GetRouteResponseResponse {
  @scala.inline
  def apply(): GetRouteResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRouteResponseResponse]
  }
  @scala.inline
  implicit class GetRouteResponseResponseOps[Self <: GetRouteResponseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRouteResponseId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteResponseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteResponseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteResponseId")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteResponseKey(value: SelectionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteResponseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteResponseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteResponseKey")(js.undefined)
        ret
    }
  }
  
}

