package typingsSlinky.jsreportChromePdf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsreportChromePdf.Partialwidthstringheights
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.chrome
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.firefox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#puppeteerlaunchoptions
@js.native
trait LaunchOptions extends js.Object {
  var args: js.Array[String] = js.native
  var defaultViewport: Partialwidthstringheights = js.native
  var devtools: Boolean = js.native
  var dumpio: Boolean = js.native
  var env: StringDictionary[String] = js.native
  var executablePath: String = js.native
  var extraPrefsFirefox: StringDictionary[js.Any] = js.native
  var handleSIGHUP: Boolean = js.native
  var handleSIGINT: Boolean = js.native
  var handleSIGTERM: Boolean = js.native
  var headless: Boolean = js.native
  var ignoreDefaultArgs: Boolean | js.Array[String] = js.native
  var ignoreHTTPSErrors: Boolean = js.native
  var pipe: Boolean = js.native
  var product: chrome | firefox = js.native
  var slowMo: Double = js.native
  var timeout: Double = js.native
  var userDataDir: String = js.native
}

object LaunchOptions {
  @scala.inline
  def apply(
    args: js.Array[String],
    defaultViewport: Partialwidthstringheights,
    devtools: Boolean,
    dumpio: Boolean,
    env: StringDictionary[String],
    executablePath: String,
    extraPrefsFirefox: StringDictionary[js.Any],
    handleSIGHUP: Boolean,
    handleSIGINT: Boolean,
    handleSIGTERM: Boolean,
    headless: Boolean,
    ignoreDefaultArgs: Boolean | js.Array[String],
    ignoreHTTPSErrors: Boolean,
    pipe: Boolean,
    product: chrome | firefox,
    slowMo: Double,
    timeout: Double,
    userDataDir: String
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], defaultViewport = defaultViewport.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], dumpio = dumpio.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], executablePath = executablePath.asInstanceOf[js.Any], extraPrefsFirefox = extraPrefsFirefox.asInstanceOf[js.Any], handleSIGHUP = handleSIGHUP.asInstanceOf[js.Any], handleSIGINT = handleSIGINT.asInstanceOf[js.Any], handleSIGTERM = handleSIGTERM.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], ignoreDefaultArgs = ignoreDefaultArgs.asInstanceOf[js.Any], ignoreHTTPSErrors = ignoreHTTPSErrors.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], slowMo = slowMo.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], userDataDir = userDataDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
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
    def withDefaultViewport(value: Partialwidthstringheights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevtools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDumpio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dumpio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraPrefsFirefox(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraPrefsFirefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleSIGHUP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGHUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleSIGINT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleSIGTERM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSIGTERM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDefaultArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreHTTPSErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: chrome | firefox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlowMo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowMo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDataDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

