package typingsSlinky.fingerprintjs2.mod

import typingsSlinky.fingerprintjs2.AnonAdBlock
import typingsSlinky.fingerprintjs2.AnonDetectScreenOrientation
import typingsSlinky.fingerprintjs2.AnonExcludeIE
import typingsSlinky.fingerprintjs2.AnonExcludeIOS11
import typingsSlinky.fingerprintjs2.AnonExtendedJsFonts
import typingsSlinky.fingerprintjs2.AnonGetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var ERROR: js.UndefOr[String] = js.native
  var EXCLUDED: js.UndefOr[String] = js.native
  var NOT_AVAILABLE: js.UndefOr[String] = js.native
  var audio: js.UndefOr[AnonExcludeIOS11] = js.native
  var excludes: js.UndefOr[AnonAdBlock] = js.native
  var extraComponents: js.UndefOr[js.Array[AnonGetData]] = js.native
  var fonts: js.UndefOr[AnonExtendedJsFonts] = js.native
  var plugins: js.UndefOr[AnonExcludeIE] = js.native
  var preprocessor: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var screen: js.UndefOr[AnonDetectScreenOrientation] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutERROR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(js.undefined)
        ret
    }
    @scala.inline
    def withEXCLUDED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXCLUDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEXCLUDED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXCLUDED")(js.undefined)
        ret
    }
    @scala.inline
    def withNOT_AVAILABLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_AVAILABLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNOT_AVAILABLE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_AVAILABLE")(js.undefined)
        ret
    }
    @scala.inline
    def withAudio(value: AnonExcludeIOS11): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludes(value: AnonAdBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraComponents(value: js.Array[AnonGetData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: AnonExtendedJsFonts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: AnonExcludeIE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessor(value: (/* key */ String, /* value */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreprocessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessor")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen(value: AnonDetectScreenOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
  }
  
}

