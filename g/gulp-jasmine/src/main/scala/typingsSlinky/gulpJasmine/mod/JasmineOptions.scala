package typingsSlinky.gulpJasmine.mod

import typingsSlinky.jasmine.jasmine.CustomReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineOptions extends js.Object {
  /**
    * Passes the config to Jasmine's loadConfig method.
    */
  var config: js.UndefOr[js.Object] = js.native
  /**
    * Stops the stream on failed tests.
    * @default true
    */
  var errorOnFail: js.UndefOr[Boolean] = js.native
  /**
    * Include stack traces in failures in default reporter.
    * @default false
    */
  var includeStackTrace: js.UndefOr[Boolean] = js.native
  /**
    * Reporter(s) to use.
    */
  var reporter: js.UndefOr[CustomReporter | js.Array[CustomReporter]] = js.native
  /**
    * Time to wait in milliseconds before a test automatically fails.
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    *  Display spec names in default reporter.
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object JasmineOptions {
  @scala.inline
  def apply(): JasmineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineOptions]
  }
  @scala.inline
  implicit class JasmineOptionsOps[Self <: JasmineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorOnFail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOnFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnFail")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStackTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: CustomReporter | js.Array[CustomReporter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
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
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

