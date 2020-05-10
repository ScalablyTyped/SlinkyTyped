package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomReporter extends js.Object {
  var jasmineDone: js.UndefOr[js.Function1[/* runDetails */ RunDetails, Unit]] = js.native
  var jasmineStarted: js.UndefOr[js.Function1[/* suiteInfo */ SuiteInfo, Unit]] = js.native
  var specDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
  var specStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
  var suiteDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
  var suiteStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.native
}

object CustomReporter {
  @scala.inline
  def apply(): CustomReporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomReporter]
  }
  @scala.inline
  implicit class CustomReporterOps[Self <: CustomReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJasmineDone(value: /* runDetails */ RunDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJasmineDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineDone")(js.undefined)
        ret
    }
    @scala.inline
    def withJasmineStarted(value: /* suiteInfo */ SuiteInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJasmineStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecDone(value: /* result */ CustomReporterResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSpecDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specDone")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecStarted(value: /* result */ CustomReporterResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSpecStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withSuiteDone(value: /* result */ CustomReporterResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteDone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuiteDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteDone")(js.undefined)
        ret
    }
    @scala.inline
    def withSuiteStarted(value: /* result */ CustomReporterResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuiteStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteStarted")(js.undefined)
        ret
    }
  }
  
}

