package typingsSlinky.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestTypes.anon.Global
import typingsSlinky.jestTypes.jestTypesStrings.fake
import typingsSlinky.jestTypes.jestTypesStrings.real
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOptions extends js.Object {
  var automock: Boolean = js.native
  var bail: Double = js.native
  var browser: Boolean = js.native
  var cache: Boolean = js.native
  var cacheDirectory: Path = js.native
  var changedFilesWithAncestor: Boolean = js.native
  var clearMocks: Boolean = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.UndefOr[js.Array[String] | Null] = js.native
  var coverageDirectory: js.UndefOr[String | Null] = js.native
  var coveragePathIgnorePatterns: js.Array[String] = js.native
  var coverageReporters: js.Array[String] = js.native
  var coverageThreshold: js.UndefOr[Global | Null] = js.native
  var dependencyExtractor: js.UndefOr[String | Null] = js.native
  var errorOnDeprecated: Boolean = js.native
  var expand: Boolean = js.native
  var filter: js.UndefOr[Path | Null] = js.native
  var forceCoverageMatch: js.Array[Glob] = js.native
  var globalSetup: js.UndefOr[String | Null] = js.native
  var globalTeardown: js.UndefOr[String | Null] = js.native
  var globals: ConfigGlobals = js.native
  var haste: HasteConfig = js.native
  var maxConcurrency: Double = js.native
  var maxWorkers: Double | String = js.native
  var moduleDirectories: js.Array[String] = js.native
  var moduleFileExtensions: js.Array[String] = js.native
  var moduleNameMapper: StringDictionary[String] = js.native
  var modulePathIgnorePatterns: js.Array[String] = js.native
  var noStackTrace: Boolean = js.native
  var notifyMode: String = js.native
  @JSName("notify")
  var notify_FDefaultOptions: Boolean = js.native
  var preset: js.UndefOr[String | Null] = js.native
  var prettierPath: js.UndefOr[String | Null] = js.native
  var projects: js.UndefOr[(js.Array[String | ProjectConfig]) | Null] = js.native
  var resetMocks: Boolean = js.native
  var resetModules: Boolean = js.native
  var resolver: js.UndefOr[Path | Null] = js.native
  var restoreMocks: Boolean = js.native
  var rootDir: js.UndefOr[Path | Null] = js.native
  var roots: js.UndefOr[js.Array[Path] | Null] = js.native
  var runTestsByPath: Boolean = js.native
  var runner: String = js.native
  var setupFiles: js.Array[Path] = js.native
  var setupFilesAfterEnv: js.Array[Path] = js.native
  var skipFilter: Boolean = js.native
  var snapshotSerializers: js.Array[Path] = js.native
  var testEnvironment: String = js.native
  var testEnvironmentOptions: Record[String, _] = js.native
  var testFailureExitCode: String | Double = js.native
  var testLocationInResults: Boolean = js.native
  var testMatch: js.Array[Glob] = js.native
  var testPathIgnorePatterns: js.Array[String] = js.native
  var testRegex: js.Array[String] = js.native
  var testResultsProcessor: js.UndefOr[String | Null] = js.native
  var testRunner: js.UndefOr[String | Null] = js.native
  var testSequencer: String = js.native
  var testURL: String = js.native
  var timers: real | fake = js.native
  var transform: js.UndefOr[(StringDictionary[Path | TransformerConfig]) | Null] = js.native
  var transformIgnorePatterns: js.Array[Glob] = js.native
  var useStderr: Boolean = js.native
  var verbose: js.UndefOr[Boolean | Null] = js.native
  var watch: Boolean = js.native
  var watchPathIgnorePatterns: js.Array[String] = js.native
  var watchman: Boolean = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(
    automock: Boolean,
    bail: Double,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: Path,
    changedFilesWithAncestor: Boolean,
    clearMocks: Boolean,
    collectCoverage: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    coverageReporters: js.Array[String],
    errorOnDeprecated: Boolean,
    expand: Boolean,
    forceCoverageMatch: js.Array[Glob],
    globals: ConfigGlobals,
    haste: HasteConfig,
    maxConcurrency: Double,
    maxWorkers: Double | String,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleNameMapper: StringDictionary[String],
    modulePathIgnorePatterns: js.Array[String],
    noStackTrace: Boolean,
    notify: Boolean,
    notifyMode: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    runTestsByPath: Boolean,
    runner: String,
    setupFiles: js.Array[Path],
    setupFilesAfterEnv: js.Array[Path],
    skipFilter: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, _],
    testFailureExitCode: String | Double,
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String],
    testSequencer: String,
    testURL: String,
    timers: real | fake,
    transformIgnorePatterns: js.Array[Glob],
    useStderr: Boolean,
    watch: Boolean,
    watchPathIgnorePatterns: js.Array[String],
    watchman: Boolean
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheDirectory(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedFilesWithAncestor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFilesWithAncestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearMocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoveragePathIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coveragePathIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverageReporters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageReporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorOnDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnDeprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceCoverageMatch(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCoverageMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobals(value: ConfigGlobals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHaste(value: HasteConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWorkers(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleDirectories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleDirectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleFileExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleNameMapper(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleNameMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulePathIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePathIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetMocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetMocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestoreMocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreMocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunTestsByPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTestsByPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupFiles(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupFilesAfterEnv(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupFilesAfterEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotSerializers(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotSerializers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestEnvironmentOptions(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEnvironmentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestFailureExitCode(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFailureExitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestLocationInResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testLocationInResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestMatch(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPathIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRegex(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSequencer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSequencer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimers(value: real | fake): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformIgnorePatterns(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseStderr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchPathIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPathIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchman(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectCoverageFrom(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectCoverageFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectCoverageFromNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(null)
        ret
    }
    @scala.inline
    def withCoverageDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageDirectoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageDirectory")(null)
        ret
    }
    @scala.inline
    def withCoverageThreshold(value: Global): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageThresholdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageThreshold")(null)
        ret
    }
    @scala.inline
    def withDependencyExtractor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencyExtractor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencyExtractorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(null)
        ret
    }
    @scala.inline
    def withFilter(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(null)
        ret
    }
    @scala.inline
    def withGlobalSetup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSetup")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSetupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalSetup")(null)
        ret
    }
    @scala.inline
    def withGlobalTeardown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTeardown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTeardown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTeardown")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTeardownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalTeardown")(null)
        ret
    }
    @scala.inline
    def withPreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withPresetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(null)
        ret
    }
    @scala.inline
    def withPrettierPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettierPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettierPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettierPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettierPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettierPath")(null)
        ret
    }
    @scala.inline
    def withProjects(value: js.Array[String | ProjectConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(null)
        ret
    }
    @scala.inline
    def withResolver(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(null)
        ret
    }
    @scala.inline
    def withRootDir(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(null)
        ret
    }
    @scala.inline
    def withRoots(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(js.undefined)
        ret
    }
    @scala.inline
    def withRootsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(null)
        ret
    }
    @scala.inline
    def withTestResultsProcessor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResultsProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestResultsProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResultsProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withTestResultsProcessorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResultsProcessor")(null)
        ret
    }
    @scala.inline
    def withTestRunner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestRunner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunner")(js.undefined)
        ret
    }
    @scala.inline
    def withTestRunnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunner")(null)
        ret
    }
    @scala.inline
    def withTransform(value: StringDictionary[Path | TransformerConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(null)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withVerboseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(null)
        ret
    }
  }
  
}

