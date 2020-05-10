package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHLSStreamingSessionURLOutput extends js.Object {
  /**
    * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
    */
  var HLSStreamingSessionURL: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.HLSStreamingSessionURL] = js.native
}

object GetHLSStreamingSessionURLOutput {
  @scala.inline
  def apply(): GetHLSStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHLSStreamingSessionURLOutput]
  }
  @scala.inline
  implicit class GetHLSStreamingSessionURLOutputOps[Self <: GetHLSStreamingSessionURLOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHLSStreamingSessionURL(value: HLSStreamingSessionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HLSStreamingSessionURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHLSStreamingSessionURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HLSStreamingSessionURL")(js.undefined)
        ret
    }
  }
  
}

