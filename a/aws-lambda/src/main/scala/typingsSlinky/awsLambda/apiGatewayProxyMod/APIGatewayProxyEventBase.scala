package typingsSlinky.awsLambda.apiGatewayProxyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayProxyEventBase[TAuthorizerContext] extends js.Object {
  var body: String | Null = js.native
  var headers: StringDictionary[String] = js.native
  var httpMethod: String = js.native
  var isBase64Encoded: Boolean = js.native
  var multiValueHeaders: StringDictionary[js.Array[String]] = js.native
  var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null = js.native
  var path: String = js.native
  var pathParameters: StringDictionary[String] | Null = js.native
  var queryStringParameters: StringDictionary[String] | Null = js.native
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] = js.native
  var resource: String = js.native
  var stageVariables: StringDictionary[String] | Null = js.native
}

object APIGatewayProxyEventBase {
  @scala.inline
  def apply[TAuthorizerContext](
    headers: StringDictionary[String],
    httpMethod: String,
    isBase64Encoded: Boolean,
    multiValueHeaders: StringDictionary[js.Array[String]],
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext],
    resource: String
  ): APIGatewayProxyEventBase[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], multiValueHeaders = multiValueHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayProxyEventBase[TAuthorizerContext]]
  }
  @scala.inline
  implicit class APIGatewayProxyEventBaseOps[Self[tauthorizercontext] <: APIGatewayProxyEventBase[tauthorizercontext], TAuthorizerContext] (val x: Self[TAuthorizerContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TAuthorizerContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TAuthorizerContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TAuthorizerContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TAuthorizerContext] with Other]
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBase64Encoded(value: Boolean): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase64Encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyNull: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
        ret
    }
    @scala.inline
    def withMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueQueryStringParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueQueryStringParametersNull: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueQueryStringParameters")(null)
        ret
    }
    @scala.inline
    def withPathParameters(value: StringDictionary[String]): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathParametersNull: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(null)
        ret
    }
    @scala.inline
    def withQueryStringParameters(value: StringDictionary[String]): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryStringParametersNull: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(null)
        ret
    }
    @scala.inline
    def withStageVariables(value: StringDictionary[String]): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageVariablesNull: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariables")(null)
        ret
    }
  }
  
}

