package typingsSlinky.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AwsLambda {
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[js.Error | Null | String], 
    /* result */ js.UndefOr[TResult], 
    Unit
  ]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    Unit | js.Promise[TResult]
  ]
}
