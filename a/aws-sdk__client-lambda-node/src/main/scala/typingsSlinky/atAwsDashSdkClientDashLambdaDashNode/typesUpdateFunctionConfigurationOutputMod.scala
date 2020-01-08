package typingsSlinky.atAwsDashSdkClientDashLambdaDashNode

import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.`nodejs4Dot3-edge`
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore1Dot0
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore2Dot0
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.dotnetcore2Dot1
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.go1Dotx
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.java8
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs4Dot3
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs6Dot10
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.nodejs8Dot10
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.python2Dot7
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.python3Dot6
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreDeadLetterConfigMod._UnmarshalledDeadLetterConfig
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentResponseMod._UnmarshalledEnvironmentResponse
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreTracingConfigResponseMod._UnmarshalledTracingConfigResponse
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreVpcConfigResponseMod._UnmarshalledVpcConfigResponse
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/UpdateFunctionConfigurationOutput", JSImport.Namespace)
@js.native
object typesUpdateFunctionConfigurationOutputMod extends js.Object {
  @js.native
  trait UpdateFunctionConfigurationOutput extends OutputTypesUnion {
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
    var DeadLetterConfig: js.UndefOr[_UnmarshalledDeadLetterConfig] = js.native
    /**
      * <p>The function's description.</p>
      */
    var Description: js.UndefOr[String] = js.native
    /**
      * <p>The function's environment variables.</p>
      */
    var Environment: js.UndefOr[_UnmarshalledEnvironmentResponse] = js.native
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
    var TracingConfig: js.UndefOr[_UnmarshalledTracingConfigResponse] = js.native
    /**
      * <p>The version of the Lambda function.</p>
      */
    var Version: js.UndefOr[String] = js.native
    /**
      * <p>The function's networking configuration.</p>
      */
    var VpcConfig: js.UndefOr[_UnmarshalledVpcConfigResponse] = js.native
  }
  
}

