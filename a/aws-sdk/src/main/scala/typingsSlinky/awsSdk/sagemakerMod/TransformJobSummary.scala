package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformJobSummary extends js.Object {
  
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * If the transform job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * Indicates when the transform job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that the job failed.
    */
  var TransformEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typingsSlinky.awsSdk.sagemakerMod.TransformJobArn = js.native
  
  /**
    * The name of the transform job.
    */
  var TransformJobName: typingsSlinky.awsSdk.sagemakerMod.TransformJobName = js.native
  
  /**
    * The status of the transform job.
    */
  var TransformJobStatus: typingsSlinky.awsSdk.sagemakerMod.TransformJobStatus = js.native
}
object TransformJobSummary {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus
  ): TransformJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobSummary]
  }
  
  @scala.inline
  implicit class TransformJobSummaryOps[Self <: TransformJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobArn(value: TransformJobArn): Self = this.set("TransformJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = this.set("TransformJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformJobStatus(value: TransformJobStatus): Self = this.set("TransformJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setTransformEndTime(value: js.Date): Self = this.set("TransformEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformEndTime: Self = this.set("TransformEndTime", js.undefined)
  }
}
