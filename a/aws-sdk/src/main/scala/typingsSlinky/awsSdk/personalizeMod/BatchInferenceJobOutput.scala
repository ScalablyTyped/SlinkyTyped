package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchInferenceJobOutput extends StObject {
  
  /**
    * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
    */
  var s3DataDestination: S3DataConfig = js.native
}
object BatchInferenceJobOutput {
  
  @scala.inline
  def apply(s3DataDestination: S3DataConfig): BatchInferenceJobOutput = {
    val __obj = js.Dynamic.literal(s3DataDestination = s3DataDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobOutput]
  }
  
  @scala.inline
  implicit class BatchInferenceJobOutputMutableBuilder[Self <: BatchInferenceJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3DataDestination(value: S3DataConfig): Self = StObject.set(x, "s3DataDestination", value.asInstanceOf[js.Any])
  }
}
