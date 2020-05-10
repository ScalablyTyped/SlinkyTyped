package typingsSlinky.gulpNunitRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleRunnerOptions extends js.Object {
   // true|false,
  // [2.x] Apartment for running tests (Default is MTA).
  var apartment: js.UndefOr[String] = js.native
   // true|false,
  // [2.x] Base path to be used when loading the assemblies.
  var basepath: js.UndefOr[String] = js.native
   // ['lib', 'bin'],
  // [2.x] Erase any leftover cache files and exit.
  var cleanup: js.UndefOr[Boolean] = js.native
   // ['Database', 'Network'],
  // Project configuration (e.g.: Debug) to load.
  var config: js.UndefOr[String] = js.native
   // true|false,
  // [3.x] Dispose each test runner after it has finished running its tests.
  var `dispose-runners`: js.UndefOr[Boolean] = js.native
   // 'Single|Separate|Multiple',
  // AppDomain Usage for tests.
  var domain: js.UndefOr[String] = js.native
   // 'TestOutput.txt',
  // File to receive test error output.
  var err: js.UndefOr[String] = js.native
   // ['BaseLine', 'Unit'],
  // List of categories to exclude.
  var exclude: js.UndefOr[js.Array[String]] = js.native
   // 'TestResult.xml',
  // [3.x] Save test info rather than running tests. Name of output file.
  var explore: js.UndefOr[String] = js.native
   // 'None|Single|Multiple',
  // Framework version to be used for tests.
  var framework: js.UndefOr[String] = js.native
   // 'TestsToRun.txt',
  // List of categories to include.
  var include: js.UndefOr[js.Array[String]] = js.native
   // true|false,
  // Label each test in stdOut.
  var labels: js.UndefOr[Boolean] = js.native
   // true|false,
  // [3.x] Displays console output without color.
  var nocolor: js.UndefOr[Boolean] = js.native
   // true|false,
  // [2.x] Do not display progress.
  var nodots: js.UndefOr[Boolean] = js.native
   // true|false,
  // [3.x] Suppress display of program information at start of run.
  var noheader: js.UndefOr[Boolean] = js.native
   // true|false,
  // [2.x] Do not display the logo.
  var nologo: js.UndefOr[Boolean] = js.native
   // 'TestInfo.xml',
  // Suppress XML result output.
  var noresult: js.UndefOr[Boolean] = js.native
   // true|false,
  // [2.x] Disable shadow copy when running in separate domain.
  // NOTE In 3.x, The console runner now disables shadow copy by
  // default. use new 'shadowcopy' option in 3.x to turn it on.
  var noshadow: js.UndefOr[Boolean] = js.native
   // 'MTA|STA',
  // [2.x] Disable use of a separate thread for tests.
  var nothread: js.UndefOr[Boolean] = js.native
   // 'BuildArtifacts',
  // File to receive test output.
  var output: js.UndefOr[String] = js.native
   // true|false,
  // [3.x] Pause before run to allow debugging.
  var pause: js.UndefOr[Boolean] = js.native
   // 'src',
  // [2.x] Additional directories to be probed when loading assemblies.
  var privatebinpath: js.UndefOr[js.Array[String]] = js.native
   // 'Debug',
  // Process model for tests.
  var process: js.UndefOr[String] = js.native
   // 'TestErrors.txt',
  // Name of XML result file (Default: TestResult.xml)
  var result: js.UndefOr[String] = js.native
   // 'TestsToRun.txt',
  // [2.x] Name of the test case(s), fixture(s) or namespace(s) to run.
  // NOTE: This has been superseded by the 'test' option above in 3.x.
  var run: js.UndefOr[js.Array[String]] = js.native
   // ['TestSuite.Unit', 'TestSuite.Integration'],
  // [2.x] Name of a file containing a list of the tests to run, one per line.
  // NOTE: This has been superseded by the 'testlist' option above in 3.x.
  var runlist: js.UndefOr[String] = js.native
   // 1000,
  // [3.x] Random seed used to generate test cases.
  var seed: js.UndefOr[Double] = js.native
   // 'Off|Error|Warning|Info|Verbose',
  // [3.x] Tells .NET to copy loaded assemblies to the shadowcopy directory.
  var shadowcopy: js.UndefOr[Boolean] = js.native
   // 5,
  // Stop after the first test failure or error.
  var stoponerror: js.UndefOr[Boolean] = js.native
   // true|false,
  // [3.x] Turns on use of TeamCity service messages.
  var teamcity: js.UndefOr[Boolean] = js.native
  // [3.x] Name of the test case(s), fixture(s) or namespace(s) to run.
  var test: js.UndefOr[js.Array[String]] = js.native
   // ['TestSuite.Unit', 'TestSuite.Integration'],
  // [3.x] Name of a file containing a list of the tests to run, one per line.
  var testist: js.UndefOr[String] = js.native
   // true|false,
  // Timeout for each test case in milliseconds.
  var timeout: js.UndefOr[Double] = js.native
   // true|false,
  // Set internal trace level.
  var trace: js.UndefOr[String] = js.native
   // true|false,
  // [3.x] Display additional information as the test runs.
  var verbose: js.UndefOr[Boolean] = js.native
   // true|false,
  // Wait for input before closing console window.
  @JSName("wait")
  var wait_FConsoleRunnerOptions: js.UndefOr[Boolean] = js.native
   // true|false,
  // Work directory for output files.
  var work: js.UndefOr[String] = js.native
   // 5150,
  // [3.x] Number of worker threads to be used in running tests.
  var workers: js.UndefOr[Double] = js.native
   // 'net-1.1',
  // [3.x] Run tests in a 32-bit process on 64-bit systems.
  var x86: js.UndefOr[Boolean] = js.native
}

object ConsoleRunnerOptions {
  @scala.inline
  def apply(): ConsoleRunnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleRunnerOptions]
  }
  @scala.inline
  implicit class ConsoleRunnerOptionsOps[Self <: ConsoleRunnerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apartment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apartment")(js.undefined)
        ret
    }
    @scala.inline
    def withBasepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasepath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basepath")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def `withDispose-runners`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose-runners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDispose-runners`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose-runners")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withErr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExplore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explore")(js.undefined)
        ret
    }
    @scala.inline
    def withFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withNocolor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocolor")(js.undefined)
        ret
    }
    @scala.inline
    def withNodots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodots")(js.undefined)
        ret
    }
    @scala.inline
    def withNoheader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noheader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoheader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noheader")(js.undefined)
        ret
    }
    @scala.inline
    def withNologo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nologo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNologo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nologo")(js.undefined)
        ret
    }
    @scala.inline
    def withNoresult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noresult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoresult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noresult")(js.undefined)
        ret
    }
    @scala.inline
    def withNoshadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noshadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoshadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noshadow")(js.undefined)
        ret
    }
    @scala.inline
    def withNothread(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNothread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothread")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
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
    def withPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivatebinpath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privatebinpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivatebinpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privatebinpath")(js.undefined)
        ret
    }
    @scala.inline
    def withProcess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
    @scala.inline
    def withRunlist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runlist")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Double): Self = {
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
    def withShadowcopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowcopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowcopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowcopy")(js.undefined)
        ret
    }
    @scala.inline
    def withStoponerror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoponerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoponerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoponerror")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamcity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamcity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamcity")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withTestist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testist")(js.undefined)
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
    def withTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
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
    def withWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
    @scala.inline
    def withWork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(js.undefined)
        ret
    }
    @scala.inline
    def withX86(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x86")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX86: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x86")(js.undefined)
        ret
    }
  }
  
}

