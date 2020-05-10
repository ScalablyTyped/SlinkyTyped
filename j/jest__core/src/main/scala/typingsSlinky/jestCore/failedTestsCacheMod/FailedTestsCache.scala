package typingsSlinky.jestCore.failedTestsCacheMod

import typingsSlinky.jestRunner.mod.Test
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedTestsCache extends js.Object {
  var _enabledTestsMap: js.UndefOr[js.Any] = js.native
  def filterTests(tests: js.Array[Test]): js.Array[Test] = js.native
  def setTestResults(testResults: js.Array[TestResult]): Unit = js.native
  def updateConfig(globalConfig: GlobalConfig): GlobalConfig = js.native
}

object FailedTestsCache {
  @scala.inline
  def apply(
    filterTests: js.Array[Test] => js.Array[Test],
    setTestResults: js.Array[TestResult] => Unit,
    updateConfig: GlobalConfig => GlobalConfig
  ): FailedTestsCache = {
    val __obj = js.Dynamic.literal(filterTests = js.Any.fromFunction1(filterTests), setTestResults = js.Any.fromFunction1(setTestResults), updateConfig = js.Any.fromFunction1(updateConfig))
    __obj.asInstanceOf[FailedTestsCache]
  }
  @scala.inline
  implicit class FailedTestsCacheOps[Self <: FailedTestsCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterTests(value: js.Array[Test] => js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTests")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTestResults(value: js.Array[TestResult] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTestResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateConfig(value: GlobalConfig => GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_enabledTestsMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enabledTestsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_enabledTestsMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enabledTestsMap")(js.undefined)
        ret
    }
  }
  
}

