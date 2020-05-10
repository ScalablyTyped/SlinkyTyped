package typingsSlinky.awsSdk.kinesisvideomediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMediaInput extends js.Object {
  /**
    * Identifies the starting chunk to get from the specified stream. 
    */
  var StartSelector: typingsSlinky.awsSdk.kinesisvideomediaMod.StartSelector = js.native
  /**
    * The ARN of the stream from where you want to get the media content. If you don't specify the streamARN, you must specify the streamName.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The Kinesis video stream name from where you want to get the media content. If you don't specify the streamName, you must specify the streamARN.
    */
  var StreamName: js.UndefOr[typingsSlinky.awsSdk.kinesisvideomediaMod.StreamName] = js.native
}

object GetMediaInput {
  @scala.inline
  def apply(StartSelector: StartSelector): GetMediaInput = {
    val __obj = js.Dynamic.literal(StartSelector = StartSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaInput]
  }
  @scala.inline
  implicit class GetMediaInputOps[Self <: GetMediaInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartSelector(value: StartSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamARN")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(js.undefined)
        ret
    }
  }
  
}

