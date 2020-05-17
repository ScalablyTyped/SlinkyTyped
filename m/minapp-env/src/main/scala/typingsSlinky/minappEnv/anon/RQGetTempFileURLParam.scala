package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.GetTempFileURLParam> */
@js.native
trait RQGetTempFileURLParam extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
  var fileList: Array[String] = js.native
}

object RQGetTempFileURLParam {
  @scala.inline
  def apply(fileList: Array[String]): RQGetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQGetTempFileURLParam]
  }
  @scala.inline
  implicit class RQGetTempFileURLParamOps[Self <: RQGetTempFileURLParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileList(value: Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
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

