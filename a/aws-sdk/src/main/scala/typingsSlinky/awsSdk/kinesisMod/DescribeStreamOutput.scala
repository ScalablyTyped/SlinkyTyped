package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamOutput extends js.Object {
  /**
    * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.
    */
  var StreamDescription: typingsSlinky.awsSdk.kinesisMod.StreamDescription = js.native
}

object DescribeStreamOutput {
  @scala.inline
  def apply(StreamDescription: StreamDescription): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal(StreamDescription = StreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  @scala.inline
  implicit class DescribeStreamOutputOps[Self <: DescribeStreamOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamDescription(value: StreamDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

