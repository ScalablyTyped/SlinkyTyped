package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopActivityStreamResponse extends js.Object {
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier used for encrypting messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The status of the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.native
}

object StopActivityStreamResponse {
  @scala.inline
  def apply(): StopActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopActivityStreamResponse]
  }
  @scala.inline
  implicit class StopActivityStreamResponseOps[Self <: StopActivityStreamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

