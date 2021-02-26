package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBatchInferenceJobRequest extends StObject {
  
  /**
    * The configuration details of a batch inference job.
    */
  var batchInferenceJobConfig: js.UndefOr[BatchInferenceJobConfig] = js.native
  
  /**
    * The ARN of the filter to apply to the batch inference job. For more information on using filters, see Using Filters with Amazon Personalize.
    */
  var filterArn: js.UndefOr[Arn] = js.native
  
  /**
    * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in JSON format.
    */
  var jobInput: BatchInferenceJobInput = js.native
  
  /**
    * The name of the batch inference job to create.
    */
  var jobName: Name = js.native
  
  /**
    * The path to the Amazon S3 bucket where the job's output will be stored.
    */
  var jobOutput: BatchInferenceJobOutput = js.native
  
  /**
    * The number of recommendations to retreive.
    */
  var numResults: js.UndefOr[NumBatchResults] = js.native
  
  /**
    * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input and out Amazon S3 buckets respectively.
    */
  var roleArn: RoleArn = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference recommendations.
    */
  var solutionVersionArn: Arn = js.native
}
object CreateBatchInferenceJobRequest {
  
  @scala.inline
  def apply(
    jobInput: BatchInferenceJobInput,
    jobName: Name,
    jobOutput: BatchInferenceJobOutput,
    roleArn: RoleArn,
    solutionVersionArn: Arn
  ): CreateBatchInferenceJobRequest = {
    val __obj = js.Dynamic.literal(jobInput = jobInput.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobOutput = jobOutput.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchInferenceJobRequest]
  }
  
  @scala.inline
  implicit class CreateBatchInferenceJobRequestMutableBuilder[Self <: CreateBatchInferenceJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchInferenceJobConfig(value: BatchInferenceJobConfig): Self = StObject.set(x, "batchInferenceJobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchInferenceJobConfigUndefined: Self = StObject.set(x, "batchInferenceJobConfig", js.undefined)
    
    @scala.inline
    def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
    
    @scala.inline
    def setJobInput(value: BatchInferenceJobInput): Self = StObject.set(x, "jobInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobOutput(value: BatchInferenceJobOutput): Self = StObject.set(x, "jobOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResults(value: NumBatchResults): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
  }
}
