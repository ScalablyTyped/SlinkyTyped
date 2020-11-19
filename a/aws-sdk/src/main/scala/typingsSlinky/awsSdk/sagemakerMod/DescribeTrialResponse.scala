package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrialResponse extends js.Object {
  
  /**
    * Who created the trial.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.native
  
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * The name of the experiment the trial is part of.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * Who last modified the trial.
    */
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  
  /**
    * When the trial was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the source and, optionally, the job type.
    */
  var Source: js.UndefOr[TrialSource] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialArn] = js.native
  
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}
object DescribeTrialResponse {
  
  @scala.inline
  def apply(): DescribeTrialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrialResponse]
  }
  
  @scala.inline
  implicit class DescribeTrialResponseOps[Self <: DescribeTrialResponse] (val x: Self) extends AnyVal {
    
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
    def setCreatedBy(value: UserContext): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = this.set("ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentName: Self = this.set("ExperimentName", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: UserContext): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setSource(value: TrialSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = this.set("TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialArn: Self = this.set("TrialArn", js.undefined)
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = this.set("TrialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialName: Self = this.set("TrialName", js.undefined)
  }
}
