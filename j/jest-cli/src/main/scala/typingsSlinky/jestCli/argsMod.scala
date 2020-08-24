package typingsSlinky.jestCli

import typingsSlinky.jestCli.anon.Alias
import typingsSlinky.jestCli.anon.AliasDefault
import typingsSlinky.jestCli.anon.AliasDefaultDescription
import typingsSlinky.jestCli.anon.AliasDefaultDescriptionType
import typingsSlinky.jestCli.anon.AliasDefaultUndefined
import typingsSlinky.jestCli.anon.AliasDefaultUndefinedDescription
import typingsSlinky.jestCli.anon.AliasDefaultUndefinedDescriptionString
import typingsSlinky.jestCli.anon.AliasDescription
import typingsSlinky.jestCli.anon.AliasDescriptionType
import typingsSlinky.jestCli.anon.Choices
import typingsSlinky.jestCli.anon.Default
import typingsSlinky.jestCli.anon.DefaultDescription
import typingsSlinky.jestCli.anon.DefaultDescriptionString
import typingsSlinky.jestCli.anon.DefaultDescriptionType
import typingsSlinky.jestCli.anon.DefaultUndefined
import typingsSlinky.jestCli.anon.DefaultUndefinedDescription
import typingsSlinky.jestCli.anon.DefaultUndefinedDescriptionString
import typingsSlinky.jestCli.anon.DefaultUndefinedDescriptionType
import typingsSlinky.jestCli.anon.Description
import typingsSlinky.jestCli.anon.DescriptionString
import typingsSlinky.jestCli.anon.DescriptionStringType
import typingsSlinky.jestCli.anon.DescriptionType
import typingsSlinky.jestCli.anon.Nargs
import typingsSlinky.jestCli.anon.StringType
import typingsSlinky.jestCli.anon.Type
import typingsSlinky.jestCli.anon.`0`
import typingsSlinky.jestCli.anon.`10`
import typingsSlinky.jestCli.anon.`11`
import typingsSlinky.jestCli.anon.`12`
import typingsSlinky.jestCli.anon.`13`
import typingsSlinky.jestCli.anon.`14`
import typingsSlinky.jestCli.anon.`15`
import typingsSlinky.jestCli.anon.`16`
import typingsSlinky.jestCli.anon.`17`
import typingsSlinky.jestCli.anon.`18`
import typingsSlinky.jestCli.anon.`19`
import typingsSlinky.jestCli.anon.`1`
import typingsSlinky.jestCli.anon.`20`
import typingsSlinky.jestCli.anon.`21`
import typingsSlinky.jestCli.anon.`22`
import typingsSlinky.jestCli.anon.`23`
import typingsSlinky.jestCli.anon.`2`
import typingsSlinky.jestCli.anon.`3`
import typingsSlinky.jestCli.anon.`4`
import typingsSlinky.jestCli.anon.`5`
import typingsSlinky.jestCli.anon.`6`
import typingsSlinky.jestCli.anon.`7`
import typingsSlinky.jestCli.anon.`8`
import typingsSlinky.jestCli.anon.`9`
import typingsSlinky.jestCli.jestCliBooleans.`true`
import typingsSlinky.jestTypes.configMod.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli/args", JSImport.Namespace)
@js.native
object argsMod extends js.Object {
  val docs: /* "Documentation: https://jestjs.io/" */ String = js.native
  val usage: /* "Usage: $0 [--config=<pathToConfigFile>] [TestPathPattern]" */ String = js.native
  def check(argv: Argv): `true` = js.native
  @js.native
  object options extends js.Object {
    val all: Default = js.native
    val automock: Description = js.native
    val bail: Alias = js.native
    val browser: Default = js.native
    val cache: Default = js.native
    val cacheDirectory: Type = js.native
    val changedFilesWithAncestor: Default = js.native
    val changedSince: Nargs = js.native
    val ci: DefaultDescription = js.native
    val clearCache: Default = js.native
    val clearMocks: Default = js.native
    val collectCoverage: DescriptionType = js.native
    val collectCoverageFrom: Type = js.native
    val collectCoverageOnlyFrom: typingsSlinky.jestCli.anon.String = js.native
    val color: Default = js.native
    val colors: DefaultDescriptionType = js.native
    val config: AliasDescription = js.native
    val coverage: Default = js.native
    val coverageDirectory: `0` = js.native
    val coveragePathIgnorePatterns: DescriptionString = js.native
    val coverageProvider: Choices = js.native
    val coverageReporters: DescriptionString = js.native
    val coverageThreshold: Type = js.native
    val debug: DefaultUndefined = js.native
    val detectLeaks: DefaultDescriptionString = js.native
    val detectOpenHandles: DefaultDescriptionString = js.native
    val env: Type = js.native
    val errorOnDeprecated: `1` = js.native
    val expand: AliasDefault = js.native
    val filter: DefaultUndefinedDescriptionString = js.native
    val findRelatedTests: Default = js.native
    val forceExit: Default = js.native
    val globalSetup: `2` = js.native
    val globalTeardown: `3` = js.native
    val globals: Type = js.native
    val haste: `4` = js.native
    val init: `5` = js.native
    val json: Default = js.native
    val lastCommit: Default = js.native
    val listTests: DefaultDescriptionString = js.native
    val logHeapUsage: Default = js.native
    val mapCoverage: Default = js.native
    val maxConcurrency: DescriptionStringType = js.native
    val maxWorkers: AliasDescriptionType = js.native
    val moduleDirectories: DescriptionString = js.native
    val moduleFileExtensions: DescriptionString = js.native
    val moduleNameMapper: Type = js.native
    val modulePathIgnorePatterns: DescriptionString = js.native
    val modulePaths: DescriptionString = js.native
    val noStackTrace: DefaultUndefinedDescription = js.native
    val notifyMode: `6` = js.native
    @JSName("notify")
    val notify_Foptions: DefaultUndefinedDescriptionType = js.native
    val onlyChanged: AliasDefaultDescription = js.native
    val onlyFailures: AliasDefaultDescriptionType = js.native
    val outputFile: Type = js.native
    val passWithNoTests: `7` = js.native
    val preset: `8` = js.native
    val prettierPath: `9` = js.native
    val projects: DescriptionString = js.native
    val reporters: StringType = js.native
    val resetMocks: Default = js.native
    val resetModules: Default = js.native
    val resolver: `10` = js.native
    val restoreMocks: Default = js.native
    val rootDir: Type = js.native
    val roots: DescriptionString = js.native
    val runInBand: AliasDefaultUndefined = js.native
    val runTestsByPath: DefaultDescriptionString = js.native
    val runner: `11` = js.native
    val selectProjects: DescriptionString = js.native
    val setupFiles: DescriptionString = js.native
    val setupFilesAfterEnv: DescriptionString = js.native
    val showConfig: `12` = js.native
    val silent: `13` = js.native
    val skipFilter: Default = js.native
    val snapshotSerializers: DescriptionString = js.native
    val testEnvironment: `14` = js.native
    val testEnvironmentOptions: Type = js.native
    val testFailureExitCode: `15` = js.native
    val testLocationInResults: `16` = js.native
    val testMatch: `17` = js.native
    val testNamePattern: `18` = js.native
    val testPathIgnorePatterns: DescriptionString = js.native
    val testPathPattern: DescriptionString = js.native
    val testRegex: `19` = js.native
    val testResultsProcessor: Type = js.native
    val testRunner: Type = js.native
    val testSequencer: Type = js.native
    val testTimeout: `20` = js.native
    val testURL: `21` = js.native
    val timers: Type = js.native
    val transform: Type = js.native
    val transformIgnorePatterns: DescriptionString = js.native
    val unmockedModulePathPatterns: DescriptionString = js.native
    val updateSnapshot: AliasDefaultUndefinedDescriptionString = js.native
    val useStderr: `22` = js.native
    val verbose: `23` = js.native
    val version: AliasDefaultUndefinedDescription = js.native
    val watch: Default = js.native
    val watchAll: Default = js.native
    val watchPathIgnorePatterns: DescriptionString = js.native
    val watchman: Default = js.native
  }
  
}

