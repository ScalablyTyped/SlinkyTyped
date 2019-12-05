package typingsSlinky.awsDashLambda.awsDashLambdaMod

import typingsSlinky.awsDashLambda.awsDashLambdaStrings.Succeeded_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashLambda.awsDashLambdaStrings.Succeeded_
  - typings.awsDashLambda.awsDashLambdaStrings.TemporaryFailure
  - typings.awsDashLambda.awsDashLambdaStrings.PermanentFailure
*/
trait S3BatchResultResultCode extends js.Object

object S3BatchResultResultCode {
  @scala.inline
  def PermanentFailure: typingsSlinky.awsDashLambda.awsDashLambdaStrings.PermanentFailure = this.cast("PermanentFailure")
  @scala.inline
  def Succeeded: Succeeded_ = this.cast("Succeeded")
  @scala.inline
  def TemporaryFailure: typingsSlinky.awsDashLambda.awsDashLambdaStrings.TemporaryFailure = this.cast("TemporaryFailure")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

