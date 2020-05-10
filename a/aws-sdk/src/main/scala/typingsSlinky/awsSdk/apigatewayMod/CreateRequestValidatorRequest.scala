package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRequestValidatorRequest extends js.Object {
  /**
    * The name of the to-be-created RequestValidator.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * A Boolean flag to indicate whether to validate request body according to the configured model schema for the method (true) or not (false).
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean flag to indicate whether to validate request parameters, true, or not false.
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.native
}

object CreateRequestValidatorRequest {
  @scala.inline
  def apply(restApiId: String): CreateRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequestValidatorRequest]
  }
  @scala.inline
  implicit class CreateRequestValidatorRequestOps[Self <: CreateRequestValidatorRequest] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateRequestBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRequestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRequestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateRequestParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRequestParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateRequestParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRequestParameters")(js.undefined)
        ret
    }
  }
  
}

