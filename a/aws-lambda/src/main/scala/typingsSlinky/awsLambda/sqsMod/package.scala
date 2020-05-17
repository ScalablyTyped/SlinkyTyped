package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsMod {
  type SQSHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.sqsMod.SQSEvent, scala.Unit]
  type SQSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsLambda.sqsMod.SQSMessageAttribute]
}
