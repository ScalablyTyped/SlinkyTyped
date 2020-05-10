package typingsSlinky.pulumiAws.eventTargetMod

import typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget
import typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget
import typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer
import typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget
import typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget
import typingsSlinky.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated of the target.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
    */
  val batchTarget: js.UndefOr[Input[EventTargetBatchTarget]] = js.native
  /**
    * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
    */
  val ecsTarget: js.UndefOr[Input[EventTargetEcsTarget]] = js.native
  /**
    * Valid JSON text passed to the target.
    */
  val input: js.UndefOr[Input[String]] = js.native
  /**
    * The value of the [JSONPath](http://goessner.net/articles/JsonPath/)
    * that is used for extracting part of the matched event when passing it to the target.
    */
  val inputPath: js.UndefOr[Input[String]] = js.native
  /**
    * Parameters used when you are providing a custom input to a target based on certain event data.
    */
  val inputTransformer: js.UndefOr[Input[EventTargetInputTransformer]] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
    */
  val kinesisTarget: js.UndefOr[Input[EventTargetKinesisTarget]] = js.native
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
  val runCommandTargets: js.UndefOr[Input[js.Array[Input[EventTargetRunCommandTarget]]]] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
    */
  val sqsTarget: js.UndefOr[Input[EventTargetSqsTarget]] = js.native
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
  implicit class EventTargetStateOps[Self <: EventTargetState] (val x: Self) extends AnyVal {
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
    def withBatchTarget(value: Input[EventTargetBatchTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withEcsTarget(value: Input[EventTargetEcsTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecsTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withInputTransformer(value: Input[EventTargetInputTransformer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTransformer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisTarget(value: Input[EventTargetKinesisTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
    @scala.inline
    def withRunCommandTargets(value: Input[js.Array[Input[EventTargetRunCommandTarget]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCommandTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunCommandTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCommandTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withSqsTarget(value: Input[EventTargetSqsTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqsTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqsTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(js.undefined)
        ret
    }
  }
  
}

