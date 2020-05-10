package typingsSlinky.pulumiAws.lambdaFunctionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionDeadLetterConfig
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionEnvironment
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionTracingConfig
import typingsSlinky.pulumiAws.inputMod.lambda.FunctionVpcConfig
import typingsSlinky.pulumiPulumi.mod.asset.Archive
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function.
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
    * The function [entrypoint][3] in your code.
    */
  val handler: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in [`aws.apigateway.Integration`](https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html)'s `uri`
    */
  val invokeArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: js.UndefOr[Input[String]] = js.native
  /**
    * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers][10]
    */
  val layers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits][5]
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
    * The Amazon Resource Name (ARN) identifying your Lambda Function Version
    * (if versioning is enabled via `publish = true`).
    */
  val qualifiedArn: js.UndefOr[Input[String]] = js.native
  /**
    * The amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency][9]
    */
  val reservedConcurrentExecutions: js.UndefOr[Input[Double]] = js.native
  /**
    * IAM role attached to the Lambda Function. This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See [Lambda Permission Model][4] for more details.
    */
  val role: js.UndefOr[Input[ARN]] = js.native
  /**
    * See [Runtimes][6] for valid values.
    */
  val runtime: js.UndefOr[Input[String]] = js.native
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
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits][5]
    */
  val timeout: js.UndefOr[Input[Double]] = js.native
  val tracingConfig: js.UndefOr[Input[FunctionTracingConfig]] = js.native
  /**
    * Latest published version of your Lambda Function.
    */
  val version: js.UndefOr[Input[String]] = js.native
  /**
    * Provide this to allow your function to access your VPC. Fields documented below. See [Lambda in VPC][7]
    */
  val vpcConfig: js.UndefOr[Input[FunctionVpcConfig]] = js.native
}

object FunctionState {
  @scala.inline
  def apply(): FunctionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionState]
  }
  @scala.inline
  implicit class FunctionStateOps[Self <: FunctionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: Input[Archive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadLetterConfig(value: Input[FunctionDeadLetterConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadLetterConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: Input[FunctionEnvironment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withInvokeArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeArn")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withMemorySize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memorySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemorySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memorySize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPublish(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifiedArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiedArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifiedArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiedArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedConcurrentExecutions(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedConcurrentExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Key(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Key")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ObjectVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ObjectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ObjectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCodeHash(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCodeSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTracingConfig(value: Input[FunctionTracingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: Input[FunctionVpcConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(js.undefined)
        ret
    }
  }
  
}

