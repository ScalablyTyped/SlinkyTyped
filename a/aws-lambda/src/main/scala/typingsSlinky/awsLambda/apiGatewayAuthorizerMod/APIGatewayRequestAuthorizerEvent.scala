package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typingsSlinky.awsLambda.awsLambdaStrings.REQUEST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayRequestAuthorizerEvent extends APIGatewayAuthorizerEvent {
  var headers: StringDictionary[String] | Null = js.native
  var httpMethod: String = js.native
  var methodArn: String = js.native
  var multiValueHeaders: StringDictionary[js.Array[String]] | Null = js.native
  var multiValueQueryStringParameters: StringDictionary[js.Array[String]] | Null = js.native
  var path: String = js.native
  var pathParameters: StringDictionary[String] | Null = js.native
  var queryStringParameters: StringDictionary[String] | Null = js.native
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]] = js.native
  var resource: String = js.native
  var stageVariables: StringDictionary[String] | Null = js.native
  var `type`: REQUEST = js.native
}

object APIGatewayRequestAuthorizerEvent {
  @scala.inline
  def apply(
    httpMethod: String,
    methodArn: String,
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]],
    resource: String,
    `type`: REQUEST
  ): APIGatewayRequestAuthorizerEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayRequestAuthorizerEvent]
  }
  @scala.inline
  implicit class APIGatewayRequestAuthorizerEventOps[Self <: APIGatewayRequestAuthorizerEvent] (val x: Self) extends AnyVal {
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
    def withMethodArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]]): Self = {
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
    def withType(value: REQUEST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(null)
        ret
    }
    @scala.inline
    def withMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueHeadersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueHeaders")(null)
        ret
    }
    @scala.inline
    def withMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueQueryStringParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiValueQueryStringParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueQueryStringParameters")(null)
        ret
    }
    @scala.inline
    def withPathParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParameters")(null)
        ret
    }
    @scala.inline
    def withQueryStringParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryStringParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(null)
        ret
    }
    @scala.inline
    def withStageVariables(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageVariablesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariables")(null)
        ret
    }
  }
  
}

