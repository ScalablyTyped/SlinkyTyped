package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext
import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAuthorizerEvent extends js.Object {
  var apiId: js.UndefOr[String] = js.native
  var authorizationToken: js.UndefOr[String] = js.native
  var domainName: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var httpMethod: js.UndefOr[String] = js.native
  var methodArn: String = js.native
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]] | Null] = js.native
  var path: js.UndefOr[String] = js.native
  var pathParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
  var queryStringParameters: js.UndefOr[StringDictionary[String] | Null] = js.native
  var requestContext: js.UndefOr[
    APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
  ] = js.native
  var resource: js.UndefOr[String] = js.native
  var stageVariables: js.UndefOr[StringDictionary[String]] = js.native
  var `type`: String = js.native
}

object CustomAuthorizerEvent {
  @scala.inline
  def apply(methodArn: String, `type`: String): CustomAuthorizerEvent = {
    val __obj = js.Dynamic.literal(methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthorizerEvent]
  }
  @scala.inline
  implicit class CustomAuthorizerEventOps[Self <: CustomAuthorizerEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
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
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = {
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
    def withMultiValueQueryStringParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueQueryStringParameters")(null)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    def withoutQueryStringParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringParameters")(null)
        ret
    }
    @scala.inline
    def withRequestContext(value: APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestContext")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
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

