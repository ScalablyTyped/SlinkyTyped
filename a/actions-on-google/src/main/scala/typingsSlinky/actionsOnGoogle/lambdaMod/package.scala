package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMod {
  type LambdaHandler = js.Function3[
    /* event */ typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
    /* context */ typingsSlinky.awsLambda.handlerMod.Context, 
    /* callback */ typingsSlinky.awsLambda.handlerMod.Callback[js.Any], 
    js.Promise[scala.Unit]
  ]
}
