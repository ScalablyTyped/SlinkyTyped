package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartActivityStreamResponse extends js.Object {
  /**
    * Indicates whether or not the database activity stream will start as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Amazon Kinesis data stream to be used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier for encryption of messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The mode of the database activity stream.
    */
  var Mode: js.UndefOr[ActivityStreamMode] = js.native
  /**
    * The status of the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.native
}

object StartActivityStreamResponse {
  @scala.inline
  def apply(): StartActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartActivityStreamResponse]
  }
  @scala.inline
  implicit class StartActivityStreamResponseOps[Self <: StartActivityStreamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ActivityStreamMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ActivityStreamStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

