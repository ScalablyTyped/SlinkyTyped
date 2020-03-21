package typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.awsLambdaStrings.STARTED
  - typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED
  - typingsSlinky.awsLambda.awsLambdaStrings.RESUMED
  - typingsSlinky.awsLambda.awsLambdaStrings.FAILED
  - typingsSlinky.awsLambda.awsLambdaStrings.CANCELED
  - typingsSlinky.awsLambda.awsLambdaStrings.SUPERSEDED
*/
trait CodePipelineState extends js.Object

object CodePipelineState {
  @scala.inline
  def CANCELED: typingsSlinky.awsLambda.awsLambdaStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def FAILED: typingsSlinky.awsLambda.awsLambdaStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def RESUMED: typingsSlinky.awsLambda.awsLambdaStrings.RESUMED = this.cast("RESUMED")
  @scala.inline
  def STARTED: typingsSlinky.awsLambda.awsLambdaStrings.STARTED = this.cast("STARTED")
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  def SUPERSEDED: typingsSlinky.awsLambda.awsLambdaStrings.SUPERSEDED = this.cast("SUPERSEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

