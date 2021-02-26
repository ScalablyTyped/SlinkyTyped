package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.cloudwatch.EventTargetBatchTarget
import typingsSlinky.pulumiAws.outputMod.cloudwatch.EventTargetEcsTarget
import typingsSlinky.pulumiAws.outputMod.cloudwatch.EventTargetInputTransformer
import typingsSlinky.pulumiAws.outputMod.cloudwatch.EventTargetKinesisTarget
import typingsSlinky.pulumiAws.outputMod.cloudwatch.EventTargetRunCommandTarget
import typingsSlinky.pulumiAws.outputMod.cloudwatch.EventTargetSqsTarget
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTargetMod {
  
  @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget")
  @js.native
  class EventTarget protected () extends CustomResource {
    /**
      * Create a EventTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventTargetArgs) = this()
    def this(name: String, args: EventTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) associated of the target.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
      */
    val batchTarget: Output_[js.UndefOr[EventTargetBatchTarget]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
      */
    val ecsTarget: Output_[js.UndefOr[EventTargetEcsTarget]] = js.native
    
    /**
      * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Valid JSON text passed to the target. Conflicts with `inputPath` and `inputTransformer`.
      */
    val input: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `inputTransformer`.
      */
    val inputPath: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
      */
    val inputTransformer: Output_[js.UndefOr[EventTargetInputTransformer]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
      */
    val kinesisTarget: Output_[js.UndefOr[EventTargetKinesisTarget]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
      */
    val roleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the rule you want to add targets to.
      */
    val rule: Output_[String] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
      */
    val runCommandTargets: Output_[js.UndefOr[js.Array[EventTargetRunCommandTarget]]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
      */
    val sqsTarget: Output_[js.UndefOr[EventTargetSqsTarget]] = js.native
    
    /**
      * The unique target assignment ID.  If missing, will generate a random, unique id.
      */
    val targetId: Output_[String] = js.native
  }
  /* static members */
  object EventTarget {
    
    /**
      * Get an existing EventTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventTargetState): EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventTargetState, opts: CustomResourceOptions): EventTarget = js.native
    
    /**
      * Returns true if the given object is an instance of EventTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean = js.native
  }
  
  @js.native
  trait EventTargetArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated of the target.
      */
    val arn: Input[String] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
      */
    val batchTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
      */
    val ecsTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]] = js.native
    
    /**
      * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Valid JSON text passed to the target. Conflicts with `inputPath` and `inputTransformer`.
      */
    val input: js.UndefOr[Input[String]] = js.native
    
    /**
      * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `inputTransformer`.
      */
    val inputPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
      */
    val inputTransformer: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
      */
    val kinesisTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the rule you want to add targets to.
      */
    val rule: Input[String] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
      */
    val runCommandTargets: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
        ]
      ] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
      */
    val sqsTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]] = js.native
    
    /**
      * The unique target assignment ID.  If missing, will generate a random, unique id.
      */
    val targetId: js.UndefOr[Input[String]] = js.native
  }
  object EventTargetArgs {
    
    @scala.inline
    def apply(arn: Input[String], rule: Input[String]): EventTargetArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTargetArgs]
    }
    
    @scala.inline
    implicit class EventTargetArgsMutableBuilder[Self <: EventTargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]): Self = StObject.set(x, "batchTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchTargetUndefined: Self = StObject.set(x, "batchTarget", js.undefined)
      
      @scala.inline
      def setEcsTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]): Self = StObject.set(x, "ecsTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcsTargetUndefined: Self = StObject.set(x, "ecsTarget", js.undefined)
      
      @scala.inline
      def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      @scala.inline
      def setInput(value: Input[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPath(value: Input[String]): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
      
      @scala.inline
      def setInputTransformer(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]): Self = StObject.set(x, "inputTransformer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTransformerUndefined: Self = StObject.set(x, "inputTransformer", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setKinesisTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]): Self = StObject.set(x, "kinesisTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisTargetUndefined: Self = StObject.set(x, "kinesisTarget", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunCommandTargets(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
            ]
      ): Self = StObject.set(x, "runCommandTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunCommandTargetsUndefined: Self = StObject.set(x, "runCommandTargets", js.undefined)
      
      @scala.inline
      def setRunCommandTargetsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]*): Self = StObject.set(x, "runCommandTargets", js.Array(value :_*))
      
      @scala.inline
      def setSqsTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]): Self = StObject.set(x, "sqsTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqsTargetUndefined: Self = StObject.set(x, "sqsTarget", js.undefined)
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
  
  @js.native
  trait EventTargetState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated of the target.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
      */
    val batchTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
      */
    val ecsTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]] = js.native
    
    /**
      * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Valid JSON text passed to the target. Conflicts with `inputPath` and `inputTransformer`.
      */
    val input: js.UndefOr[Input[String]] = js.native
    
    /**
      * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `inputTransformer`.
      */
    val inputPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
      */
    val inputTransformer: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
      */
    val kinesisTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the rule you want to add targets to.
      */
    val rule: js.UndefOr[Input[String]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
      */
    val runCommandTargets: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
        ]
      ] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
      */
    val sqsTarget: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]] = js.native
    
    /**
      * The unique target assignment ID.  If missing, will generate a random, unique id.
      */
    val targetId: js.UndefOr[Input[String]] = js.native
  }
  object EventTargetState {
    
    @scala.inline
    def apply(): EventTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTargetState]
    }
    
    @scala.inline
    implicit class EventTargetStateMutableBuilder[Self <: EventTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBatchTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]): Self = StObject.set(x, "batchTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchTargetUndefined: Self = StObject.set(x, "batchTarget", js.undefined)
      
      @scala.inline
      def setEcsTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]): Self = StObject.set(x, "ecsTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcsTargetUndefined: Self = StObject.set(x, "ecsTarget", js.undefined)
      
      @scala.inline
      def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      @scala.inline
      def setInput(value: Input[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPath(value: Input[String]): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
      
      @scala.inline
      def setInputTransformer(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]): Self = StObject.set(x, "inputTransformer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTransformerUndefined: Self = StObject.set(x, "inputTransformer", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setKinesisTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]): Self = StObject.set(x, "kinesisTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisTargetUndefined: Self = StObject.set(x, "kinesisTarget", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setRunCommandTargets(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
            ]
      ): Self = StObject.set(x, "runCommandTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunCommandTargetsUndefined: Self = StObject.set(x, "runCommandTargets", js.undefined)
      
      @scala.inline
      def setRunCommandTargetsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]*): Self = StObject.set(x, "runCommandTargets", js.Array(value :_*))
      
      @scala.inline
      def setSqsTarget(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]): Self = StObject.set(x, "sqsTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqsTargetUndefined: Self = StObject.set(x, "sqsTarget", js.undefined)
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
}
