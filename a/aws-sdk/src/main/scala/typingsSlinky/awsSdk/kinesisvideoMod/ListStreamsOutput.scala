package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsOutput extends js.Object {
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.NextToken] = js.native
  /**
    * An array of StreamInfo objects.
    */
  var StreamInfoList: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.StreamInfoList] = js.native
}

object ListStreamsOutput {
  @scala.inline
  def apply(): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsOutput]
  }
  @scala.inline
  implicit class ListStreamsOutputOps[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamInfoList(value: StreamInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamInfoList")(js.undefined)
        ret
    }
  }
  
}

