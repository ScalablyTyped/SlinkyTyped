package typingsSlinky.pulumiAws.requestValidatorMod

import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestValidatorArgs extends js.Object {
  /**
    * The name of the request validator
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * Boolean whether to validate request body. Defaults to `false`.
    */
  val validateRequestBody: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether to validate request parameters. Defaults to `false`.
    */
  val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.native
}

object RequestValidatorArgs {
  @scala.inline
  def apply(restApi: Input[String | RestApi]): RequestValidatorArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestValidatorArgs]
  }
  @scala.inline
  implicit class RequestValidatorArgsOps[Self <: RequestValidatorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withValidateRequestBody(value: Input[Boolean]): Self = {
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
    def withValidateRequestParameters(value: Input[Boolean]): Self = {
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

