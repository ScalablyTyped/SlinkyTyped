package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaOutputDescription extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ResourceARN] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN] = js.native
}

object LambdaOutputDescription {
  @scala.inline
  def apply(): LambdaOutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaOutputDescription]
  }
  @scala.inline
  implicit class LambdaOutputDescriptionOps[Self <: LambdaOutputDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
  }
  
}

