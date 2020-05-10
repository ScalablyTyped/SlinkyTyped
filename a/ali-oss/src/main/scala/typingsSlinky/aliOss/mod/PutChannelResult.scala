package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutChannelResult extends js.Object {
  var playUrls: js.Array[String] = js.native
  var publishUrls: js.Array[String] = js.native
  var res: NormalSuccessResponse = js.native
}

object PutChannelResult {
  @scala.inline
  def apply(playUrls: js.Array[String], publishUrls: js.Array[String], res: NormalSuccessResponse): PutChannelResult = {
    val __obj = js.Dynamic.literal(playUrls = playUrls.asInstanceOf[js.Any], publishUrls = publishUrls.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelResult]
  }
  @scala.inline
  implicit class PutChannelResultOps[Self <: PutChannelResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

