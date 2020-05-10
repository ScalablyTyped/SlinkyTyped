package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsResult extends js.Object {
  var channels: js.Array[Channel] = js.native
  var isTruncated: Boolean = js.native
  var nextMarker: String | Null = js.native
  var res: NormalSuccessResponse = js.native
}

object ListChannelsResult {
  @scala.inline
  def apply(channels: js.Array[Channel], isTruncated: Boolean, res: NormalSuccessResponse): ListChannelsResult = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsResult]
  }
  @scala.inline
  implicit class ListChannelsResultOps[Self <: ListChannelsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextMarkerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(null)
        ret
    }
  }
  
}

