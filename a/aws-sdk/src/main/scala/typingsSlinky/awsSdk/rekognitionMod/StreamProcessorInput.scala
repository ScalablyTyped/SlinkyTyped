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
  def apply(KinesisVideoStream: KinesisVideoStream = null): StreamProcessorInput = {
    val __obj = js.Dynamic.literal()
    if (KinesisVideoStream != null) __obj.updateDynamic("KinesisVideoStream")(KinesisVideoStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessorInput]
  }
}

