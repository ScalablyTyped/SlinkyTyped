package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamResponse extends js.Object {
  /**
    * Information about the stream.
    */
  var streamInfo: js.UndefOr[StreamInfo] = js.native
}

object DescribeStreamResponse {
  @scala.inline
  def apply(): DescribeStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamResponse]
  }
  @scala.inline
  implicit class DescribeStreamResponseOps[Self <: DescribeStreamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamInfo(value: StreamInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamInfo")(js.undefined)
        ret
    }
  }
  
}

