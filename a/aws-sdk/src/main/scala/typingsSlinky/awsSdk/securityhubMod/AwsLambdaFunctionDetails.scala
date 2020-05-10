package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionDetails extends js.Object {
  /**
    * An AwsLambdaFunctionCode object.
    */
  var Code: js.UndefOr[AwsLambdaFunctionCode] = js.native
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[AwsLambdaFunctionDeadLetterConfig] = js.native
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[AwsLambdaFunctionEnvironment] = js.native
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[NonEmptyString] = js.native
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed CMK.
    */
  var KmsKeyArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModified: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's layers.
    */
  var Layers: js.UndefOr[AwsLambdaFunctionLayerList] = js.native
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The memory that's allocated to the function.
    */
  var MemorySize: js.UndefOr[Integer] = js.native
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[NonEmptyString] = js.native
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[NonEmptyString] = js.native
  /**
    * The amount of time that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[Integer] = js.native
  /**
    * The function's AWS X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[AwsLambdaFunctionTracingConfig] = js.native
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[AwsLambdaFunctionVpcConfig] = js.native
}

object AwsLambdaFunctionDetails {
  @scala.inline
  def apply(): AwsLambdaFunctionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDetails]
  }
  @scala.inline
  implicit class AwsLambdaFunctionDetailsOps[Self <: AwsLambdaFunctionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: AwsLambdaFunctionCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSha256(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSha256")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadLetterConfig(value: AwsLambdaFunctionDeadLetterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadLetterConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeadLetterConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: AwsLambdaFunctionEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handler")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: AwsLambdaFunctionLayerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layers")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMemorySize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemorySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySize")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTracingConfig(value: AwsLambdaFunctionTracingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TracingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TracingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: AwsLambdaFunctionVpcConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(js.undefined)
        ret
    }
  }
  
}

