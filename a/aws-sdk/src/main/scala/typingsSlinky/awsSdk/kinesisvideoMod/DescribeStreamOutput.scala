package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamOutput extends js.Object {
  /**
    * An object that describes the stream.
    */
  var StreamInfo: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.StreamInfo] = js.native
}

object DescribeStreamOutput {
  @scala.inline
  def apply(): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  @scala.inline
  implicit class DescribeStreamOutputOps[Self <: DescribeStreamOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamInfo(value: StreamInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamInfo")(js.undefined)
        ret
    }
  }
  
}

