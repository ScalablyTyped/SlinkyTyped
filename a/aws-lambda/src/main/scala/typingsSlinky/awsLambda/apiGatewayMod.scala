package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayMod {
  
  type APIGatewayAuthorizerResultContext = StringDictionary[js.UndefOr[String | Double | Boolean | Null]]
  
  type APIGatewayEventDefaultAuthorizerContext = js.UndefOr[Null | StringDictionary[js.Any]]
  
  @js.native
  trait APIGatewayEventIdentity extends StObject {
    
    var accessKey: String | Null = js.native
    
    var accountId: String | Null = js.native
    
    var apiKey: String | Null = js.native
    
    var apiKeyId: String | Null = js.native
    
    var caller: String | Null = js.native
    
    var cognitoAuthenticationProvider: String | Null = js.native
    
    var cognitoAuthenticationType: String | Null = js.native
    
    var cognitoIdentityId: String | Null = js.native
    
    var cognitoIdentityPoolId: String | Null = js.native
    
    var principalOrgId: String | Null = js.native
    
    var sourceIp: String = js.native
    
    var user: String | Null = js.native
    
    var userAgent: String | Null = js.native
    
    var userArn: String | Null = js.native
  }
  object APIGatewayEventIdentity {
    
    @scala.inline
    def apply(sourceIp: String): APIGatewayEventIdentity = {
      val __obj = js.Dynamic.literal(sourceIp = sourceIp.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayEventIdentity]
    }
    
    @scala.inline
    implicit class APIGatewayEventIdentityMutableBuilder[Self <: APIGatewayEventIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyNull: Self = StObject.set(x, "accessKey", null)
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdNull: Self = StObject.set(x, "accountId", null)
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyId(value: String): Self = StObject.set(x, "apiKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyIdNull: Self = StObject.set(x, "apiKeyId", null)
      
      @scala.inline
      def setApiKeyNull: Self = StObject.set(x, "apiKey", null)
      
      @scala.inline
      def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallerNull: Self = StObject.set(x, "caller", null)
      
      @scala.inline
      def setCognitoAuthenticationProvider(value: String): Self = StObject.set(x, "cognitoAuthenticationProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoAuthenticationProviderNull: Self = StObject.set(x, "cognitoAuthenticationProvider", null)
      
      @scala.inline
      def setCognitoAuthenticationType(value: String): Self = StObject.set(x, "cognitoAuthenticationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoAuthenticationTypeNull: Self = StObject.set(x, "cognitoAuthenticationType", null)
      
      @scala.inline
      def setCognitoIdentityId(value: String): Self = StObject.set(x, "cognitoIdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityIdNull: Self = StObject.set(x, "cognitoIdentityId", null)
      
      @scala.inline
      def setCognitoIdentityPoolId(value: String): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityPoolIdNull: Self = StObject.set(x, "cognitoIdentityPoolId", null)
      
      @scala.inline
      def setPrincipalOrgId(value: String): Self = StObject.set(x, "principalOrgId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalOrgIdNull: Self = StObject.set(x, "principalOrgId", null)
      
      @scala.inline
      def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
      
      @scala.inline
      def setUserArn(value: String): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserArnNull: Self = StObject.set(x, "userArn", null)
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  type APIGatewayEventRequestContext = APIGatewayEventRequestContextWithAuthorizer[APIGatewayEventDefaultAuthorizerContext]
  
  @js.native
  trait APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext] extends StObject {
    
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
    implicit class APIGatewayEventRequestContextWithAuthorizerMutableBuilder[Self <: APIGatewayEventRequestContextWithAuthorizer[_], TAuthorizerContext] (val x: Self with APIGatewayEventRequestContextWithAuthorizer[TAuthorizerContext]) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizer(value: TAuthorizerContext): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectedAt(value: Double): Self = StObject.set(x, "connectedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectedAtUndefined: Self = StObject.set(x, "connectedAt", js.undefined)
      
      @scala.inline
      def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setDomainPrefix(value: String): Self = StObject.set(x, "domainPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainPrefixUndefined: Self = StObject.set(x, "domainPrefix", js.undefined)
      
      @scala.inline
      def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
      
      @scala.inline
      def setExtendedRequestId(value: String): Self = StObject.set(x, "extendedRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedRequestIdUndefined: Self = StObject.set(x, "extendedRequestId", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: APIGatewayEventIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDirection(value: String): Self = StObject.set(x, "messageDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDirectionUndefined: Self = StObject.set(x, "messageDirection", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdNull: Self = StObject.set(x, "messageId", null)
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeEpoch(value: Double): Self = StObject.set(x, "requestTimeEpoch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
      
      @scala.inline
      def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcePath(value: String): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteKeyUndefined: Self = StObject.set(x, "routeKey", js.undefined)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
}
