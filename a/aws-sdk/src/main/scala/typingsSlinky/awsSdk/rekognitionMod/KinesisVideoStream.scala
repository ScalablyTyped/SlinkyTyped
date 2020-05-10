package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisVideoStream extends js.Object {
  /**
    * ARN of the Kinesis video stream stream that streams the source video.
    */
  var Arn: js.UndefOr[KinesisVideoArn] = js.native
}

object KinesisVideoStream {
  @scala.inline
  def apply(): KinesisVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisVideoStream]
  }
  @scala.inline
  implicit class KinesisVideoStreamOps[Self <: KinesisVideoStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: KinesisVideoArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
  }
  
}

