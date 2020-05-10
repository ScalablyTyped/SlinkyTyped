package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQDownloadInfo extends js.Object {
  /**
    * FileSize of the generated QVF
    */
  var qFileSize: Double = js.native
  /**
    * URL of the generated QVF
    */
  var qUrl: String = js.native
}

object IQDownloadInfo {
  @scala.inline
  def apply(qFileSize: Double, qUrl: String): IQDownloadInfo = {
    val __obj = js.Dynamic.literal(qFileSize = qFileSize.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQDownloadInfo]
  }
  @scala.inline
  implicit class IQDownloadInfoOps[Self <: IQDownloadInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

