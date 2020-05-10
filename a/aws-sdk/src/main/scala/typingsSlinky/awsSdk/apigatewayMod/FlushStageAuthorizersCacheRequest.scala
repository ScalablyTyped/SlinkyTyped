package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushStageAuthorizersCacheRequest extends js.Object {
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The name of the stage to flush.
    */
  var stageName: String = js.native
}

object FlushStageAuthorizersCacheRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): FlushStageAuthorizersCacheRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushStageAuthorizersCacheRequest]
  }
  @scala.inline
  implicit class FlushStageAuthorizersCacheRequestOps[Self <: FlushStageAuthorizersCacheRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

