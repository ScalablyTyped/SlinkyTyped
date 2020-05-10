package typingsSlinky.qiniu.mod.fop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PfopOptions extends js.Object {
  /**
    * 结果是否强制覆盖已有的同名文件
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * 回调业务服务器，通知处理结果
    */
  var notifyURL: js.UndefOr[String] = js.native
}

object PfopOptions {
  @scala.inline
  def apply(): PfopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PfopOptions]
  }
  @scala.inline
  implicit class PfopOptionsOps[Self <: PfopOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyURL")(js.undefined)
        ret
    }
  }
  
}

