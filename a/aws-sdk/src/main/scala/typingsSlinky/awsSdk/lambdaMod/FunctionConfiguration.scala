package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfiguration extends js.Object {
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[String] = js.native
  /**
    * The size of the function's deployment package, in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.native
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.DeadLetterConfig] = js.native
  /**
    * The function's description.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Description] = js.native
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[EnvironmentResponse] = js.native
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.native
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NamespacedFunctionName] = js.native
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Handler] = js.native
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed CMK.
    */
  var KMSKeyArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.KMSKeyArn] = js.native
  /**
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the last update that was performed on the function. This is first set to Successful after function creation completes.
    */
  var LastUpdateStatus: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LastUpdateStatus] = js.native
  /**
    * The reason for the last update that was performed on the function.
    */
  var LastUpdateStatusReason: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LastUpdateStatusReason] = js.native
  /**
    * The reason code for the last update that was performed on the function.
    */
  var LastUpdateStatusReasonCode: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LastUpdateStatusReasonCode] = js.native
  /**
    * The function's  layers.
    */
  var Layers: js.UndefOr[LayersReferenceList] = js.native
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[FunctionArn] = js.native
  /**
    * The memory that's allocated to the function.
    */
  var MemorySize: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MemorySize] = js.native
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[RoleArn] = js.native
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Runtime] = js.native
  /**
    * The current state of the function. When the state is Inactive, you can reactivate the function by invoking it.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.State] = js.native
  /**
    * The reason for the function's current state.
    */
  var StateReason: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.StateReason] = js.native
  /**
    * The reason code for the function's current state. When the code is Creating, you can't invoke or modify the function.
    */
  var StateReasonCode: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.StateReasonCode] = js.native
  /**
    * The amount of time that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Timeout] = js.native
  /**
    * The function's AWS X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[TracingConfigResponse] = js.native
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Version] = js.native
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[VpcConfigResponse] = js.native
}

object FunctionConfiguration {
  @scala.inline
  def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  @scala.inline
  implicit class FunctionConfigurationOps[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCodeSize(value: Long): Self = {
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
    def withDeadLetterConfig(value: DeadLetterConfig): Self = {
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
    def withDescription(value: Description): Self = {
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
    def withEnvironment(value: EnvironmentResponse): Self = {
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
    def withFunctionArn(value: NameSpacedFunctionArn): Self = {
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
    def withFunctionName(value: NamespacedFunctionName): Self = {
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
    def withHandler(value: Handler): Self = {
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
    def withKMSKeyArn(value: KMSKeyArn): Self = {
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
    def withLastModified(value: Timestamp): Self = {
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
    def withLastUpdateStatus(value: LastUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateStatusReason(value: LastUpdateStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateStatusReasonCode(value: LastUpdateStatusReasonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatusReasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateStatusReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatusReasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: LayersReferenceList): Self = {
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
    def withMasterArn(value: FunctionArn): Self = {
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
    def withMemorySize(value: MemorySize): Self = {
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
    def withRole(value: RoleArn): Self = {
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
    def withRuntime(value: Runtime): Self = {
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
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReason(value: StateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReasonCode(value: StateReasonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Timeout): Self = {
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
    def withTracingConfig(value: TracingConfigResponse): Self = {
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
    def withVersion(value: Version): Self = {
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
    def withVpcConfig(value: VpcConfigResponse): Self = {
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

