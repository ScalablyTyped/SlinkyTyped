package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProcessorInput extends js.Object {
  /**
    * The Kinesis video stream input stream for the source streaming video.
    */
  var KinesisVideoStream: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.KinesisVideoStream] = js.native
}

object StreamProcessorInput {
  @scala.inline
  def apply(): StreamProcessorInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorInput]
  }
  @scala.inline
  implicit class StreamProcessorInputOps[Self <: StreamProcessorInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKinesisVideoStream(value: KinesisVideoStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisVideoStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisVideoStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisVideoStream")(js.undefined)
        ret
    }
  }
  
}

