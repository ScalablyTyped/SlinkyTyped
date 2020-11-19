package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.anon.`0`
  - typingsSlinky.awsLambda.anon.NotAction
*/
trait StatementAction extends js.Object
object StatementAction {
  
  @scala.inline
  def `0`(Action: String | js.Array[String]): StatementAction = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementAction]
  }
  
  @scala.inline
  def NotAction(NotAction: String | js.Array[String]): StatementAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementAction]
  }
}
