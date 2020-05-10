package typingsSlinky.jestCore

import typingsSlinky.jestChangedFiles.typesMod.ChangedFiles
import typingsSlinky.jestCore.failedTestsCacheMod.default
import typingsSlinky.jestCore.typesMod.Filter
import typingsSlinky.jestRuntime.typesMod.Context
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangedFilesPromise extends js.Object {
  var changedFilesPromise: js.UndefOr[js.Promise[ChangedFiles]] = js.native
  var contexts: js.Array[Context] = js.native
  var failedTestsCache: js.UndefOr[default] = js.native
  var filter: js.UndefOr[Filter] = js.native
  var globalConfig: GlobalConfig = js.native
  var jestHooks: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any
  ] = js.native
  var outputStream: WritableStream = js.native
  var testWatcher: typingsSlinky.jestCore.testWatcherMod.default = js.native
  def onComplete(testResults: AggregatedResult): Unit = js.native
  def startRun(globalConfig: GlobalConfig): Unit = js.native
}

object AnonChangedFilesPromise {
  @scala.inline
  def apply(
    contexts: js.Array[Context],
    globalConfig: GlobalConfig,
    onComplete: AggregatedResult => Unit,
    outputStream: WritableStream,
    startRun: GlobalConfig => Unit,
    testWatcher: typingsSlinky.jestCore.testWatcherMod.default
  ): AnonChangedFilesPromise = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1(onComplete), outputStream = outputStream.asInstanceOf[js.Any], startRun = js.Any.fromFunction1(startRun), testWatcher = testWatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedFilesPromise]
  }
  @scala.inline
  implicit class AnonChangedFilesPromiseOps[Self <: AnonChangedFilesPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalConfig(value: GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnComplete(value: AggregatedResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutputStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartRun(value: GlobalConfig => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRun")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestWatcher(value: typingsSlinky.jestCore.testWatcherMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testWatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedFilesPromise(value: js.Promise[ChangedFiles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFilesPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedFilesPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFilesPromise")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedTestsCache(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedTestsCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedTestsCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedTestsCache")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* testPaths */ js.Array[String] => js.Promise[AnonFiltered]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withJestHooks(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jestHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJestHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jestHooks")(js.undefined)
        ret
    }
  }
  
}

