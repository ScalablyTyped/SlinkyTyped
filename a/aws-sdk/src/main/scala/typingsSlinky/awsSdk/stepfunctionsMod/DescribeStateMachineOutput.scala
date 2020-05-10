package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineOutput extends js.Object {
  /**
    * The date the state machine is created.
    */
  var creationDate: js.Date = js.native
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition = js.native
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains security by granting Step Functions access to AWS resources.)
    */
  var roleArn: Arn = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The current status of the state machine.
    */
  var status: js.UndefOr[StateMachineStatus] = js.native
  /**
    * The type of the state machine (STANDARD or EXPRESS).
    */
  var `type`: StateMachineType = js.native
}

object DescribeStateMachineOutput {
  @scala.inline
  def apply(
    creationDate: js.Date,
    definition: Definition,
    name: Name,
    roleArn: Arn,
    stateMachineArn: Arn,
    `type`: StateMachineType
  ): DescribeStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineOutput]
  }
  @scala.inline
  implicit class DescribeStateMachineOutputOps[Self <: DescribeStateMachineOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMachineArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMachineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: StateMachineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoggingConfiguration(value: LoggingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StateMachineStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

