package typingsSlinky.puppeteer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchOptions
  extends ChromeArgOptions
     with BrowserOptions
     with Timeoutable {
  /**
    * Whether to pipe browser process stdout and stderr into process.stdout and
    * process.stderr.
    * @default false
    */
  var dumpio: js.UndefOr[Boolean] = js.native
  /**
    * Specify environment variables that will be visible to Chromium.
    * @default `process.env`.
    */
  var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  /**
    * Path to a Chromium executable to run instead of bundled Chromium. If
    * executablePath is a relative path, then it is resolved relative to current
    * working directory.
    */
  var executablePath: js.UndefOr[String] = js.native
  /**
    * Close chrome process on SIGHUP.
    * @default true
    */
  var handleSIGHUP: js.UndefOr[Boolean] = js.native
  /**
    * Close chrome process on Ctrl-C.
    * @default true
    */
  var handleSIGINT: js.UndefOr[Boolean] = js.native
  /**
    * Close chrome process on SIGTERM.
    * @default true
    */
  var handleSIGTERM: js.UndefOr[Boolean] = js.native
  /**
    * Do not use `puppeteer.defaultArgs()` for launching Chromium.
    * @default false
    */
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Connects to the browser over a pipe instead of a WebSocket.
    * @default false
    */
  var pipe: js.UndefOr[Boolean] = js.native
}

object LaunchOptions {
  @scala.inline
  def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnv(value: StringDictionary[String | Boolean | Double]): Self = {
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
  }
  
}

