package typingsSlinky.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaSetupOptions extends js.Object {
  // bail on the first test failure
  var bail: js.UndefOr[Boolean] = js.native
  //array of accepted globals
  var globals: js.UndefOr[js.Array[_]] = js.native
  // grep string or regexp to filter tests with
  var grep: js.UndefOr[js.Any] = js.native
  // ignore global leaks
  var ignoreLeaks: js.UndefOr[Boolean] = js.native
  // reporter instance (function or string), defaults to `mocha.reporters.Spec`
  var reporter: js.UndefOr[js.Any] = js.native
  //milliseconds to wait before considering a test slow
  var slow: js.UndefOr[Double] = js.native
  // timeout in milliseconds
  var timeout: js.UndefOr[Double] = js.native
  // ui name "bdd", "tdd", "exports" etc
  var ui: js.UndefOr[String] = js.native
}

object MochaSetupOptions {
  @scala.inline
  def apply(): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaSetupOptions]
  }
  @scala.inline
  implicit class MochaSetupOptionsOps[Self <: MochaSetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobals(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withGrep(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreLeaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLeaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreLeaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLeaks")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: js.Any): Self = {
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
    def withSlow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(js.undefined)
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
    def withUi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
        ret
    }
  }
  
}

