package typingsSlinky.pulumiAws.getFunctionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.lambda.GetFunctionDeadLetterConfig
import typingsSlinky.pulumiAws.outputMod.lambda.GetFunctionEnvironment
import typingsSlinky.pulumiAws.outputMod.lambda.GetFunctionFileSystemConfig
import typingsSlinky.pulumiAws.outputMod.lambda.GetFunctionTracingConfig
import typingsSlinky.pulumiAws.outputMod.lambda.GetFunctionVpcConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionResult extends js.Object {
  
  /**
    * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualifiedArn`.
    */
  val arn: String = js.native
  
  /**
    * Configure the function's *dead letter queue*.
    */
  val deadLetterConfig: GetFunctionDeadLetterConfig = js.native
  
  /**
    * Description of what your Lambda Function does.
    */
  val description: String = js.native
  
  /**
    * The Lambda environment's configuration settings.
    */
  val environment: GetFunctionEnvironment = js.native
  
  /**
    * The connection settings for an Amazon EFS file system.
    */
  val fileSystemConfigs: js.Array[GetFunctionFileSystemConfig] = js.native
  
  val functionName: String = js.native
  
  /**
    * The function entrypoint in your code.
    */
  val handler: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway.
    */
  val invokeArn: String = js.native
  
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: String = js.native
  
  /**
    * The date this resource was last modified.
    */
  val lastModified: String = js.native
  
  /**
    * A list of Lambda Layer ARNs attached to your Lambda Function.
    */
  val layers: js.Array[String] = js.native
  
  /**
    * Amount of memory in MB your Lambda Function can use at runtime.
    */
  val memorySize: Double = js.native
  
  /**
    * Qualified (`:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `arn`.
    */
  val qualifiedArn: String = js.native
  
  val qualifier: js.UndefOr[String] = js.native
  
  /**
    * The amount of reserved concurrent executions for this lambda function or `-1` if unreserved.
    */
  val reservedConcurrentExecutions: Double = js.native
  
  /**
    * IAM role attached to the Lambda Function.
    */
  val role: String = js.native
  
  /**
    * The runtime environment for the Lambda function..
    */
  val runtime: String = js.native
  
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: String = js.native
  
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Double = js.native
  
  val tags: StringDictionary[String] = js.native
  
  /**
    * The function execution time at which Lambda should terminate the function.
    */
  val timeout: Double = js.native
  
  /**
    * Tracing settings of the function.
    */
  val tracingConfig: GetFunctionTracingConfig = js.native
  
  /**
    * The version of the Lambda function.
    */
  val version: String = js.native
  
  /**
    * VPC configuration associated with your Lambda function.
    */
  val vpcConfig: GetFunctionVpcConfig = js.native
}
object GetFunctionResult {
  
  @scala.inline
  def apply(
    arn: String,
    deadLetterConfig: GetFunctionDeadLetterConfig,
    description: String,
    environment: GetFunctionEnvironment,
    fileSystemConfigs: js.Array[GetFunctionFileSystemConfig],
    functionName: String,
    handler: String,
    id: String,
    invokeArn: String,
    kmsKeyArn: String,
    lastModified: String,
    layers: js.Array[String],
    memorySize: Double,
    qualifiedArn: String,
    reservedConcurrentExecutions: Double,
    role: String,
    runtime: String,
    sourceCodeHash: String,
    sourceCodeSize: Double,
    tags: StringDictionary[String],
    timeout: Double,
    tracingConfig: GetFunctionTracingConfig,
    version: String,
    vpcConfig: GetFunctionVpcConfig
  ): GetFunctionResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], deadLetterConfig = deadLetterConfig.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], fileSystemConfigs = fileSystemConfigs.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invokeArn = invokeArn.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], memorySize = memorySize.asInstanceOf[js.Any], qualifiedArn = qualifiedArn.asInstanceOf[js.Any], reservedConcurrentExecutions = reservedConcurrentExecutions.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sourceCodeHash = sourceCodeHash.asInstanceOf[js.Any], sourceCodeSize = sourceCodeSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], tracingConfig = tracingConfig.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionResult]
  }
  
  @scala.inline
  implicit class GetFunctionResultOps[Self <: GetFunctionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterConfig(value: GetFunctionDeadLetterConfig): Self = this.set("deadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: GetFunctionEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemConfigsVarargs(value: GetFunctionFileSystemConfig*): Self = this.set("fileSystemConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFileSystemConfigs(value: js.Array[GetFunctionFileSystemConfig]): Self = this.set("fileSystemConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: String): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeArn(value: String): Self = this.set("invokeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySize(value: Double): Self = this.set("memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifiedArn(value: String): Self = this.set("qualifiedArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedConcurrentExecutions(value: Double): Self = this.set("reservedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeHash(value: String): Self = this.set("sourceCodeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeSize(value: Double): Self = this.set("sourceCodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingConfig(value: GetFunctionTracingConfig): Self = this.set("tracingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfig(value: GetFunctionVpcConfig): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
  }
}
