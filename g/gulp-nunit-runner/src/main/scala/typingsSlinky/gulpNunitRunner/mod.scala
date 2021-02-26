package typingsSlinky.gulpNunitRunner

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-nunit-runner", JSImport.Namespace)
  @js.native
  val ^ : NUnit = js.native
  
  @js.native
  trait ConsoleRunnerOptions extends StObject {
    
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
    implicit class ConsoleRunnerOptionsMutableBuilder[Self <: ConsoleRunnerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApartment(value: String): Self = StObject.set(x, "apartment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApartmentUndefined: Self = StObject.set(x, "apartment", js.undefined)
      
      @scala.inline
      def setBasepath(value: String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasepathUndefined: Self = StObject.set(x, "basepath", js.undefined)
      
      @scala.inline
      def setCleanup(value: Boolean): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def `setDispose-runners`(value: Boolean): Self = StObject.set(x, "dispose-runners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDispose-runnersUndefined`: Self = StObject.set(x, "dispose-runners", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExplore(value: String): Self = StObject.set(x, "explore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExploreUndefined: Self = StObject.set(x, "explore", js.undefined)
      
      @scala.inline
      def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setNocolor(value: Boolean): Self = StObject.set(x, "nocolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocolorUndefined: Self = StObject.set(x, "nocolor", js.undefined)
      
      @scala.inline
      def setNodots(value: Boolean): Self = StObject.set(x, "nodots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodotsUndefined: Self = StObject.set(x, "nodots", js.undefined)
      
      @scala.inline
      def setNoheader(value: Boolean): Self = StObject.set(x, "noheader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoheaderUndefined: Self = StObject.set(x, "noheader", js.undefined)
      
      @scala.inline
      def setNologo(value: Boolean): Self = StObject.set(x, "nologo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNologoUndefined: Self = StObject.set(x, "nologo", js.undefined)
      
      @scala.inline
      def setNoresult(value: Boolean): Self = StObject.set(x, "noresult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoresultUndefined: Self = StObject.set(x, "noresult", js.undefined)
      
      @scala.inline
      def setNoshadow(value: Boolean): Self = StObject.set(x, "noshadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoshadowUndefined: Self = StObject.set(x, "noshadow", js.undefined)
      
      @scala.inline
      def setNothread(value: Boolean): Self = StObject.set(x, "nothread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNothreadUndefined: Self = StObject.set(x, "nothread", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPrivatebinpath(value: js.Array[String]): Self = StObject.set(x, "privatebinpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivatebinpathUndefined: Self = StObject.set(x, "privatebinpath", js.undefined)
      
      @scala.inline
      def setPrivatebinpathVarargs(value: String*): Self = StObject.set(x, "privatebinpath", js.Array(value :_*))
      
      @scala.inline
      def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setRun(value: js.Array[String]): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      @scala.inline
      def setRunVarargs(value: String*): Self = StObject.set(x, "run", js.Array(value :_*))
      
      @scala.inline
      def setRunlist(value: String): Self = StObject.set(x, "runlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunlistUndefined: Self = StObject.set(x, "runlist", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setShadowcopy(value: Boolean): Self = StObject.set(x, "shadowcopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowcopyUndefined: Self = StObject.set(x, "shadowcopy", js.undefined)
      
      @scala.inline
      def setStoponerror(value: Boolean): Self = StObject.set(x, "stoponerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoponerrorUndefined: Self = StObject.set(x, "stoponerror", js.undefined)
      
      @scala.inline
      def setTeamcity(value: Boolean): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamcityUndefined: Self = StObject.set(x, "teamcity", js.undefined)
      
      @scala.inline
      def setTest(value: js.Array[String]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: String*): Self = StObject.set(x, "test", js.Array(value :_*))
      
      @scala.inline
      def setTestist(value: String): Self = StObject.set(x, "testist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestistUndefined: Self = StObject.set(x, "testist", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
      
      @scala.inline
      def setWork(value: String): Self = StObject.set(x, "work", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkUndefined: Self = StObject.set(x, "work", js.undefined)
      
      @scala.inline
      def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
      
      @scala.inline
      def setX86(value: Boolean): Self = StObject.set(x, "x86", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX86Undefined: Self = StObject.set(x, "x86", js.undefined)
    }
  }
  
  type NUnit = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  @js.native
  trait Options extends StObject {
    
    // The NUnit bin folder or the full path of the console runner.
    // If not specified the NUnit bin folder must be in the `PATH`.
    var executable: js.UndefOr[String] = js.native
    
    // true|false
    // The options below map directly to the NUnit console runner. See here
    // for more info: http://www.nunit.org/index.php?p=consoleCommandLine&r=2.6.3
    var options: js.UndefOr[ConsoleRunnerOptions] = js.native
    
    // 'c:/Program Files/NUnit/bin'
    // [2.x] If the full path of the console runner is not specified this determines
    // what version of the console runner is used. Defaults to anycpu.
    // NOTE: This has been superseded by the 'x86' option below in 3.x.
    // http://www.nunit.org/index.php?p=nunit-console&r=2.6.3
    var platform: js.UndefOr[String] = js.native
    
    // 'anycpu|x86'
    // [2.x] Output TeamCity service messages.
    // NOTE: This has been superseded by the 'teamcity' option below in 3.x.
    // https://confluence.jetbrains.com/display/TCD8/Build+Script+Interaction+with+TeamCity
    var teamcity: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutable(value: String): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
      
      @scala.inline
      def setOptions(value: ConsoleRunnerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setTeamcity(value: Boolean): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamcityUndefined: Self = StObject.set(x, "teamcity", js.undefined)
    }
  }
  
  type _To = NUnit
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NUnit = ^
}
