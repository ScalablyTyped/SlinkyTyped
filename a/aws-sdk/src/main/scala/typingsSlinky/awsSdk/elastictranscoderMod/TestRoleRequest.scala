package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRoleRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
    */
  var InputBucket: BucketName = js.native
  /**
    * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from this bucket.
    */
  var OutputBucket: BucketName = js.native
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
    */
  var Role: typingsSlinky.awsSdk.elastictranscoderMod.Role = js.native
  /**
    * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a test notification to.
    */
  var Topics: SnsTopics = js.native
}

object TestRoleRequest {
  @scala.inline
  def apply(InputBucket: BucketName, OutputBucket: BucketName, Role: Role, Topics: SnsTopics): TestRoleRequest = {
    val __obj = js.Dynamic.literal(InputBucket = InputBucket.asInstanceOf[js.Any], OutputBucket = OutputBucket.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Topics = Topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRoleRequest]
  }
  @scala.inline
  implicit class TestRoleRequestOps[Self <: TestRoleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopics(value: SnsTopics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

