package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsInput extends js.Object {
  /**
    * ARN of the input Amazon Kinesis stream to read.
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisanalyticsMod.ResourceARN = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}

object KinesisStreamsInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInput]
  }
  @scala.inline
  implicit class KinesisStreamsInputOps[Self <: KinesisStreamsInput] (val x: Self) extends AnyVal {
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
  }
  
}

