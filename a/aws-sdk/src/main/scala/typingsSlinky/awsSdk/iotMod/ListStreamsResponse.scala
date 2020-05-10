package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsResponse extends js.Object {
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of streams.
    */
  var streams: js.UndefOr[StreamsSummary] = js.native
}

object ListStreamsResponse {
  @scala.inline
  def apply(): ListStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsResponse]
  }
  @scala.inline
  implicit class ListStreamsResponseOps[Self <: ListStreamsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStreams(value: StreamsSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(js.undefined)
        ret
    }
  }
  
}

