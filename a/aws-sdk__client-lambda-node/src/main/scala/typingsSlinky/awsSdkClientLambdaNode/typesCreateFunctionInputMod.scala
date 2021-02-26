package typingsSlinky.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
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
import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod._InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig
import typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentMod.Environment
import typingsSlinky.awsSdkClientLambdaNode.typesFunctionCodeMod.FunctionCode
import typingsSlinky.awsSdkClientLambdaNode.typesTracingConfigMod.TracingConfig
import typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigMod.VpcConfig
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateFunctionInputMod {
  
  @js.native
  trait CreateFunctionInput extends _InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>The code for the function.</p>
      */
    var Code: FunctionCode = js.native
    
    /**
      * <p>A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/dlq.html">Dead Letter Queues</a>. </p>
      */
    var DeadLetterConfig: js.UndefOr[typingsSlinky.awsSdkClientLambdaNode.typesDeadLetterConfigMod.DeadLetterConfig] = js.native
    
    /**
      * <p>A description of the function.</p>
      */
    var Description: js.UndefOr[String] = js.native
    
    /**
      * <p>Environment variables that are accessible from function code during execution.</p>
      */
    var Environment: js.UndefOr[typingsSlinky.awsSdkClientLambdaNode.typesEnvironmentMod.Environment] = js.native
    
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: String = js.native
    
    /**
      * <p>The name of the method within your code that Lambda calls to execute your function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model-v2.html">Programming Model</a>.</p>
      */
    var Handler: String = js.native
    
    /**
      * <p>The ARN of the KMS key used to encrypt your function's environment variables. If not provided, AWS Lambda will use a default service key.</p>
      */
    var KMSKeyArn: js.UndefOr[String] = js.native
    
    /**
      * <p>The amount of memory that your function has access to. Increasing the function's memory also increases it's CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.</p>
      */
    var MemorySize: js.UndefOr[Double] = js.native
    
    /**
      * <p>Set to true to publish the first version of the function during creation.</p>
      */
    var Publish: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>The Amazon Resource Name (ARN) of the function's <a href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role">execution role</a>.</p>
      */
    var Role: String = js.native
    
    /**
      * <p>The runtime version for the function.</p>
      */
    var Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String = js.native
    
    /**
      * <p>The list of tags (key-value pairs) assigned to the new function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * <p>The amount of time that Lambda allows a function to run before terminating it. The default is 3 seconds. The maximum allowed value is 900 seconds.</p>
      */
    var Timeout: js.UndefOr[Double] = js.native
    
    /**
      * <p>Set <code>Mode</code> to <code>Active</code> to sample and trace a subset of incoming requests with AWS X-Ray.</p>
      */
    var TracingConfig: js.UndefOr[typingsSlinky.awsSdkClientLambdaNode.typesTracingConfigMod.TracingConfig] = js.native
    
    /**
      * <p>If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one subnet ID.</p>
      */
    var VpcConfig: js.UndefOr[typingsSlinky.awsSdkClientLambdaNode.typesVpcConfigMod.VpcConfig] = js.native
  }
  object CreateFunctionInput {
    
    @scala.inline
    def apply(
      Code: FunctionCode,
      FunctionName: String,
      Handler: String,
      Role: String,
      Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
    ): CreateFunctionInput = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Handler = Handler.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateFunctionInput]
    }
    
    @scala.inline
    implicit class CreateFunctionInputMutableBuilder[Self <: CreateFunctionInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setCode(value: FunctionCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setEnvironment(value: Environment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandler(value: String): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSKeyArn(value: String): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
      
      @scala.inline
      def setMemorySize(value: Double): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
      
      @scala.inline
      def setPublish(value: Boolean): Self = StObject.set(x, "Publish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishUndefined: Self = StObject.set(x, "Publish", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(
        value: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
      ): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
      
      @scala.inline
      def setTracingConfig(value: TracingConfig): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
      
      @scala.inline
      def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
    }
  }
}
