package typingsSlinky.jestTypes.configMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestTypes.anon.Config
import typingsSlinky.jestTypes.jestTypesStrings.`json-summary`
import typingsSlinky.jestTypes.jestTypesStrings.`text-lcov`
import typingsSlinky.jestTypes.jestTypesStrings.`text-summary`
import typingsSlinky.jestTypes.jestTypesStrings.clover
import typingsSlinky.jestTypes.jestTypesStrings.cobertura
import typingsSlinky.jestTypes.jestTypesStrings.html
import typingsSlinky.jestTypes.jestTypesStrings.json_
import typingsSlinky.jestTypes.jestTypesStrings.lcovonly
import typingsSlinky.jestTypes.jestTypesStrings.none
import typingsSlinky.jestTypes.jestTypesStrings.teamcity
import typingsSlinky.jestTypes.jestTypesStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalConfig extends js.Object {
  var bail: Double = js.native
  var changedFilesWithAncestor: Boolean = js.native
  var changedSince: String = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.Array[Glob] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.native
  var coverageDirectory: String = js.native
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.native
  var coverageReporters: js.Array[
    clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
  ] = js.native
  var coverageThreshold: CoverageThreshold = js.native
  var detectLeaks: Boolean = js.native
  var detectOpenHandles: Boolean = js.native
  var enabledTestsMap: js.UndefOr[StringDictionary[StringDictionary[Boolean]] | Null] = js.native
  var errorOnDeprecated: Boolean = js.native
  var expand: Boolean = js.native
  var extraGlobals: js.Array[String] = js.native
  var filter: js.UndefOr[Path | Null] = js.native
  var findRelatedTests: Boolean = js.native
  var forceExit: Boolean = js.native
  var globalSetup: js.UndefOr[String | Null] = js.native
  var globalTeardown: js.UndefOr[String | Null] = js.native
  var json: Boolean = js.native
  var lastCommit: Boolean = js.native
  var listTests: Boolean = js.native
  var logHeapUsage: Boolean = js.native
  var maxConcurrency: Double = js.native
  var maxWorkers: Double = js.native
  var noSCM: js.UndefOr[Boolean | Null] = js.native
  var noStackTrace: Boolean = js.native
  var nonFlagArgs: js.Array[String] = js.native
  var notifyMode: NotifyMode = js.native
  @JSName("notify")
  var notify_FGlobalConfig: Boolean = js.native
  var onlyChanged: Boolean = js.native
  var onlyFailures: Boolean = js.native
  var outputFile: js.UndefOr[Path | Null] = js.native
  var passWithNoTests: Boolean = js.native
  var projects: js.Array[Glob] = js.native
  var replname: js.UndefOr[String | Null] = js.native
  var reporters: js.Array[String | ReporterConfig] = js.native
  var rootDir: Path = js.native
  var runTestsByPath: Boolean = js.native
  var silent: Boolean = js.native
  var skipFilter: Boolean = js.native
  var testFailureExitCode: Double = js.native
  var testNamePattern: String = js.native
  var testPathPattern: String = js.native
  var testResultsProcessor: js.UndefOr[String | Null] = js.native
  var testSequencer: String = js.native
  var testTimeout: Double = js.native
  var updateSnapshot: SnapshotUpdateState = js.native
  var useStderr: Boolean = js.native
  var verbose: js.UndefOr[Boolean | Null] = js.native
  var watch: Boolean = js.native
  var watchAll: Boolean = js.native
  var watchPlugins: js.UndefOr[js.Array[Config] | Null] = js.native
  var watchman: Boolean = js.native
}

object GlobalConfig {
  @scala.inline
  def apply(
    bail: Double,
    changedFilesWithAncestor: Boolean,
    changedSince: String,
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[Glob],
    coverageDirectory: String,
    coverageReporters: js.Array[
      clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
    ],
    coverageThreshold: CoverageThreshold,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    expand: Boolean,
    extraGlobals: js.Array[String],
    findRelatedTests: Boolean,
    forceExit: Boolean,
    json: Boolean,
    lastCommit: Boolean,
    listTests: Boolean,
    logHeapUsage: Boolean,
    maxConcurrency: Double,
    maxWorkers: Double,
    noStackTrace: Boolean,
    nonFlagArgs: js.Array[String],
    notify: Boolean,
    notifyMode: NotifyMode,
    onlyChanged: Boolean,
    onlyFailures: Boolean,
    passWithNoTests: Boolean,
    projects: js.Array[Glob],
    reporters: js.Array[String | ReporterConfig],
    rootDir: Path,
    runTestsByPath: Boolean,
    silent: Boolean,
    skipFilter: Boolean,
    testFailureExitCode: Double,
    testNamePattern: String,
    testPathPattern: String,
    testSequencer: String,
    testTimeout: Double,
    updateSnapshot: SnapshotUpdateState,
    useStderr: Boolean,
    watch: Boolean,
    watchAll: Boolean,
    watchman: Boolean
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], changedSince = changedSince.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], coverageThreshold = coverageThreshold.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testNamePattern = testNamePattern.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
  @scala.inline
  implicit class GlobalConfigOps[Self <: GlobalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedFilesWithAncestor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFilesWithAncestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectCoverageFrom(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverageDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverageReporters(
      value: js.Array[
          clover | cobertura | html | json_ | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageReporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverageThreshold(value: CoverageThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageThreshold")(value.asInstanceOf[js.Any])
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
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraGlobals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindRelatedTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRelatedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogHeapUsage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logHeapUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonFlagArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonFlagArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyMode(value: NotifyMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyFailures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassWithNoTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passWithNoTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjects(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReporters(value: js.Array[String | ReporterConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunTestsByPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTestsByPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestFailureExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFailureExitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestNamePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPathPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSequencer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSequencer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateSnapshot(value: SnapshotUpdateState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSnapshot")(value.asInstanceOf[js.Any])
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
    def withWatchAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchman(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageOnlyFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectCoverageOnlyFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageOnlyFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectCoverageOnlyFromNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageOnlyFrom")(null)
        ret
    }
    @scala.inline
    def withCoveragePathIgnorePatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coveragePathIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoveragePathIgnorePatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coveragePathIgnorePatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledTestsMap(value: StringDictionary[StringDictionary[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledTestsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledTestsMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledTestsMap")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledTestsMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledTestsMap")(null)
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
    def withNoSCM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSCM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSCM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSCM")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSCMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSCM")(null)
        ret
    }
    @scala.inline
    def withOutputFile(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFile")(null)
        ret
    }
    @scala.inline
    def withReplname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replname")(js.undefined)
        ret
    }
    @scala.inline
    def withReplnameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replname")(null)
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
    @scala.inline
    def withWatchPlugins(value: js.Array[Config]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchPluginsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPlugins")(null)
        ret
    }
  }
  
}

