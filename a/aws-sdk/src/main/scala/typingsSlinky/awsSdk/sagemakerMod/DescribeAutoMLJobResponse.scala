package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAutoMLJobResponse extends StObject {
  
  /**
    * Returns the job's ARN.
    */
  var AutoMLJobArn: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn = js.native
  
  /**
    * Returns information on the job's artifacts found in AutoMLJobArtifacts.
    */
  var AutoMLJobArtifacts: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArtifacts] = js.native
  
  /**
    * Returns the job's config.
    */
  var AutoMLJobConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobConfig] = js.native
  
  /**
    * Returns the name of a job.
    */
  var AutoMLJobName: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobName = js.native
  
  /**
    * Returns the job's objective.
    */
  var AutoMLJobObjective: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  
  /**
    * Returns the job's AutoMLJobSecondaryStatus.
    */
  var AutoMLJobSecondaryStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobSecondaryStatus = js.native
  
  /**
    * Returns the job's AutoMLJobStatus.
    */
  var AutoMLJobStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobStatus = js.native
  
  /**
    * Returns the job's BestCandidate.
    */
  var BestCandidate: js.UndefOr[AutoMLCandidate] = js.native
  
  /**
    * Returns the job's creation time.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * Returns the job's end time.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Returns the job's FailureReason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  
  /**
    * Returns the job's output from GenerateCandidateDefinitionsOnly.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.GenerateCandidateDefinitionsOnly] = js.native
  
  /**
    * Returns the job's input data config.
    */
  var InputDataConfig: AutoMLInputDataConfig = js.native
  
  /**
    * Returns the job's last modified time.
    */
  var LastModifiedTime: js.Date = js.native
  
  /**
    * Returns the job's output data config.
    */
  var OutputDataConfig: AutoMLOutputDataConfig = js.native
  
  /**
    * Returns the job's problem type.
    */
  var ProblemType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProblemType] = js.native
  
  /**
    * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not provided by you. If you do provide them, then they'll be the same as provided.
    */
  var ResolvedAttributes: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ResolvedAttributes] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read permission to the input data location and write permission to the output data location in Amazon S3.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
}
object DescribeAutoMLJobResponse {
  
  @scala.inline
  def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: js.Date,
    InputDataConfig: AutoMLInputDataConfig,
    LastModifiedTime: js.Date,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): DescribeAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobResponse]
  }
  
  @scala.inline
  implicit class DescribeAutoMLJobResponseMutableBuilder[Self <: DescribeAutoMLJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArtifacts(value: AutoMLJobArtifacts): Self = StObject.set(x, "AutoMLJobArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArtifactsUndefined: Self = StObject.set(x, "AutoMLJobArtifacts", js.undefined)
    
    @scala.inline
    def setAutoMLJobConfig(value: AutoMLJobConfig): Self = StObject.set(x, "AutoMLJobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobConfigUndefined: Self = StObject.set(x, "AutoMLJobConfig", js.undefined)
    
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    @scala.inline
    def setAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = StObject.set(x, "AutoMLJobSecondaryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobStatus(value: AutoMLJobStatus): Self = StObject.set(x, "AutoMLJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestCandidate(value: AutoMLCandidate): Self = StObject.set(x, "BestCandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestCandidateUndefined: Self = StObject.set(x, "BestCandidate", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateCandidateDefinitionsOnlyUndefined: Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: AutoMLInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigVarargs(value: AutoMLChannel*): Self = StObject.set(x, "InputDataConfig", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemType(value: ProblemType): Self = StObject.set(x, "ProblemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemTypeUndefined: Self = StObject.set(x, "ProblemType", js.undefined)
    
    @scala.inline
    def setResolvedAttributes(value: ResolvedAttributes): Self = StObject.set(x, "ResolvedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedAttributesUndefined: Self = StObject.set(x, "ResolvedAttributes", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
