package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRecipeJobRequest extends StObject {
  
  /**
    * The name of the dataset that this job processes.
    */
  var DatasetName: js.UndefOr[typingsSlinky.awsSdk.databrewMod.DatasetName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
    */
  var EncryptionKeyArn: js.UndefOr[typingsSlinky.awsSdk.databrewMod.EncryptionKeyArn] = js.native
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - Server-side encryption with AWS KMS-managed keys.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typingsSlinky.awsSdk.databrewMod.EncryptionMode] = js.native
  
  /**
    * A value that enables or disables Amazon CloudWatch logging for the current AWS account. If logging is enabled, CloudWatch writes one log stream for each job run.
    */
  var LogSubscription: js.UndefOr[typingsSlinky.awsSdk.databrewMod.LogSubscription] = js.native
  
  /**
    * The maximum number of nodes that DataBrew can consume when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typingsSlinky.awsSdk.databrewMod.MaxCapacity] = js.native
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typingsSlinky.awsSdk.databrewMod.MaxRetries] = js.native
  
  /**
    * A unique name for the job.
    */
  var Name: JobName = js.native
  
  /**
    * One or more artifacts that represent the output from running the job.
    */
  var Outputs: OutputList = js.native
  
  /**
    * Either the name of an existing project, or a combination of a recipe and a dataset to associate with the recipe.
    */
  var ProjectName: js.UndefOr[typingsSlinky.awsSdk.databrewMod.ProjectName] = js.native
  
  var RecipeReference: js.UndefOr[typingsSlinky.awsSdk.databrewMod.RecipeReference] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role to be assumed for this request.
    */
  var RoleArn: Arn = js.native
  
  /**
    * Metadata tags to apply to this job dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typingsSlinky.awsSdk.databrewMod.Timeout] = js.native
}
object CreateRecipeJobRequest {
  
  @scala.inline
  def apply(Name: JobName, Outputs: OutputList, RoleArn: Arn): CreateRecipeJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipeJobRequest]
  }
  
  @scala.inline
  implicit class CreateRecipeJobRequestMutableBuilder[Self <: CreateRecipeJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    @scala.inline
    def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    @scala.inline
    def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
    @scala.inline
    def setLogSubscription(value: LogSubscription): Self = StObject.set(x, "LogSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSubscriptionUndefined: Self = StObject.set(x, "LogSubscription", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: MaxCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: MaxRetries): Self = StObject.set(x, "MaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "MaxRetries", js.undefined)
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: OutputList): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    @scala.inline
    def setRecipeReference(value: RecipeReference): Self = StObject.set(x, "RecipeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeReferenceUndefined: Self = StObject.set(x, "RecipeReference", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
