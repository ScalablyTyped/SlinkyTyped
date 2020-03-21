package typingsSlinky.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.awsLambdaStrings.Ok
  - typingsSlinky.awsLambda.awsLambdaStrings.Dropped
  - typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed
*/
trait FirehoseRecordTransformationStatus extends js.Object

object FirehoseRecordTransformationStatus {
  @scala.inline
  def Dropped: typingsSlinky.awsLambda.awsLambdaStrings.Dropped = this.cast("Dropped")
  @scala.inline
  def Ok: typingsSlinky.awsLambda.awsLambdaStrings.Ok = this.cast("Ok")
  @scala.inline
  def ProcessingFailed: typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed = this.cast("ProcessingFailed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

