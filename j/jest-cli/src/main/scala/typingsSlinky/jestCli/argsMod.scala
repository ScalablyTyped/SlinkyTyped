package typingsSlinky.jestCli

import typingsSlinky.jestCli.anon.Alias
import typingsSlinky.jestCli.anon.AliasDescription
import typingsSlinky.jestCli.anon.ArgumentsPartialallboolea
import typingsSlinky.jestCli.anon.Default
import typingsSlinky.jestCli.anon.DefaultDescription
import typingsSlinky.jestCli.anon.DefaultDescriptionType
import typingsSlinky.jestCli.anon.DefaultString
import typingsSlinky.jestCli.anon.Description
import typingsSlinky.jestCli.anon.DescriptionString
import typingsSlinky.jestCli.anon.DescriptionType
import typingsSlinky.jestCli.anon.Nargs
import typingsSlinky.jestCli.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli/args", JSImport.Namespace)
@js.native
object argsMod extends js.Object {
  val docs: /* "Documentation: https://jestjs.io/" */ String = js.native
  val usage: /* "Usage: $0 [--config=<pathToConfigFile>] [TestPathPattern]" */ String = js.native
  def check(argv: ArgumentsPartialallboolea): Boolean = js.native
  @js.native
  object options extends js.Object {
    var all: Default = js.native
    var automock: Default = js.native
    var bail: Alias = js.native
    var browser: Default = js.native
    var cache: Default = js.native
    var cacheDirectory: Description = js.native
    var changedFilesWithAncestor: Default = js.native
    var changedSince: Nargs = js.native
    var ci: Type = js.native
    var clearCache: Default = js.native
    var clearMocks: Default = js.native
    var collectCoverage: Default = js.native
    var collectCoverageFrom: Description = js.native
    var collectCoverageOnlyFrom: typingsSlinky.jestCli.anon.String = js.native
    var color: Default = js.native
    var colors: Default = js.native
    var config: AliasDescription = js.native
    var coverage: Default = js.native
    var coverageDirectory: Description = js.native
    var coveragePathIgnorePatterns: typingsSlinky.jestCli.anon.String = js.native
    var coverageReporters: typingsSlinky.jestCli.anon.String = js.native
    var coverageThreshold: Description = js.native
    var debug: Default = js.native
    var detectLeaks: Type = js.native
    var detectOpenHandles: Type = js.native
    var env: Description = js.native
    var errorOnDeprecated: Type = js.native
    var expand: Alias = js.native
    var filter: DefaultDescription = js.native
    var findRelatedTests: Default = js.native
    var forceExit: Default = js.native
    var globalSetup: Description = js.native
    var globalTeardown: Description = js.native
    var globals: Description = js.native
    var haste: Description = js.native
    var init: DescriptionType = js.native
    var json: Default = js.native
    var lastCommit: Default = js.native
    var listTests: Type = js.native
    var logHeapUsage: Default = js.native
    var mapCoverage: Default = js.native
    var maxConcurrency: DefaultDescriptionType = js.native
    var maxWorkers: AliasDescription = js.native
    var moduleDirectories: typingsSlinky.jestCli.anon.String = js.native
    var moduleFileExtensions: typingsSlinky.jestCli.anon.String = js.native
    var moduleNameMapper: Description = js.native
    var modulePathIgnorePatterns: typingsSlinky.jestCli.anon.String = js.native
    var modulePaths: typingsSlinky.jestCli.anon.String = js.native
    var noStackTrace: Default = js.native
    var notifyMode: DefaultString = js.native
    @JSName("notify")
    var notify_Foptions: Default = js.native
    var onlyChanged: Alias = js.native
    var onlyFailures: Alias = js.native
    var outputFile: Description = js.native
    var passWithNoTests: Type = js.native
    var preset: Description = js.native
    var prettierPath: DefaultDescription = js.native
    var projects: typingsSlinky.jestCli.anon.String = js.native
    var reporters: typingsSlinky.jestCli.anon.String = js.native
    var resetMocks: Default = js.native
    var resetModules: Default = js.native
    var resolver: Description = js.native
    var restoreMocks: Default = js.native
    var rootDir: Description = js.native
    var roots: typingsSlinky.jestCli.anon.String = js.native
    var runInBand: Alias = js.native
    var runTestsByPath: Type = js.native
    var runner: Description = js.native
    var setupFiles: typingsSlinky.jestCli.anon.String = js.native
    var setupFilesAfterEnv: typingsSlinky.jestCli.anon.String = js.native
    var showConfig: Default = js.native
    var silent: Default = js.native
    var skipFilter: Default = js.native
    var snapshotSerializers: typingsSlinky.jestCli.anon.String = js.native
    var testEnvironment: Description = js.native
    var testEnvironmentOptions: Description = js.native
    var testFailureExitCode: Description = js.native
    var testLocationInResults: Type = js.native
    var testMatch: typingsSlinky.jestCli.anon.String = js.native
    var testNamePattern: AliasDescription = js.native
    var testPathIgnorePatterns: typingsSlinky.jestCli.anon.String = js.native
    var testPathPattern: typingsSlinky.jestCli.anon.String = js.native
    var testRegex: typingsSlinky.jestCli.anon.String = js.native
    var testResultsProcessor: Description = js.native
    var testRunner: Description = js.native
    var testSequencer: Description = js.native
    var testTimeout: DescriptionString = js.native
    var testURL: Description = js.native
    var timers: Description = js.native
    var transform: Description = js.native
    var transformIgnorePatterns: typingsSlinky.jestCli.anon.String = js.native
    var unmockedModulePathPatterns: typingsSlinky.jestCli.anon.String = js.native
    var updateSnapshot: Alias = js.native
    var useStderr: Default = js.native
    var verbose: Default = js.native
    var version: Alias = js.native
    var watch: Default = js.native
    var watchAll: Default = js.native
    var watchPathIgnorePatterns: typingsSlinky.jestCli.anon.String = js.native
    var watchman: Default = js.native
  }
  
}

