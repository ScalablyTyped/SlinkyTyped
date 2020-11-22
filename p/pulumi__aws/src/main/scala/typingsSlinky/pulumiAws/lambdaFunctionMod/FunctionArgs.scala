package typingsSlinky.pulumiAws.lambdaFunctionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionDeadLetterConfig
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionEnvironment
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionFileSystemConfig
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionTracingConfig
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionVpcConfig
import typingsSlinky.pulumiPulumi.mod.asset.Archive
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionArgs extends js.Object {
  
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: js.UndefOr[Input[Archive]] = js.native
  
  /**
    * Nested block to configure the function's *dead letter queue*. See details below.
    */
  val deadLetterConfig: js.UndefOr[Input[FunctionDeadLetterConfig]] = js.native
  
  /**
    * Description of what your Lambda Function does.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Lambda environment's configuration settings. Fields documented below.
    */
  val environment: js.UndefOr[Input[FunctionEnvironment]] = js.native
  
  /**
    * The connection settings for an EFS file system. Fields documented below. Before creating or updating Lambda functions with `fileSystemConfig`, EFS mount targets much be in available lifecycle state. Use `dependsOn` to explicitly declare this dependency. See [Using Amazon EFS with Lambda](https://docs.aws.amazon.com/lambda/latest/dg/services-efs.html).
    */
  val fileSystemConfig: js.UndefOr[Input[FunctionFileSystemConfig]] = js.native
  
  /**
    * The function [entrypoint](https://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events-create-test-function.html) in your code.
    */
  val handler: Input[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key that is used to encrypt environment variables. If this configuration is not provided when environment variables are in use, AWS Lambda uses a default service key. If this configuration is provided when environment variables are not in use, the AWS Lambda API does not save this configuration and this provider will show a perpetual difference of adding the key. To fix the perpetual difference, remove this configuration.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
    */
  val layers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html)
    */
  val memorySize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A unique name for your Lambda Function.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
    */
  val publish: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
    */
  val reservedConcurrentExecutions: js.UndefOr[Input[Double]] = js.native
  
  /**
    * IAM role attached to the Lambda Function. This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See [Lambda Permission Model](https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html) for more details.
    */
  val role: Input[ARN] = js.native
  
  /**
    * See [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_CreateFunction.html#SSS-CreateFunction-request-Runtime) for valid values.
    */
  val runtime: Input[String] = js.native
  
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: js.UndefOr[Input[String]] = js.native
  
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `filebase64sha256("file.zip")` (this provider 0.11.12 and later) or `base64sha256(file("file.zip"))` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda function source archive.
    */
  val sourceCodeHash: js.UndefOr[Input[String]] = js.native
  
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html)
    */
  val timeout: js.UndefOr[Input[Double]] = js.native
  
  val tracingConfig: js.UndefOr[Input[FunctionTracingConfig]] = js.native
  
  /**
    * Provide this to allow your function to access your VPC. Fields documented below. See [Lambda in VPC](http://docs.aws.amazon.com/lambda/latest/dg/vpc.html)
    */
  val vpcConfig: js.UndefOr[Input[FunctionVpcConfig]] = js.native
}
object FunctionArgs {
  
  @scala.inline
  implicit class FunctionArgsOps[Self <: FunctionArgs] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: Input[String]): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Input[ARN]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: Input[String]): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Input[Archive]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDeadLetterConfig(value: Input[FunctionDeadLetterConfig]): Self = this.set("deadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterConfig: Self = this.set("deadLetterConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Input[FunctionEnvironment]): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setFileSystemConfig(value: Input[FunctionFileSystemConfig]): Self = this.set("fileSystemConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemConfig: Self = this.set("fileSystemConfig", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Input[String]*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: Input[js.Array[Input[String]]]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMemorySize(value: Input[Double]): Self = this.set("memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySize: Self = this.set("memorySize", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublish(value: Input[Boolean]): Self = this.set("publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublish: Self = this.set("publish", js.undefined)
    
    @scala.inline
    def setReservedConcurrentExecutions(value: Input[Double]): Self = this.set("reservedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedConcurrentExecutions: Self = this.set("reservedConcurrentExecutions", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: Input[String]): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: Input[String]): Self = this.set("s3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("s3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: Input[String]): Self = this.set("s3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ObjectVersion: Self = this.set("s3ObjectVersion", js.undefined)
    
    @scala.inline
    def setSourceCodeHash(value: Input[String]): Self = this.set("sourceCodeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeHash: Self = this.set("sourceCodeHash", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[Double]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTracingConfig(value: Input[FunctionTracingConfig]): Self = this.set("tracingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracingConfig: Self = this.set("tracingConfig", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: Input[FunctionVpcConfig]): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
}
