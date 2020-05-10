package typingsSlinky.jestCore.reporterDispatcherMod

import typingsSlinky.jestReporters.typesMod.Reporter
import typingsSlinky.jestReporters.typesMod.ReporterOnStartOptions
import typingsSlinky.jestRunner.mod.Test
import typingsSlinky.jestRuntime.mod.Context
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterDispatcher extends js.Object {
  var _reporters: js.Any = js.native
  def getErrors(): js.Array[js.Error] = js.native
  def hasErrors(): Boolean = js.native
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] = js.native
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] = js.native
  def onTestResult(test: Test, testResult: TestResult, results: AggregatedResult): js.Promise[Unit] = js.native
  def onTestStart(test: Test): js.Promise[Unit] = js.native
  def register(reporter: Reporter): Unit = js.native
  def unregister(ReporterClass: js.Function): Unit = js.native
}

object ReporterDispatcher {
  @scala.inline
  def apply(
    _reporters: js.Any,
    getErrors: () => js.Array[js.Error],
    hasErrors: () => Boolean,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit],
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit],
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit],
    onTestStart: Test => js.Promise[Unit],
    register: Reporter => Unit,
    unregister: js.Function => Unit
  ): ReporterDispatcher = {
    val __obj = js.Dynamic.literal(_reporters = _reporters.asInstanceOf[js.Any], getErrors = js.Any.fromFunction0(getErrors), hasErrors = js.Any.fromFunction0(hasErrors), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[ReporterDispatcher]
  }
  @scala.inline
  implicit class ReporterDispatcherOps[Self <: ReporterDispatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_reporters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_reporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetErrors(value: () => js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasErrors(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRunComplete(value: (Set[Context], AggregatedResult) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRunComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnRunStart(value: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRunStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnTestResult(value: (Test, TestResult, AggregatedResult) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTestResult")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnTestStart(value: Test => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTestStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: Reporter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregister(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

