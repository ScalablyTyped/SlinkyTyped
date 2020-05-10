package typingsSlinky.awsLambda.s3BatchMod

import typingsSlinky.awsLambda.awsLambdaStrings.Succeeded_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.awsLambdaStrings.Succeeded_
  - typingsSlinky.awsLambda.awsLambdaStrings.TemporaryFailure
  - typingsSlinky.awsLambda.awsLambdaStrings.PermanentFailure
*/
trait S3BatchResultResultCode extends js.Object

object S3BatchResultResultCode {
  @scala.inline
  def PermanentFailure: typingsSlinky.awsLambda.awsLambdaStrings.PermanentFailure = "PermanentFailure".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.PermanentFailure]
  @scala.inline
  def Succeeded: Succeeded_ = "Succeeded".asInstanceOf[Succeeded_]
  @scala.inline
  def TemporaryFailure: typingsSlinky.awsLambda.awsLambdaStrings.TemporaryFailure = "TemporaryFailure".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.TemporaryFailure]
}

