package typingsSlinky.awsLambda.apiGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] extends js.Object {
  var accountId: String = js.native
  var apiId: String = js.native
  // This one is a bit confusing: it is not actually present in authorizer calls
  // and proxy calls without an authorizer. We model this by allowing undefined in the type,
  // since it ends up the same and avoids breaking users that are testing the property.
  // This lets us allow parameterizing the authorizer for proxy events that know what authorizer
  // context values they have.
  var authorizer: TAuthorizerContext = js.native
  var connectedAt: js.UndefOr[Double] = js.native
  var connectionId: js.UndefOr[String] = js.native
  var domainName: js.UndefOr[String] = js.native
  var domainPrefix: js.UndefOr[String] = js.native
  var eventType: js.UndefOr[String] = js.native
  var extendedRequestId: js.UndefOr[String] = js.native
  var httpMethod: String = js.native
  var identity: APIGatewayEventIdentity = js.native
  var messageDirection: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[String | Null] = js.native
  var path: String = js.native
  var protocol: String = js.native
  var requestId: String = js.native
  var requestTime: js.UndefOr[String] = js.native
  var requestTimeEpoch: Double = js.native
  var resourceId: String = js.native
  var resourcePath: String = js.native
  var routeKey: js.UndefOr[String] = js.native
  var stage: String = js.native
}

object APIGatewayEventRequestContextWithAuthorizer {
  @scala.inline
  def apply[TAuthorizerContext](
    accountId: String,
    apiId: String,
    authorizer: TAuthorizerContext,
    httpMethod: String,
    identity: APIGatewayEventIdentity,
    path: String,
    protocol: String,
    requestId: String,
    requestTimeEpoch: Double,
    resourceId: String,
    resourcePath: String,
    stage: String
  ): APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], authorizer = authorizer.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], requestTimeEpoch = requestTimeEpoch.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]]
  }
  @scala.inline
  implicit class APIGatewayEventRequestContextWithAuthorizerOps[Self[tauthorizercontext] <: APIGatewayEventRequestContextWithAuthorizer[tauthorizercontext], TAuthorizerContext] (val x: Self[TAuthorizerContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TAuthorizerContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TAuthorizerContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TAuthorizerContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TAuthorizerContext] with Other]
    @scala.inline
    def withAccountId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizer(value: TAuthorizerContext): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpMethod(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: APIGatewayEventIdentity): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTimeEpoch(value: Double): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeEpoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourcePath(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectedAt(value: Double): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedAt: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainPrefix(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainPrefix: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withEventType(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedRequestId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedRequestId: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageDirection(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDirection: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageIdNull: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(null)
        ret
    }
    @scala.inline
    def withRequestTime(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTime: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteKey(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteKey: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeKey")(js.undefined)
        ret
    }
  }
  
}

