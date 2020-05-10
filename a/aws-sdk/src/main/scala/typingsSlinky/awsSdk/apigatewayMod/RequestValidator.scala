package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestValidator extends js.Object {
  /**
    * The identifier of this RequestValidator.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of this RequestValidator
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A Boolean flag to indicate whether to validate a request body according to the configured Model schema.
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean flag to indicate whether to validate request parameters (true) or not (false).
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.native
}

object RequestValidator {
  @scala.inline
  def apply(): RequestValidator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestValidator]
  }
  @scala.inline
  implicit class RequestValidatorOps[Self <: RequestValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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

