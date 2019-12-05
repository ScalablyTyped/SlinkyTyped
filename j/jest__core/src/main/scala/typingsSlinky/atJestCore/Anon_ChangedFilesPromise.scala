package typingsSlinky.atJestCore

import typingsSlinky.atJestCore.buildFailedTestsCacheMod.default
import typingsSlinky.atJestCore.buildTypesMod.Filter
import typingsSlinky.atJestTestDashResult.buildTypesMod.AggregatedResult
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.jestDashChangedDashFiles.buildTypesMod.ChangedFiles
import typingsSlinky.jestDashRuntime.buildTypesMod.Context
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedFilesPromise extends js.Object {
  var changedFilesPromise: js.UndefOr[js.Promise[ChangedFiles]] = js.undefined
  var contexts: js.Array[Context]
  var failedTestsCache: js.UndefOr[default] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var globalConfig: GlobalConfig
  var jestHooks: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any
  ] = js.undefined
  var outputStream: WritableStream
  var testWatcher: typingsSlinky.atJestCore.buildTestWatcherMod.default
  def onComplete(testResults: AggregatedResult): Unit
  def startRun(globalConfig: GlobalConfig): Unit
}

object Anon_ChangedFilesPromise {
  @scala.inline
  def apply(
    contexts: js.Array[Context],
    globalConfig: GlobalConfig,
    onComplete: AggregatedResult => Unit,
    outputStream: WritableStream,
    startRun: GlobalConfig => Unit,
    testWatcher: typingsSlinky.atJestCore.buildTestWatcherMod.default,
    changedFilesPromise: js.Promise[ChangedFiles] = null,
    failedTestsCache: default = null,
    filter: /* testPaths */ js.Array[String] => js.Promise[Anon_Filtered] = null,
    jestHooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookEmitter */ js.Any = null
  ): Anon_ChangedFilesPromise = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1(onComplete), outputStream = outputStream.asInstanceOf[js.Any], startRun = js.Any.fromFunction1(startRun), testWatcher = testWatcher.asInstanceOf[js.Any])
    if (changedFilesPromise != null) __obj.updateDynamic("changedFilesPromise")(changedFilesPromise.asInstanceOf[js.Any])
    if (failedTestsCache != null) __obj.updateDynamic("failedTestsCache")(failedTestsCache.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (jestHooks != null) __obj.updateDynamic("jestHooks")(jestHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChangedFilesPromise]
  }
}

