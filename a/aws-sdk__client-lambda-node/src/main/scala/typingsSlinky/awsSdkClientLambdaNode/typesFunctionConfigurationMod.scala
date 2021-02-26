package typingsSlinky.awsSdkClientLambdaNode

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
import typingsSlinky.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig
import typingsSlinky.awsSdkClientLambdaNode.typesDeadLetterConfigMod.UnmarshalledDeadLetterConfig
import typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentResponseMod.EnvironmentResponse
import typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentResponseMod.UnmarshalledEnvironmentResponse
import typingsSlinky.awsSdkClientLambdaNode.typesTracingConfigResponseMod.TracingConfigResponse
import typingsSlinky.awsSdkClientLambdaNode.typesTracingConfigResponseMod.UnmarshalledTracingConfigResponse
import typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigResponseMod.UnmarshalledVpcConfigResponse
import typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigResponseMod.VpcConfigResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFunctionConfigurationMod {
  
  @js.native
  trait FunctionConfiguration extends StObject {
    
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
    var DeadLetterConfig: js.UndefOr[typingsSlinky.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig] = js.native
    
    /**
      * <p>The function's description.</p>
      */
    var Description: js.UndefOr[String] = js.native
    
    /**
      * <p>The function's environment variables.</p>
      */
    var Environment: js.UndefOr[EnvironmentResponse] = js.native
    
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
    var TracingConfig: js.UndefOr[TracingConfigResponse] = js.native
    
    /**
      * <p>The version of the Lambda function.</p>
      */
    var Version: js.UndefOr[String] = js.native
    
    /**
      * <p>The function's networking configuration.</p>
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
    implicit class FunctionConfigurationMutableBuilder[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeSha256(value: String): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
      
      @scala.inline
      def setCodeSize(value: Double): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
      
      @scala.inline
      def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setEnvironment(value: EnvironmentResponse): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
      
      @scala.inline
      def setFunctionArn(value: String): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
      
      @scala.inline
      def setKMSKeyArn(value: String): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
      
      @scala.inline
      def setLastModified(value: String): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setMasterArn(value: String): Self = StObject.set(x, "MasterArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterArnUndefined: Self = StObject.set(x, "MasterArn", js.undefined)
      
      @scala.inline
      def setMemorySize(value: Double): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
      
      @scala.inline
      def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
      
      @scala.inline
      def setRuntime(
        value: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
      ): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
      
      @scala.inline
      def setTracingConfig(value: TracingConfigResponse): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
      
      @scala.inline
      def setVpcConfig(value: VpcConfigResponse): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
    }
  }
  
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
    implicit class UnmarshalledFunctionConfigurationMutableBuilder[Self <: UnmarshalledFunctionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadLetterConfig(value: UnmarshalledDeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
      
      @scala.inline
      def setEnvironment(value: UnmarshalledEnvironmentResponse): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
      
      @scala.inline
      def setTracingConfig(value: UnmarshalledTracingConfigResponse): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
      
      @scala.inline
      def setVpcConfig(value: UnmarshalledVpcConfigResponse): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
    }
  }
}
