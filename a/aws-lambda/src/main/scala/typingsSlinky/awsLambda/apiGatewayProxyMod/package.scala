package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayProxyMod {
  type APIGatewayEvent = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
  type APIGatewayProxyCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult]
  type APIGatewayProxyEvent = typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext]
  type APIGatewayProxyHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent, 
    typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
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
