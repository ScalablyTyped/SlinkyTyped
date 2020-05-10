package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeMethodRequest extends js.Object {
  /**
    * The simulated request body of an incoming invocation request.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  /**
    * A key-value map of headers to simulate an incoming invocation request.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] Specifies a test invoke method request's HTTP method.
    */
  var httpMethod: String = js.native
  /**
    * The headers as a map from string to list of values to simulate an incoming invocation request.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  /**
    * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
    */
  var pathWithQueryString: js.UndefOr[String] = js.native
  /**
    * [Required] Specifies a test invoke method request's resource ID.
    */
  var resourceId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * A key-value map of stage variables to simulate an invocation on a deployed Stage.
    */
  var stageVariables: js.UndefOr[MapOfStringToString] = js.native
}

object TestInvokeMethodRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): TestInvokeMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeMethodRequest]
  }
  @scala.inline
  implicit class TestInvokeMethodRequestOps[Self <: TestInvokeMethodRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertificateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueHeaders(value: MapOfStringToList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withPathWithQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathWithQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathWithQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathWithQueryString")(js.undefined)
        ret
    }
    @scala.inline
    def withStageVariables(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariables")(js.undefined)
        ret
    }
  }
  
}

