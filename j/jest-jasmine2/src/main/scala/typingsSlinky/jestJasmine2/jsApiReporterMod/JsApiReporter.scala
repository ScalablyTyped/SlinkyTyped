package typingsSlinky.jestJasmine2.jsApiReporterMod

import typingsSlinky.jestJasmine2.specMod.SpecResult
import typingsSlinky.jestJasmine2.suiteMod.SuiteResult
import typingsSlinky.jestJasmine2.typesMod.Reporter
import typingsSlinky.jestJasmine2.typesMod.RunDetails
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsApiReporter extends Reporter {
  var finished: Boolean = js.native
  var runDetails: RunDetails = js.native
  var started: Boolean = js.native
  def executionTime(): js.Any = js.native
  def specResults(index: Double, length: Double): js.Array[SpecResult] = js.native
  def specs(): js.Array[SpecResult] = js.native
  def status(): js.Any = js.native
  def suiteResults(index: Double, length: Double): js.Array[SuiteResult] = js.native
  def suites(): Record[String, SuiteResult] = js.native
}

object JsApiReporter {
  @scala.inline
  def apply(
    executionTime: () => js.Any,
    finished: Boolean,
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    runDetails: RunDetails,
    specDone: SpecResult => Unit,
    specResults: (Double, Double) => js.Array[SpecResult],
    specStarted: SpecResult => Unit,
    specs: () => js.Array[SpecResult],
    started: Boolean,
    status: () => js.Any,
    suiteDone: SuiteResult => Unit,
    suiteResults: (Double, Double) => js.Array[SuiteResult],
    suiteStarted: SuiteResult => Unit,
    suites: () => Record[String, SuiteResult]
  ): JsApiReporter = {
    val __obj = js.Dynamic.literal(executionTime = js.Any.fromFunction0(executionTime), finished = finished.asInstanceOf[js.Any], jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), runDetails = runDetails.asInstanceOf[js.Any], specDone = js.Any.fromFunction1(specDone), specResults = js.Any.fromFunction2(specResults), specStarted = js.Any.fromFunction1(specStarted), specs = js.Any.fromFunction0(specs), started = started.asInstanceOf[js.Any], status = js.Any.fromFunction0(status), suiteDone = js.Any.fromFunction1(suiteDone), suiteResults = js.Any.fromFunction2(suiteResults), suiteStarted = js.Any.fromFunction1(suiteStarted), suites = js.Any.fromFunction0(suites))
    __obj.asInstanceOf[JsApiReporter]
  }
  @scala.inline
  implicit class JsApiReporterOps[Self <: JsApiReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionTime(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFinished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunDetails(value: RunDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecResults(value: (Double, Double) => js.Array[SpecResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specResults")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSpecs(value: () => js.Array[SpecResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSuiteResults(value: (Double, Double) => js.Array[SuiteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteResults")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuites(value: () => Record[String, SuiteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suites")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

