package typingsSlinky.hapiLab.mod.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cli extends js.Object {
  /**
    * Specifies an assertion library module path to require and make available under Lab.assertions as well as use for enhanced reporting.
    */
  val assert: js.UndefOr[String] = js.native
  /**
    * Forces the process to exist with a non zero exit code on the first test failure.
    * 
    * @default false
    */
  val bail: js.UndefOr[Boolean] = js.native
  /**
    * Enables color output.
    * 
    * @default terminal capabilities.
    */
  val colors: js.UndefOr[Boolean] = js.native
  /**
    * Sets a timeout value for before, after, beforeEach, afterEach in milliseconds.
    * 
    * @default 0
    */
  val `context-timeout`: js.UndefOr[Double] = js.native
  /**
    * Enable code coverage analysis
    * 
    * @default false
    */
  val coverage: js.UndefOr[Boolean] = js.native
  /**
    * Includes all files in coveragePath in report.
    * 
    * @default false
    */
  val `coverage-all`: js.UndefOr[Boolean] = js.native
  /**
    * Set code coverage excludes (an array of path strings).
    */
  val `coverage-exclude`: js.UndefOr[js.Array[String]] = js.native
  /**
    * Prevents recursive inclusion of all files in coveragePath in report.
    * 
    * @default false
    */
  val `coverage-flat`: js.UndefOr[Boolean] = js.native
  /**
    * Enables coverage on external modules.
    */
  val `coverage-module`: js.UndefOr[js.Array[String]] = js.native
  /**
    * Sets code coverage path.
    */
  val `coverage-path`: js.UndefOr[String] = js.native
  /**
    * File pattern to use for locating files for coverage.
    */
  val coveragePattern: js.UndefOr[js.RegExp] = js.native
  /**
    * Minimum plan threshold to apply to all tests that don't define any plan.
    */
  val `default-plan-threshold`: js.UndefOr[Double] = js.native
  /**
    * Skip all tests (dry run).
    * 
    * @default: false
    */
  val dry: js.UndefOr[Boolean] = js.native
  /**
    * Value to set NODE_ENV before tests.
    * 
    * @default: 'test'
    */
  val environment: js.UndefOr[String] = js.native
  /**
    * Prevent recursive collection of tests within the provided path.
    * 
    * @default false
    */
  val flat: js.UndefOr[Boolean] = js.native
  /**
    * Sets a list of globals to ignore for the leak detection (comma separated).
    */
  val globals: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only run tests matching the given pattern which is internally compiled to a RegExp.
    */
  val grep: js.UndefOr[String] = js.native
  /**
    * Range of test ids to execute.
    */
  val id: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Sets lab to start with the node.js native debugger.
    * 
    * @default false
    */
  val inspect: js.UndefOr[Boolean] = js.native
  /**
    * Sets global variable leaks detection.
    * 
    * @default true
    */
  val leaks: js.UndefOr[Boolean] = js.native
  /**
    * Enables code lint.
    * 
    * @default false
    */
  val lint: js.UndefOr[Boolean] = js.native
  /**
    * Linter errors threshold in absolute value.
    * 
    * @default 0
    */
  val `lint-errors-threshold`: Double = js.native
  /**
    * Apply any fixes from the linter.
    * 
    * @default false
    */
  val `lint-fix`: js.UndefOr[Boolean] = js.native
  /**
    * Options to pass to linting program. It must be a string that is JSON.parse(able).
    */
  val `lint-options`: js.UndefOr[String] = js.native
  /**
    * Linter warnings threshold in absolute value.
    * 
    * @default 0
    */
  val `lint-warnings-threshold`: Double = js.native
  /**
    * Linter path.
    * 
    * @default 'eslint'
    */
  val linter: js.UndefOr[String] = js.native
  /**
    * File path to write test results. When set to an array, the array size must match the reporter option array.
    * 
    * @default stdout
    */
  val output: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * File paths to load tests from.
    * 
    * @default ['test']
    */
  val path: js.UndefOr[js.Array[String]] = js.native
  /**
    * File pattern to use for locating tests (must include file extensions).
    */
  val pattern: js.UndefOr[js.RegExp] = js.native
  /**
    * Sets output verbosity (0: none, 1: normal, 2: verbose).
    *
    * @default 1
    */
  val progress: js.UndefOr[Double] = js.native
  /**
    * Reporter type. One of: 'console', 'html', 'json', 'tap', 'lcov', 'clover', 'junit'.
    * 
    * @default 'console'
    */
  val reporter: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Number of times to retry failing tests (marked explicitly for retry).
    * 
    * @default 5
    */
  val retries: js.UndefOr[Double] = js.native
  /**
    * Random number seed when shuffle is enabled.
    */
  val seed: js.UndefOr[String] = js.native
  /**
    * Shuffle script execution order.
    * 
    * @default false
    */
  val shuffle: Boolean = js.native
  /**
    * Silence skipped tests.
    *
    * @default false
    */
  val `silent-skips`: js.UndefOr[Boolean] = js.native
  /**
    * Enable support for sourcemaps.
    *
    * @default false
    */
  val sourcemaps: js.UndefOr[Boolean] = js.native
  /**
    * Code coverage threshold percentage.
    */
  val threshold: js.UndefOr[Double] = js.native
  /**
    * Timeout for each test in milliseconds.
    * 
    * @default 2000
    */
  val timeout: js.UndefOr[Double] = js.native
  /**
    * Transformers for non-js file types.
    */
  val transform: js.UndefOr[js.Array[Transformer]] = js.native
  /**
    * Test types definitions.
    *
    * @default false
    */
  val types: js.UndefOr[Boolean] = js.native
  /**
    * Location of types definitions test file.
    */
  val `types-test`: js.UndefOr[String] = js.native
}

object Cli {
  @scala.inline
  def apply(`lint-errors-threshold`: Double, `lint-warnings-threshold`: Double, shuffle: Boolean): Cli = {
    val __obj = js.Dynamic.literal(shuffle = shuffle.asInstanceOf[js.Any])
    __obj.updateDynamic("lint-errors-threshold")(`lint-errors-threshold`.asInstanceOf[js.Any])
    __obj.updateDynamic("lint-warnings-threshold")(`lint-warnings-threshold`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cli]
  }
  @scala.inline
  implicit class CliOps[Self <: Cli] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLint-errors-threshold`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint-errors-threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLint-warnings-threshold`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint-warnings-threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShuffle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.undefined)
        ret
    }
    @scala.inline
    def withBail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def `withContext-timeout`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context-timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContext-timeout`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context-timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(js.undefined)
        ret
    }
    @scala.inline
    def `withCoverage-all`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCoverage-all`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-all")(js.undefined)
        ret
    }
    @scala.inline
    def `withCoverage-exclude`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCoverage-exclude`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-exclude")(js.undefined)
        ret
    }
    @scala.inline
    def `withCoverage-flat`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCoverage-flat`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-flat")(js.undefined)
        ret
    }
    @scala.inline
    def `withCoverage-module`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCoverage-module`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-module")(js.undefined)
        ret
    }
    @scala.inline
    def `withCoverage-path`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCoverage-path`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage-path")(js.undefined)
        ret
    }
    @scala.inline
    def withCoveragePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coveragePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoveragePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coveragePattern")(js.undefined)
        ret
    }
    @scala.inline
    def `withDefault-plan-threshold`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default-plan-threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDefault-plan-threshold`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default-plan-threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dry")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFlat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withGrep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInspect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaks")(js.undefined)
        ret
    }
    @scala.inline
    def withLint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(js.undefined)
        ret
    }
    @scala.inline
    def `withLint-fix`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint-fix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLint-fix`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint-fix")(js.undefined)
        ret
    }
    @scala.inline
    def `withLint-options`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint-options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLint-options`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint-options")(js.undefined)
        ret
    }
    @scala.inline
    def withLinter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linter")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def `withSilent-skips`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent-skips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSilent-skips`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent-skips")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[Transformer]): Self = {
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
    def withTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def `withTypes-test`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types-test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTypes-test`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types-test")(js.undefined)
        ret
    }
  }
  
}

