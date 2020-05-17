package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayAuthorizerMod {
  type APIGatewayAuthorizerCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult]
  type APIGatewayAuthorizerHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayAuthorizerWithContextCallback[TAuthorizerContext /* <: typingsSlinky.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsSlinky.awsLambda.handlerMod.Callback[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayAuthorizerWithContextHandler[TAuthorizerContext /* <: typingsSlinky.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayRequestAuthorizerHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext /* <: typingsSlinky.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayTokenAuthorizerHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext /* <: typingsSlinky.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type AuthResponse = typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  type AuthResponseContext = typingsSlinky.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
  type Condition = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ConditionBlock = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.Condition | js.Array[typingsSlinky.awsLambda.apiGatewayAuthorizerMod.Condition]
  ]
  type CustomAuthorizerCallback = typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerCallback
  type CustomAuthorizerHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.CustomAuthorizerEvent, 
    typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type CustomAuthorizerResult = typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  type Statement = typingsSlinky.awsLambda.apiGatewayAuthorizerMod.BaseStatement with typingsSlinky.awsLambda.apiGatewayAuthorizerMod.StatementAction with (typingsSlinky.awsLambda.apiGatewayAuthorizerMod.StatementResource | typingsSlinky.awsLambda.apiGatewayAuthorizerMod.StatementPrincipal)
  type StatementPrincipal = typingsSlinky.awsLambda.apiGatewayAuthorizerMod.MaybeStatementResource with (typingsSlinky.awsLambda.anon.Principal | typingsSlinky.awsLambda.anon.NotPrincipal)
  type StatementResource = typingsSlinky.awsLambda.apiGatewayAuthorizerMod.MaybeStatementPrincipal with (typingsSlinky.awsLambda.anon.Resource | typingsSlinky.awsLambda.anon.NotResource)
}
