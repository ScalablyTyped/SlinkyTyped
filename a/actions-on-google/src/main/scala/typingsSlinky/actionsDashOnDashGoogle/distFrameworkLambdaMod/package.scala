package typingsSlinky.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFrameworkLambdaMod {
  import typingsSlinky.actionsDashOnDashGoogle.distCommonMod.JsonObject
  import typingsSlinky.awsDashLambda.awsDashLambdaMod.Callback
  import typingsSlinky.awsDashLambda.awsDashLambdaMod.Context

  type LambdaHandler = js.Function3[
    /* event */ JsonObject, 
    /* context */ Context, 
    /* callback */ Callback[js.Any], 
    js.Promise[Unit]
  ]
}
