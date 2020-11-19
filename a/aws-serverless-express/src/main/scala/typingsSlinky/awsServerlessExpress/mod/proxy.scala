package typingsSlinky.awsServerlessExpress.mod

import typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typingsSlinky.awsLambda.handlerMod.Context
import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy extends js.Object {
  
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context): Server = js.native
}
