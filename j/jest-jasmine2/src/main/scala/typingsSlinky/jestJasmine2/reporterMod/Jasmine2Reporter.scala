package typingsSlinky.jestJasmine2.reporterMod

import typingsSlinky.jestJasmine2.specMod.SpecResult
import typingsSlinky.jestJasmine2.suiteMod.SuiteResult
import typingsSlinky.jestJasmine2.typesMod.Reporter
import typingsSlinky.jestJasmine2.typesMod.RunDetails
import typingsSlinky.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jasmine2Reporter extends Reporter {
  var _addMissingMessageToStack: js.Any = js.native
  var _config: js.Any = js.native
  var _currentSuites: js.Any = js.native
  var _extractSpecResults: js.Any = js.native
  var _globalConfig: js.Any = js.native
  var _resolve: js.Any = js.native
  var _resultsPromise: js.Any = js.native
  var _startTimes: js.Any = js.native
  var _testPath: js.Any = js.native
  var _testResults: js.Any = js.native
  def getResults(): js.Promise[TestResult] = js.native
}

object Jasmine2Reporter {
  @scala.inline
  def apply(
    _addMissingMessageToStack: js.Any,
    _config: js.Any,
    _currentSuites: js.Any,
    _extractSpecResults: js.Any,
    _globalConfig: js.Any,
    _resolve: js.Any,
    _resultsPromise: js.Any,
    _startTimes: js.Any,
    _testPath: js.Any,
    _testResults: js.Any,
    getResults: () => js.Promise[TestResult],
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    specDone: SpecResult => Unit,
    specStarted: SpecResult => Unit,
    suiteDone: SuiteResult => Unit,
    suiteStarted: SuiteResult => Unit
  ): Jasmine2Reporter = {
    val __obj = js.Dynamic.literal(_addMissingMessageToStack = _addMissingMessageToStack.asInstanceOf[js.Any], _config = _config.asInstanceOf[js.Any], _currentSuites = _currentSuites.asInstanceOf[js.Any], _extractSpecResults = _extractSpecResults.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _resolve = _resolve.asInstanceOf[js.Any], _resultsPromise = _resultsPromise.asInstanceOf[js.Any], _startTimes = _startTimes.asInstanceOf[js.Any], _testPath = _testPath.asInstanceOf[js.Any], _testResults = _testResults.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), specDone = js.Any.fromFunction1(specDone), specStarted = js.Any.fromFunction1(specStarted), suiteDone = js.Any.fromFunction1(suiteDone), suiteStarted = js.Any.fromFunction1(suiteStarted))
    __obj.asInstanceOf[Jasmine2Reporter]
  }
  @scala.inline
  implicit class Jasmine2ReporterOps[Self <: Jasmine2Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_addMissingMessageToStack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_addMissingMessageToStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_config(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentSuites(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_extractSpecResults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_extractSpecResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_globalConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_resolve(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_resultsPromise(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resultsPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_startTimes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_testPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_testPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_testResults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_testResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetResults(value: () => js.Promise[TestResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResults")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

