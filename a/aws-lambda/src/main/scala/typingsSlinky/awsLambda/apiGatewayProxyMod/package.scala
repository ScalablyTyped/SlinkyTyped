package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiGatewayProxyMod {
  
  type APIGatewayEvent = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
  
  type APIGatewayProxyCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult]
  
  type APIGatewayProxyCallbackV2 = typingsSlinky.awsLambda.handlerMod.Callback[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResultV2[scala.Nothing]
  ]
  
  type APIGatewayProxyEvent = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext]
  
  type APIGatewayProxyHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent, 
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  
  type APIGatewayProxyHandlerV2[T] = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventV2, 
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResultV2[T]
  ]
  
  type APIGatewayProxyResultV2[T] = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyStructuredResultV2 | java.lang.String | T
  
  type APIGatewayProxyWithCognitoAuthorizerEvent = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyCognitoAuthorizer]
  
  type APIGatewayProxyWithCognitoAuthorizerHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyWithCognitoAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  
  type APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext] = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]
  ]
  
  type APIGatewayProxyWithLambdaAuthorizerEventRequestContext[TAuthorizerContext] = typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]
  ]
  
  type APIGatewayProxyWithLambdaAuthorizerHandler[TAuthorizerContext] = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext], 
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  
  type ProxyCallback = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyCallback
  
  type ProxyHandler = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyHandler
  
  type ProxyResult = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
}
