package typingsSlinky.jestJasmine2.reporterMod

import typingsSlinky.jestJasmine2.specMod.SpecResult
import typingsSlinky.jestJasmine2.suiteMod.SuiteResult
import typingsSlinky.jestJasmine2.typesMod.RunDetails
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/reporter", JSImport.Default)
@js.native
class default protected () extends Jasmine2Reporter {
  def this(globalConfig: GlobalConfig, config: ProjectConfig, testPath: Path) = this()
  /* CompleteClass */
  override var _addMissingMessageToStack: js.Any = js.native
  /* CompleteClass */
  override var _config: js.Any = js.native
  /* CompleteClass */
  override var _currentSuites: js.Any = js.native
  /* CompleteClass */
  override var _extractSpecResults: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override var _resolve: js.Any = js.native
  /* CompleteClass */
  override var _resultsPromise: js.Any = js.native
  /* CompleteClass */
  override var _startTimes: js.Any = js.native
  /* CompleteClass */
  override var _testPath: js.Any = js.native
  /* CompleteClass */
  override var _testResults: js.Any = js.native
  /* CompleteClass */
  override def getResults(): js.Promise[TestResult] = js.native
  /* CompleteClass */
  override def jasmineDone(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def jasmineStarted(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def specDone(result: SpecResult): Unit = js.native
  /* CompleteClass */
  override def specStarted(spec: SpecResult): Unit = js.native
  /* CompleteClass */
  override def suiteDone(result: SuiteResult): Unit = js.native
  /* CompleteClass */
  override def suiteStarted(result: SuiteResult): Unit = js.native
}

