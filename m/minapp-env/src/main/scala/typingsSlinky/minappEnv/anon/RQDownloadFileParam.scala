package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.DownloadFileParam> */
@js.native
trait RQDownloadFileParam extends js.Object {
  var cloudPath: js.UndefOr[String] = js.native
  var config: js.UndefOr[ICloudConfig] = js.native
  var fileID: String = js.native
}

object RQDownloadFileParam {
  @scala.inline
  def apply(fileID: String): RQDownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDownloadFileParam]
  }
  @scala.inline
  implicit class RQDownloadFileParamOps[Self <: RQDownloadFileParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudPath")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: ICloudConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

