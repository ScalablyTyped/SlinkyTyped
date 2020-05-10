package typingsSlinky.jestReporters.typesMod

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  def getLastError(): js.Error | Unit = js.native
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
  def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
  def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
}

object Reporter {
  @scala.inline
  def apply(
    getLastError: () => js.Error | Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(getLastError = js.Any.fromFunction0(getLastError), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLastError(value: () => js.Error | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRunComplete(value: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRunComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnRunStart(value: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRunStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnTestResult(value: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTestResult")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnTestStart(value: Test => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTestStart")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

