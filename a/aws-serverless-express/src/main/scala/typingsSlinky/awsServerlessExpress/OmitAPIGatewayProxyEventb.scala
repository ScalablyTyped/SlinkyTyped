package typingsSlinky.awsServerlessExpress

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<aws-lambda.aws-lambda.APIGatewayProxyEvent, 'body'> */
@js.native
trait OmitAPIGatewayProxyEventb extends js.Object {
  var headers: StringDictionary[String] = js.native
  var httpMethod: String = js.native
  var isBase64Encoded: Boolean = js.native
  var multiValueHeaders: StringDictionary[js.Array[String]] = js.native
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var path: String = js.native
  var pathParameters: js.UndefOr[StringDictionary[String]] = js.native
  var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.native
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext] = js.native
  var resource: String = js.native
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.native
}

object OmitAPIGatewayProxyEventb {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpMethod: String,
    isBase64Encoded: Boolean,
    multiValueHeaders: StringDictionary[js.Array[String]],
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext],
    resource: String
  ): OmitAPIGatewayProxyEventb = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAPIGatewayProxyEventb]
  }
  @scala.inline
  implicit class OmitAPIGatewayProxyEventbOps[Self <: OmitAPIGatewayProxyEventb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBase64Encoded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase64Encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueQueryStringParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueQueryStringParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueQueryStringParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPathParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStringParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStageVariables(value: StringDictionary[String]): Self = {
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

