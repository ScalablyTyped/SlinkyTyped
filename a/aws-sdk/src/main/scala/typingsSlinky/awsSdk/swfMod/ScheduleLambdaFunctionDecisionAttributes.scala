package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * A string that identifies the Lambda function execution in the event history.
    */
  var id: FunctionId = js.native
  /**
    * The optional input data to be supplied to the Lambda function.
    */
  var input: js.UndefOr[FunctionInput] = js.native
  /**
    * The name, or ARN, of the Lambda function to schedule.
    */
  var name: FunctionName = js.native
  /**
    * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
}

object ScheduleLambdaFunctionDecisionAttributes {
  @scala.inline
  def apply(id: FunctionId, name: FunctionName): ScheduleLambdaFunctionDecisionAttributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleLambdaFunctionDecisionAttributes]
  }
  @scala.inline
  implicit class ScheduleLambdaFunctionDecisionAttributesOps[Self <: ScheduleLambdaFunctionDecisionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: FunctionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: FunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: FunctionInput): Self = {
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
    def withStartToCloseTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startToCloseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartToCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startToCloseTimeout")(js.undefined)
        ret
    }
  }
  
}

