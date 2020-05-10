package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQDownloadInfo extends js.Object {
  var qDownloadInfo: js.Any = js.native
}

object AnonQDownloadInfo {
  @scala.inline
  def apply(qDownloadInfo: js.Any): AnonQDownloadInfo = {
    val __obj = js.Dynamic.literal(qDownloadInfo = qDownloadInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQDownloadInfo]
  }
  @scala.inline
  implicit class AnonQDownloadInfoOps[Self <: AnonQDownloadInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDownloadInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDownloadInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

