package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLambdaProcessorUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new AWS Lambda function that is used to preprocess the records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.native
  /**
    * The ARN of the new IAM role that is used to access the AWS Lambda function.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object InputLambdaProcessorUpdate {
  @scala.inline
  def apply(): InputLambdaProcessorUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLambdaProcessorUpdate]
  }
  @scala.inline
  implicit class InputLambdaProcessorUpdateOps[Self <: InputLambdaProcessorUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceARNUpdate(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARNUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARNUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARNUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARNUpdate(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARNUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARNUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARNUpdate")(js.undefined)
        ret
    }
  }
  
}

