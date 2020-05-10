package typingsSlinky.jestJasmine2.reportDispatcherMod

import typingsSlinky.jestJasmine2.specMod.SpecResult
import typingsSlinky.jestJasmine2.suiteMod.SuiteResult
import typingsSlinky.jestJasmine2.typesMod.Reporter
import typingsSlinky.jestJasmine2.typesMod.RunDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDispatcher extends Reporter {
  def addReporter(reporter: Reporter): Unit = js.native
  def clearReporters(): Unit = js.native
  def provideFallbackReporter(reporter: Reporter): Unit = js.native
}

object ReportDispatcher {
  @scala.inline
  def apply(
    addReporter: Reporter => Unit,
    clearReporters: () => Unit,
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    provideFallbackReporter: Reporter => Unit,
    specDone: SpecResult => Unit,
    specStarted: SpecResult => Unit,
    suiteDone: SuiteResult => Unit,
    suiteStarted: SuiteResult => Unit
  ): ReportDispatcher = {
    val __obj = js.Dynamic.literal(addReporter = js.Any.fromFunction1(addReporter), clearReporters = js.Any.fromFunction0(clearReporters), jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), provideFallbackReporter = js.Any.fromFunction1(provideFallbackReporter), specDone = js.Any.fromFunction1(specDone), specStarted = js.Any.fromFunction1(specStarted), suiteDone = js.Any.fromFunction1(suiteDone), suiteStarted = js.Any.fromFunction1(suiteStarted))
    __obj.asInstanceOf[ReportDispatcher]
  }
  @scala.inline
  implicit class ReportDispatcherOps[Self <: ReportDispatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddReporter(value: Reporter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReporter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearReporters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearReporters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProvideFallbackReporter(value: Reporter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideFallbackReporter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

