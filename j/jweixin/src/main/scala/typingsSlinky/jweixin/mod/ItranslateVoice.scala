package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.AnonTranslateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================音频接口================================*/
/*=============================智能接口================================*/
@js.native
trait ItranslateVoice extends BaseParams {
   // 需要识别的音频的本地Id，由录音相关接口获得
  var isShowProgressTips: Double = js.native
  var localId: String = js.native
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MItranslateVoice(res: AnonTranslateResult): Unit = js.native
}

object ItranslateVoice {
  @scala.inline
  def apply(isShowProgressTips: Double, localId: String, success: AnonTranslateResult => Unit): ItranslateVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ItranslateVoice]
  }
  @scala.inline
  implicit class ItranslateVoiceOps[Self <: ItranslateVoice] (val x: Self) extends AnyVal {
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
    def withSuccess(value: AnonTranslateResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

