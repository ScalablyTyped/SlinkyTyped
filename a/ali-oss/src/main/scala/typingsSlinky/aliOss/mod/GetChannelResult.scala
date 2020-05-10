package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChannelResult extends js.Object {
  var Audio: js.UndefOr[js.Object] = js.native
  var ConnectedTime: js.UndefOr[String] = js.native
  var RemoteAddr: js.UndefOr[String] = js.native
  var Status: String = js.native
  var Video: js.UndefOr[js.Object] = js.native
  var res: NormalSuccessResponse = js.native
}

object GetChannelResult {
  @scala.inline
  def apply(Status: String, res: NormalSuccessResponse): GetChannelResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelResult]
  }
  @scala.inline
  implicit class GetChannelResultOps[Self <: GetChannelResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audio")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteAddr")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Video")(js.undefined)
        ret
    }
  }
  
}

