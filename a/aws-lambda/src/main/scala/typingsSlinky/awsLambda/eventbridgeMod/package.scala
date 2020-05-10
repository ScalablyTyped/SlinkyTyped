package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventbridgeMod {
  type EventBridgeHandler[TDetailType /* <: java.lang.String */, TDetail, TResult] = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.eventbridgeMod.EventBridgeEvent[TDetailType, TDetail], 
    TResult
  ]
}
