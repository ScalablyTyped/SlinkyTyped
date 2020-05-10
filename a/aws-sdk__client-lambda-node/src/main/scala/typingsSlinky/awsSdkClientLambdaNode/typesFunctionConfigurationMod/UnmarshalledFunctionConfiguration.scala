package typingsSlinky.awsSdkClientLambdaNode.typesFunctionConfigurationMod

import typingsSlinky.awsSdkClientLambdaNode.typesDeadLetterConfigMod.UnmarshalledDeadLetterConfig
import typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentResponseMod.UnmarshalledEnvironmentResponse
import typingsSlinky.awsSdkClientLambdaNode.typesTracingConfigResponseMod.UnmarshalledTracingConfigResponse
import typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigResponseMod.UnmarshalledVpcConfigResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledFunctionConfiguration extends FunctionConfiguration {
  /**
    * <p>The function's dead letter queue.</p>
    */
  @JSName("DeadLetterConfig")
  var DeadLetterConfig_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledDeadLetterConfig] = js.native
  /**
    * <p>The function's environment variables.</p>
    */
  @JSName("Environment")
  var Environment_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledEnvironmentResponse] = js.native
  /**
    * <p>The function's AWS X-Ray tracing configuration.</p>
    */
  @JSName("TracingConfig")
  var TracingConfig_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledTracingConfigResponse] = js.native
  /**
    * <p>The function's networking configuration.</p>
    */
  @JSName("VpcConfig")
  var VpcConfig_UnmarshalledFunctionConfiguration: js.UndefOr[UnmarshalledVpcConfigResponse] = js.native
}

object UnmarshalledFunctionConfiguration {
  @scala.inline
  def apply(): UnmarshalledFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledFunctionConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledFunctionConfigurationOps[Self <: UnmarshalledFunctionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

