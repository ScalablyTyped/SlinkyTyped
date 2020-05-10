package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLogStreamsResponse extends js.Object {
  /**
    * The log streams.
    */
  var logStreams: js.UndefOr[LogStreams] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeLogStreamsResponse {
  @scala.inline
  def apply(): DescribeLogStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogStreamsResponse]
  }
  @scala.inline
  implicit class DescribeLogStreamsResponseOps[Self <: DescribeLogStreamsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogStreams(value: LogStreams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

