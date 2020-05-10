package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamRequest extends js.Object {
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
}

object DescribeStreamRequest {
  @scala.inline
  def apply(streamId: StreamId): DescribeStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamRequest]
  }
  @scala.inline
  implicit class DescribeStreamRequestOps[Self <: DescribeStreamRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamId(value: StreamId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

