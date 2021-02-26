package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.awsLambdaStrings.`Scheduled Event`
import typingsSlinky.awsLambda.eventbridgeMod.EventBridgeEvent
import typingsSlinky.awsLambda.eventbridgeMod.EventBridgeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudwatchEventsMod {
  
  type ScheduledEvent[TDetail] = EventBridgeEvent[`Scheduled Event`, TDetail]
  
  type ScheduledHandler[TDetail] = EventBridgeHandler[`Scheduled Event`, TDetail, Unit]
}
