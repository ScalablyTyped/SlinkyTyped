package typingsSlinky.artyomJs

import typingsSlinky.artyomJs.anon.FatalityPromiseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtyomProperties extends js.Object {
  var continuous: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var executionKeyword: js.UndefOr[String] = js.native
  var helpers: js.UndefOr[FatalityPromiseCallback] = js.native
  var lang: String = js.native
  var listen: Boolean = js.native
  var mode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var obeyKeyword: js.UndefOr[String] = js.native
  var obeying: js.UndefOr[Boolean] = js.native
  var recognizing: js.UndefOr[Boolean] = js.native
  var soundex: js.UndefOr[Boolean] = js.native
  var speaking: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Double] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object ArtyomProperties {
  @scala.inline
  def apply(lang: String, listen: Boolean): ArtyomProperties = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomProperties]
  }
  @scala.inline
  implicit class ArtyomPropertiesOps[Self <: ArtyomProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: FatalityPromiseCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.undefined)
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withObeyKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obeyKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObeyKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obeyKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withObeying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obeying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObeying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obeying")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizing")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundex")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeaking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeaking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speaking")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

