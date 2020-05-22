package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsMod {
  type SQSHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.sqsMod.SQSEvent, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.String
    - typingsSlinky.awsLambda.awsLambdaStrings.Number
    - typingsSlinky.awsLambda.awsLambdaStrings.Binary
    - java.lang.String
  */
  type SQSMessageAttributeDataType = typingsSlinky.awsLambda.sqsMod._SQSMessageAttributeDataType | java.lang.String
  type SQSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsLambda.sqsMod.SQSMessageAttribute]
}
