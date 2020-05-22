package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamSummaryInput extends js.Object {
  /**
    * The name of the stream to describe.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
}

object DescribeStreamSummaryInput {
  @scala.inline
  def apply(StreamName: StreamName): DescribeStreamSummaryInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamSummaryInput]
  }
}

