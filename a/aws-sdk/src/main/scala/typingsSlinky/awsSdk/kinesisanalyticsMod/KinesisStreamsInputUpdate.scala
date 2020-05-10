package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsInputUpdate extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the input Amazon Kinesis stream to read.
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object KinesisStreamsInputUpdate {
  @scala.inline
  def apply(): KinesisStreamsInputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamsInputUpdate]
  }
  @scala.inline
  implicit class KinesisStreamsInputUpdateOps[Self <: KinesisStreamsInputUpdate] (val x: Self) extends AnyVal {
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

