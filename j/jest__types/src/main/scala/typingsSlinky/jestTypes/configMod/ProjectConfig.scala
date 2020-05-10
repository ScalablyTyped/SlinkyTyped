package typingsSlinky.jestTypes.configMod

import typingsSlinky.jestTypes.jestTypesStrings.fake
import typingsSlinky.jestTypes.jestTypesStrings.real
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectConfig extends js.Object {
  var automock: Boolean = js.native
  var browser: Boolean = js.native
  var cache: Boolean = js.native
  var cacheDirectory: Path = js.native
  var clearMocks: Boolean = js.native
  var coveragePathIgnorePatterns: js.Array[String] = js.native
  var cwd: Path = js.native
  var dependencyExtractor: js.UndefOr[String] = js.native
  var detectLeaks: Boolean = js.native
  var detectOpenHandles: Boolean = js.native
  var displayName: js.UndefOr[DisplayName] = js.native
  var errorOnDeprecated: Boolean = js.native
  var extraGlobals: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
  ] = js.native
  var filter: js.UndefOr[Path | Null] = js.native
  var forceCoverageMatch: js.Array[Glob] = js.native
  var globalSetup: js.UndefOr[String | Null] = js.native
  var globalTeardown: js.UndefOr[String | Null] = js.native
  var globals: ConfigGlobals = js.native
  var haste: HasteConfig = js.native
  var moduleDirectories: js.Array[String] = js.native
  var moduleFileExtensions: js.Array[String] = js.native
  var moduleLoader: Path = js.native
  var moduleNameMapper: js.Array[js.Tuple2[String, String]] = js.native
  var modulePathIgnorePatterns: js.Array[String] = js.native
  var modulePaths: js.Array[String] = js.native
  var name: String = js.native
  var prettierPath: String = js.native
  var resetMocks: Boolean = js.native
  var resetModules: Boolean = js.native
  var resolver: js.UndefOr[Path | Null] = js.native
  var restoreMocks: Boolean = js.native
  var rootDir: Path = js.native
  var roots: js.Array[Path] = js.native
  var runner: String = js.native
  var setupFiles: js.Array[Path] = js.native
  var setupFilesAfterEnv: js.Array[Path] = js.native
  var skipFilter: Boolean = js.native
  var skipNodeResolution: Boolean = js.native
  var snapshotResolver: js.UndefOr[Path | Null] = js.native
  var snapshotSerializers: js.Array[Path] = js.native
  var testEnvironment: String = js.native
  var testEnvironmentOptions: Record[String, _] = js.native
  var testLocationInResults: Boolean = js.native
  var testMatch: js.Array[Glob] = js.native
  var testPathIgnorePatterns: js.Array[String] = js.native
  var testRegex: js.Array[String] = js.native
  var testRunner: String = js.native
  var testURL: String = js.native
  var timers: real | fake = js.native
  var transform: js.Array[js.Tuple3[String, Path, Record[String, _]]] = js.native
  var transformIgnorePatterns: js.Array[Glob] = js.native
  var unmockedModulePathPatterns: js.UndefOr[js.Array[String] | Null] = js.native
  var watchPathIgnorePatterns: js.Array[String] = js.native
}

object ProjectConfig {
  @scala.inline
  def apply(
    automock: Boolean,
    browser: Boolean,
    cache: Boolean,
    cacheDirectory: Path,
    clearMocks: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    cwd: Path,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    extraGlobals: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
    ],
    forceCoverageMatch: js.Array[Glob],
    globals: ConfigGlobals,
    haste: HasteConfig,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleLoader: Path,
    moduleNameMapper: js.Array[js.Tuple2[String, String]],
    modulePathIgnorePatterns: js.Array[String],
    modulePaths: js.Array[String],
    name: String,
    prettierPath: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    rootDir: Path,
    roots: js.Array[Path],
    runner: String,
    setupFiles: js.Array[Path],
    setupFilesAfterEnv: js.Array[Path],
    skipFilter: Boolean,
    skipNodeResolution: Boolean,
    snapshotSerializers: js.Array[Path],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, _],
    testLocationInResults: Boolean,
    testMatch: js.Array[Glob],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String],
    testRunner: String,
    testURL: String,
    timers: real | fake,
    transform: js.Array[js.Tuple3[String, Path, Record[String, _]]],
    transformIgnorePatterns: js.Array[Glob],
    watchPathIgnorePatterns: js.Array[String]
  ): ProjectConfig = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleLoader = moduleLoader.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], modulePaths = modulePaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], skipNodeResolution = skipNodeResolution.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testURL = testURL.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfig]
  }
  @scala.inline
  implicit class ProjectConfigOps[Self <: ProjectConfig] (val x: Self) extends AnyVal {
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
    def withClearMocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoveragePathIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coveragePathIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCwd(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectLeaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectLeaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectOpenHandles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectOpenHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorOnDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnDeprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraGlobals(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraGlobals")(value.asInstanceOf[js.Any])
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
    def withModuleLoader(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleNameMapper(value: js.Array[js.Tuple2[String, String]]): Self = {
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
    def withModulePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrettierPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettierPath")(value.asInstanceOf[js.Any])
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
    def withRootDir(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoots(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(value.asInstanceOf[js.Any])
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
    def withSkipNodeResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNodeResolution")(value.asInstanceOf[js.Any])
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
    def withTestRunner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunner")(value.asInstanceOf[js.Any])
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
    def withTransform(value: js.Array[js.Tuple3[String, Path, Record[String, _]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformIgnorePatterns(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchPathIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPathIgnorePatterns")(value.asInstanceOf[js.Any])
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
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
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
    def withSnapshotResolver(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotResolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotResolverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotResolver")(null)
        ret
    }
    @scala.inline
    def withUnmockedModulePathPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmockedModulePathPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmockedModulePathPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmockedModulePathPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmockedModulePathPatternsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmockedModulePathPatterns")(null)
        ret
    }
  }
  
}

