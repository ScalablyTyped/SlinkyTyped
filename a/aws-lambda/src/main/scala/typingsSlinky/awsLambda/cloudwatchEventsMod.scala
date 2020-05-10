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
  type ScheduledEvent = EventBridgeEvent[`Scheduled Event`, js.Any]
  type ScheduledHandler = EventBridgeHandler[`Scheduled Event`, ScheduledEvent, Unit]
}

