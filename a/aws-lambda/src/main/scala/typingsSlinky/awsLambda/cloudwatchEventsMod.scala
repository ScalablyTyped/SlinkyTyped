package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.awsLambdaStrings.`Scheduled Event`
import typingsSlinky.awsLambda.eventbridgeMod.EventBridgeEvent
import typingsSlinky.awsLambda.eventbridgeMod.EventBridgeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-lambda/trigger/cloudwatch-events", JSImport.Namespace)
@js.native
object cloudwatchEventsMod extends js.Object {
  type ScheduledEvent[TDetail] = EventBridgeEvent[`Scheduled Event`, TDetail]
  type ScheduledHandler[TDetail] = EventBridgeHandler[`Scheduled Event`, TDetail, Unit]
}

