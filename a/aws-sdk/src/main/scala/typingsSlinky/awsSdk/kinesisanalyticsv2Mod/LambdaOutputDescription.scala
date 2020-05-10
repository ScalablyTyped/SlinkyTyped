package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaOutputDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination Lambda function.
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to write to the destination function.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RoleARN] = js.native
}

object LambdaOutputDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN): LambdaOutputDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
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

