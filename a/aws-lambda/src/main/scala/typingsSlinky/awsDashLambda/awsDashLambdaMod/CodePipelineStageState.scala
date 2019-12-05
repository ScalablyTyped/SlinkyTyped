package typingsSlinky.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashLambda.awsDashLambdaStrings.STARTED
  - typings.awsDashLambda.awsDashLambdaStrings.SUCCEEDED
  - typings.awsDashLambda.awsDashLambdaStrings.RESUMED
  - typings.awsDashLambda.awsDashLambdaStrings.FAILED
  - typings.awsDashLambda.awsDashLambdaStrings.CANCELED
*/
trait CodePipelineStageState extends js.Object

object CodePipelineStageState {
  @scala.inline
  def CANCELED: typingsSlinky.awsDashLambda.awsDashLambdaStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def FAILED: typingsSlinky.awsDashLambda.awsDashLambdaStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def RESUMED: typingsSlinky.awsDashLambda.awsDashLambdaStrings.RESUMED = this.cast("RESUMED")
  @scala.inline
  def STARTED: typingsSlinky.awsDashLambda.awsDashLambdaStrings.STARTED = this.cast("STARTED")
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsDashLambda.awsDashLambdaStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

