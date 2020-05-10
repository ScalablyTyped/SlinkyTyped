package typingsSlinky.jsreportChromePdf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.chrome
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.firefox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.LaunchOptions> */
@js.native
trait PartialLaunchOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var defaultViewport: js.UndefOr[Partialwidthstringheights] = js.native
  var devtools: js.UndefOr[Boolean] = js.native
  var dumpio: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[StringDictionary[String]] = js.native
  var executablePath: js.UndefOr[String] = js.native
  var extraPrefsFirefox: js.UndefOr[StringDictionary[js.Any]] = js.native
  var handleSIGHUP: js.UndefOr[Boolean] = js.native
  var handleSIGINT: js.UndefOr[Boolean] = js.native
  var handleSIGTERM: js.UndefOr[Boolean] = js.native
  var headless: js.UndefOr[Boolean] = js.native
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.native
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.native
  var pipe: js.UndefOr[Boolean] = js.native
  var product: js.UndefOr[chrome | firefox] = js.native
  var slowMo: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var userDataDir: js.UndefOr[String] = js.native
}

object PartialLaunchOptions {
  @scala.inline
  def apply(): PartialLaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLaunchOptions]
  }
  @scala.inline
  implicit class PartialLaunchOptionsOps[Self <: PartialLaunchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultViewport(value: Partialwidthstringheights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools")(js.undefined)
        ret
    }
    @scala.inline
    def withDumpio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDumpio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpio")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutablePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraPrefsFirefox(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraPrefsFirefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraPrefsFirefox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraPrefsFirefox")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSIGHUP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGHUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSIGHUP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGHUP")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSIGINT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSIGINT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGINT")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSIGTERM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGTERM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSIGTERM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGTERM")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDefaultArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDefaultArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDefaultArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreHTTPSErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHTTPSErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: chrome | firefox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowMo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowMo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowMo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowMo")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDataDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDataDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataDir")(js.undefined)
        ret
    }
  }
  
}

