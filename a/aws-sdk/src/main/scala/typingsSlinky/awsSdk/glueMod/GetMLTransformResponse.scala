package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTransformResponse extends StObject {
  
  /**
    * The date and time when the transform was created.
    */
  var CreatedOn: js.UndefOr[js.Date] = js.native
  
  /**
    * A description of the transform.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The latest evaluation metrics.
    */
  var EvaluationMetrics: js.UndefOr[typingsSlinky.awsSdk.glueMod.EvaluationMetrics] = js.native
  
  /**
    * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see AWS Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  
  /**
    * A list of AWS Glue table definitions used by the transform.
    */
  var InputRecordTables: js.UndefOr[GlueTables] = js.native
  
  /**
    * The number of labels available for this transform.
    */
  var LabelCount: js.UndefOr[typingsSlinky.awsSdk.glueMod.LabelCount] = js.native
  
  /**
    * The date and time when the transform was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.  When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only.
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The maximum number of times to retry a task for this transform after a task run fails.
    */
  var MaxRetries: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The unique name given to the transform when it was created.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * The number of workers of a defined workerType that are allocated when this task runs.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The configuration parameters that are specific to the algorithm used.
    */
  var Parameters: js.UndefOr[TransformParameters] = js.native
  
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions.
    */
  var Role: js.UndefOr[RoleString] = js.native
  
  /**
    * The Map&lt;Column, Type&gt; object that represents the schema that this transform accepts. Has an upper bound of 100 columns.
    */
  var Schema: js.UndefOr[TransformSchema] = js.native
  
  /**
    * The last known status of the transform (to indicate whether it can be used or not). One of "NOT_READY", "READY", or "DELETING".
    */
  var Status: js.UndefOr[TransformStatusType] = js.native
  
  /**
    * The timeout for a task run for this transform in minutes. This is the maximum time that a task run for this transform can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typingsSlinky.awsSdk.glueMod.Timeout] = js.native
  
  /**
    * The encryption-at-rest settings of the transform that apply to accessing user data. Machine learning transforms can access user data encrypted in Amazon S3 using KMS.
    */
  var TransformEncryption: js.UndefOr[typingsSlinky.awsSdk.glueMod.TransformEncryption] = js.native
  
  /**
    * The unique identifier of the transform, generated at the time that the transform was created.
    */
  var TransformId: js.UndefOr[HashString] = js.native
  
  /**
    * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typingsSlinky.awsSdk.glueMod.WorkerType] = js.native
}
object GetMLTransformResponse {
  
  @scala.inline
  def apply(): GetMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTransformResponse]
  }
  
  @scala.inline
  implicit class GetMLTransformResponseMutableBuilder[Self <: GetMLTransformResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "CreatedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOnUndefined: Self = StObject.set(x, "CreatedOn", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEvaluationMetrics(value: EvaluationMetrics): Self = StObject.set(x, "EvaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMetricsUndefined: Self = StObject.set(x, "EvaluationMetrics", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    @scala.inline
    def setInputRecordTables(value: GlueTables): Self = StObject.set(x, "InputRecordTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRecordTablesUndefined: Self = StObject.set(x, "InputRecordTables", js.undefined)
    
    @scala.inline
    def setInputRecordTablesVarargs(value: GlueTable*): Self = StObject.set(x, "InputRecordTables", js.Array(value :_*))
    
    @scala.inline
    def setLabelCount(value: LabelCount): Self = StObject.set(x, "LabelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCountUndefined: Self = StObject.set(x, "LabelCount", js.undefined)
    
    @scala.inline
    def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: NullableDouble): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: NullableInteger): Self = StObject.set(x, "MaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "MaxRetries", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    @scala.inline
    def setParameters(value: TransformParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setRole(value: RoleString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setSchema(value: TransformSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: SchemaColumn*): Self = StObject.set(x, "Schema", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: TransformStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    @scala.inline
    def setTransformEncryption(value: TransformEncryption): Self = StObject.set(x, "TransformEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformEncryptionUndefined: Self = StObject.set(x, "TransformEncryption", js.undefined)
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
    
    @scala.inline
    def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
  }
}
