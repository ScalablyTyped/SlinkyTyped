package typingsSlinky.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.awsLambdaStrings.Ok
  - typingsSlinky.awsLambda.awsLambdaStrings.Dropped
  - typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed
*/
trait FirehoseRecordTransformationStatus extends js.Object
object FirehoseRecordTransformationStatus {
  
  @scala.inline
  def Dropped: typingsSlinky.awsLambda.awsLambdaStrings.Dropped = "Dropped".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.Dropped]
  
  @scala.inline
  def Ok: typingsSlinky.awsLambda.awsLambdaStrings.Ok = "Ok".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.Ok]
  
  @scala.inline
  def ProcessingFailed: typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed = "ProcessingFailed".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed]
}
