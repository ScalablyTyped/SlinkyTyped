package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLabelingJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to identify the labeling job.
    */
  var LabelingJobArn: typingsSlinky.awsSdk.sagemakerMod.LabelingJobArn = js.native
}
object CreateLabelingJobResponse {
  
  @scala.inline
  def apply(LabelingJobArn: LabelingJobArn): CreateLabelingJobResponse = {
    val __obj = js.Dynamic.literal(LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelingJobResponse]
  }
  
  @scala.inline
  implicit class CreateLabelingJobResponseMutableBuilder[Self <: CreateLabelingJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
  }
}
