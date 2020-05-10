package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IupdownloadVoice extends BaseParams {
   // 需要上传的音频的本地ID，由stopRecord接口获得
  var isShowProgressTips: Double = js.native
  var localId: String = js.native
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MIupdownloadVoice(res: Resouce): Unit = js.native
}

object IupdownloadVoice {
  @scala.inline
  def apply(isShowProgressTips: Double, localId: String, success: Resouce => Unit): IupdownloadVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IupdownloadVoice]
  }
  @scala.inline
  implicit class IupdownloadVoiceOps[Self <: IupdownloadVoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsShowProgressTips(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShowProgressTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Resouce => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

