package typingsSlinky.jestWatcher.anon

import typingsSlinky.jestWatcher.typesMod.FileChange
import typingsSlinky.jestWatcher.typesMod.ShouldRunTestSuite
import typingsSlinky.jestWatcher.typesMod.TestRunComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookSubscriber> */
@js.native
trait ReadonlyJestHookSubscribe extends js.Object {
  def onFileChange(fn: FileChange): Unit = js.native
  def onTestRunComplete(fn: TestRunComplete): Unit = js.native
  def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit = js.native
}

object ReadonlyJestHookSubscribe {
  @scala.inline
  def apply(
    onFileChange: FileChange => Unit,
    onTestRunComplete: TestRunComplete => Unit,
    shouldRunTestSuite: ShouldRunTestSuite => Unit
  ): ReadonlyJestHookSubscribe = {
    val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
    __obj.asInstanceOf[ReadonlyJestHookSubscribe]
  }
  @scala.inline
  implicit class ReadonlyJestHookSubscribeOps[Self <: ReadonlyJestHookSubscribe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFileChange(value: FileChange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTestRunComplete(value: TestRunComplete => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTestRunComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldRunTestSuite(value: ShouldRunTestSuite => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRunTestSuite")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

