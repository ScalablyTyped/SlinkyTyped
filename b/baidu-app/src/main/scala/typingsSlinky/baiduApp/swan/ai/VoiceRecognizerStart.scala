package typingsSlinky.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 获取全局唯一的语音识别器voiceRecognizer。
		 */
@js.native
trait VoiceRecognizerStart extends js.Object {
   // 是否开启长语音
  var context: js.UndefOr[String] = js.native
   // 听音模式，有效值dnn/touch
  var longSpeech: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
}

object VoiceRecognizerStart {
  @scala.inline
  def apply(): VoiceRecognizerStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceRecognizerStart]
  }
  @scala.inline
  implicit class VoiceRecognizerStartOps[Self <: VoiceRecognizerStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withLongSpeech(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSpeech")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

