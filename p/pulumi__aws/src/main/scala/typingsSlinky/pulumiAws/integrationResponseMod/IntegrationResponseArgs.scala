package typingsSlinky.pulumiAws.integrationResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegrationResponseArgs extends js.Object {
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  val contentHandling: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Input[String] = js.native
  /**
    * The API resource ID
    */
  val resourceId: Input[String] = js.native
  /**
    * A map of response parameters that can be read from the backend response.
    * For example: `responseParameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
    */
  val responseParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A map specifying the templates used to transform the integration response body
    */
  val responseTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * Specifies the regular expression pattern used to choose
    * an integration response based on the response from the backend. Setting this to `-` makes the integration the default one.
    * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
    * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
    */
  val selectionPattern: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP status code
    */
  val statusCode: Input[String] = js.native
}

object IntegrationResponseArgs {
  @scala.inline
  def apply(
    httpMethod: Input[String],
    resourceId: Input[String],
    restApi: Input[String | RestApi],
    statusCode: Input[String]
  ): IntegrationResponseArgs = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationResponseArgs]
  }
  @scala.inline
  implicit class IntegrationResponseArgsOps[Self <: IntegrationResponseArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpMethod(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentHandling(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHandling")(js.undefined)
        ret
    }
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
    def withSelectionPattern(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPattern")(js.undefined)
        ret
    }
  }
  
}

