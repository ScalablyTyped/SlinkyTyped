package typingsSlinky.fingerprintjs2.mod

import typingsSlinky.fingerprintjs2.anon.AdBlock
import typingsSlinky.fingerprintjs2.anon.DetectScreenOrientation
import typingsSlinky.fingerprintjs2.anon.ExcludeIE
import typingsSlinky.fingerprintjs2.anon.ExcludeIOS11
import typingsSlinky.fingerprintjs2.anon.ExtendedJsFonts
import typingsSlinky.fingerprintjs2.anon.GetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var ERROR: js.UndefOr[String] = js.native
  var EXCLUDED: js.UndefOr[String] = js.native
  var NOT_AVAILABLE: js.UndefOr[String] = js.native
  var audio: js.UndefOr[ExcludeIOS11] = js.native
  var excludes: js.UndefOr[AdBlock] = js.native
  var extraComponents: js.UndefOr[js.Array[GetData]] = js.native
  var fonts: js.UndefOr[ExtendedJsFonts] = js.native
  var plugins: js.UndefOr[ExcludeIE] = js.native
  var preprocessor: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var screen: js.UndefOr[DetectScreenOrientation] = js.native
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
    def withAudio(value: ExcludeIOS11): Self = {
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
    def withExcludes(value: AdBlock): Self = {
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
    def withExtraComponents(value: js.Array[GetData]): Self = {
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
    def withFonts(value: ExtendedJsFonts): Self = {
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
    def withPlugins(value: ExcludeIE): Self = {
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
    def withScreen(value: DetectScreenOrientation): Self = {
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

