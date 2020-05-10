package typingsSlinky.jestWatcher.typesMod

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestHookEmitter extends js.Object {
  def onFileChange(fs: JestHookExposedFS): Unit = js.native
  def onTestRunComplete(results: AggregatedResult): Unit = js.native
  def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean] = js.native
}

object JestHookEmitter {
  @scala.inline
  def apply(
    onFileChange: JestHookExposedFS => Unit,
    onTestRunComplete: AggregatedResult => Unit,
    shouldRunTestSuite: TestSuiteInfo => js.Promise[Boolean]
  ): JestHookEmitter = {
    val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
    __obj.asInstanceOf[JestHookEmitter]
  }
  @scala.inline
  implicit class JestHookEmitterOps[Self <: JestHookEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFileChange(value: JestHookExposedFS => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTestRunComplete(value: AggregatedResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTestRunComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldRunTestSuite(value: TestSuiteInfo => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRunTestSuite")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

