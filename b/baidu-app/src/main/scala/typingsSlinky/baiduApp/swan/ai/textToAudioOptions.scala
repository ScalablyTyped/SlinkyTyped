package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 将文本转换为可以播放的mp3文件。
		 */
@js.native
trait textToAudioOptions
  extends BaseOptions[js.Any, js.Any] {
   // 合成的文本，使用UTF-8编码，小于512个中文字或者英文数字（文本在百度服务器内转换为GBK后，长度必须小于1024字节）。
  var ctp: js.UndefOr[String | Double] = js.native
   // 客户端类型选择，Web端填写固定值1。
  var lan: js.UndefOr[String] = js.native
   // 音量，取值0-9，默认为5中音量。
  var per: js.UndefOr[String] = js.native
   // 语速，取值0-9，默认为5中语速。
  var pit: js.UndefOr[String] = js.native
   // 固定值zh。语言选择,目前只有中英文混合模式，填写固定值zh。
  var spd: js.UndefOr[String] = js.native
   // 发音人选择, 0为普通女声，1为普通男生，3为情感合成-度逍遥，4为情感合成-度丫丫，默认为普通女声。
  @JSName("success")
  var success_textToAudioOptions: js.UndefOr[js.Function1[/* res */ textToAudioResponse, Unit]] = js.native
  var tex: String = js.native
   // 音调，取值0-9，默认为5中语调。
  var vol: js.UndefOr[String] = js.native
}

object textToAudioOptions {
  @scala.inline
  def apply(tex: String): textToAudioOptions = {
    val __obj = js.Dynamic.literal(tex = tex.asInstanceOf[js.Any])
    __obj.asInstanceOf[textToAudioOptions]
  }
  @scala.inline
  implicit class textToAudioOptionsOps[Self <: textToAudioOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtp(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctp")(js.undefined)
        ret
    }
    @scala.inline
    def withLan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lan")(js.undefined)
        ret
    }
    @scala.inline
    def withPer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per")(js.undefined)
        ret
    }
    @scala.inline
    def withPit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pit")(js.undefined)
        ret
    }
    @scala.inline
    def withSpd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spd")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ textToAudioResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withVol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vol")(js.undefined)
        ret
    }
  }
  
}

