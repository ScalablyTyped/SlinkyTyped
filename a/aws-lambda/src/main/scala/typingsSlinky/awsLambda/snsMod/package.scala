package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snsMod {
  type SNSHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.snsMod.SNSEvent, scala.Unit]
  type SNSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsLambda.snsMod.SNSMessageAttribute]
}
