package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisFirehoseTransformationMod {
  type FirehoseTransformationCallback = typingsSlinky.awsLambda.handlerMod.Callback[
    typingsSlinky.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationResult
  ]
  type FirehoseTransformationHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationEvent, 
    typingsSlinky.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationResult
  ]
}
