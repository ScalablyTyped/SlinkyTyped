package typingsSlinky.jestDashWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typingsSlinky.atJestTestDashResult.buildTypesMod.AggregatedResult
  import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
  import typingsSlinky.jestDashWatcher.Anon_Mode
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.bail
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.changedSince
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.collectCoverage
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.collectCoverageFrom
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.collectCoverageOnlyFrom
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.coverageDirectory
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.coverageReporters
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.notify
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.notifyMode
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.onlyFailures
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.reporters
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.testNamePattern
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.testPathPattern
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.updateSnapshot
  import typingsSlinky.jestDashWatcher.jestDashWatcherStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type AllowedConfigOptions = Partial[
    (Pick[
      GlobalConfig, 
      bail | changedSince | collectCoverage | collectCoverageFrom | collectCoverageOnlyFrom | coverageDirectory | coverageReporters | notify | notifyMode | onlyFailures | reporters | testNamePattern | testPathPattern | updateSnapshot | verbose
    ]) with Anon_Mode
  ]
  type FileChange = js.Function1[/* fs */ JestHookExposedFS, Unit]
  type ShouldRunTestSuite = js.Function1[/* testSuiteInfo */ TestSuiteInfo, js.Promise[Boolean]]
  type TestRunComplete = js.Function1[/* results */ AggregatedResult, Unit]
  type UpdateConfigCallback = js.Function1[/* config */ js.UndefOr[AllowedConfigOptions], Unit]
}
