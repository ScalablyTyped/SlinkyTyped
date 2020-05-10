package typingsSlinky.pulumiAws.responseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseState extends js.Object {
  /**
    * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
    */
  val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A map specifying the templates used to transform the response body.
    */
  val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The response type of the associated GatewayResponse.
    */
  val responseType: js.UndefOr[Input[String]] = js.native
  /**
    * The string identifier of the associated REST API.
    */
  val restApiId: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP status code of the Gateway Response.
    */
  val statusCode: js.UndefOr[Input[String]] = js.native
}

object ResponseState {
  @scala.inline
  def apply(): ResponseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseState]
  }
  @scala.inline
  implicit class ResponseStateOps[Self <: ResponseState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseParameters(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTemplates(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withRestApiId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

