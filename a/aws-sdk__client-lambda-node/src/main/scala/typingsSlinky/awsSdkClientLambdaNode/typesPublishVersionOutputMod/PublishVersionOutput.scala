package typingsSlinky.awsSdkClientLambdaNode.typesPublishVersionOutputMod

import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.`nodejs4Dot3-edge`
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore1Dot0
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot0
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot1
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.go1Dotx
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.java8
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs4Dot3
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs6Dot10
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs8Dot10
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python2Dot7
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python3Dot6
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesDeadLetterConfigMod.UnmarshalledDeadLetterConfig
import typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentResponseMod.UnmarshalledEnvironmentResponse
import typingsSlinky.awsSdkClientLambdaNode.typesTracingConfigResponseMod.UnmarshalledTracingConfigResponse
import typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigResponseMod.UnmarshalledVpcConfigResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishVersionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The SHA256 hash of the function's deployment package.</p>
    */
  var CodeSha256: js.UndefOr[String] = js.native
  /**
    * <p>The size of the function's deployment package in bytes.</p>
    */
  var CodeSize: js.UndefOr[Double] = js.native
  /**
    * <p>The function's dead letter queue.</p>
    */
  var DeadLetterConfig: js.UndefOr[UnmarshalledDeadLetterConfig] = js.native
  /**
    * <p>The function's description.</p>
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * <p>The function's environment variables.</p>
    */
  var Environment: js.UndefOr[UnmarshalledEnvironmentResponse] = js.native
  /**
    * <p>The function's Amazon Resource Name.</p>
    */
  var FunctionArn: js.UndefOr[String] = js.native
  /**
    * <p>The name of the function.</p>
    */
  var FunctionName: js.UndefOr[String] = js.native
  /**
    * <p>The function Lambda calls to begin executing your function.</p>
    */
  var Handler: js.UndefOr[String] = js.native
  /**
    * <p>The KMS key used to encrypt the function's environment variables. Only returned if you've configured a customer managed CMK.</p>
    */
  var KMSKeyArn: js.UndefOr[String] = js.native
  /**
    * <p>The date and time that the function was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a> (YYYY-MM-DDThh:mm:ssTZD).</p>
    */
  var LastModified: js.UndefOr[String] = js.native
  /**
    * <p>The ARN of the master function.</p>
    */
  var MasterArn: js.UndefOr[String] = js.native
  /**
    * <p>The memory allocated to the function</p>
    */
  var MemorySize: js.UndefOr[Double] = js.native
  /**
    * <p>Represents the latest updated revision of the function or alias.</p>
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * <p>The function's execution role.</p>
    */
  var Role: js.UndefOr[String] = js.native
  /**
    * <p>The runtime environment for the Lambda function.</p>
    */
  var Runtime: js.UndefOr[
    nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
  ] = js.native
  /**
    * <p>The amount of time that Lambda allows a function to run before terminating it.</p>
    */
  var Timeout: js.UndefOr[Double] = js.native
  /**
    * <p>The function's AWS X-Ray tracing configuration.</p>
    */
  var TracingConfig: js.UndefOr[UnmarshalledTracingConfigResponse] = js.native
  /**
    * <p>The version of the Lambda function.</p>
    */
  var Version: js.UndefOr[String] = js.native
  /**
    * <p>The function's networking configuration.</p>
    */
  var VpcConfig: js.UndefOr[UnmarshalledVpcConfigResponse] = js.native
}

object PublishVersionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PublishVersionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishVersionOutput]
  }
  @scala.inline
  implicit class PublishVersionOutputOps[Self <: PublishVersionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeSha256(value: String): Self = {
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
    def withCodeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadLetterConfig(value: UnmarshalledDeadLetterConfig): Self = {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: UnmarshalledEnvironmentResponse): Self = {
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
    def withFunctionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
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
    def withHandler(value: String): Self = {
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
    def withKMSKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: String): Self = {
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
    def withMasterArn(value: String): Self = {
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
    def withMemorySize(value: Double): Self = {
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
    def withRevisionId(value: String): Self = {
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
    def withRole(value: String): Self = {
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
    def withRuntime(
      value: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
    ): Self = {
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
    def withTimeout(value: Double): Self = {
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
    def withTracingConfig(value: UnmarshalledTracingConfigResponse): Self = {
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
    def withVersion(value: String): Self = {
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
    def withVpcConfig(value: UnmarshalledVpcConfigResponse): Self = {
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

