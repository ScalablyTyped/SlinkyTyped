package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialComponentSourceDetail extends StObject {
  
  /**
    * Information about a processing job that's the source of a trial component.
    */
  var ProcessingJob: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingJob] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  
  /**
    * Information about a training job that's the source of a trial component.
    */
  var TrainingJob: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJob] = js.native
  
  /**
    * Information about a transform job that's the source of a trial component.
    */
  var TransformJob: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TransformJob] = js.native
}
object TrialComponentSourceDetail {
  
  @scala.inline
  def apply(): TrialComponentSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentSourceDetail]
  }
  
  @scala.inline
  implicit class TrialComponentSourceDetailMutableBuilder[Self <: TrialComponentSourceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessingJob(value: ProcessingJob): Self = StObject.set(x, "ProcessingJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobUndefined: Self = StObject.set(x, "ProcessingJob", js.undefined)
    
    @scala.inline
    def setSourceArn(value: TrialComponentSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setTrainingJob(value: TrainingJob): Self = StObject.set(x, "TrainingJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobUndefined: Self = StObject.set(x, "TrainingJob", js.undefined)
    
    @scala.inline
    def setTransformJob(value: TransformJob): Self = StObject.set(x, "TransformJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobUndefined: Self = StObject.set(x, "TransformJob", js.undefined)
  }
}
