package typingsSlinky.jestUtil

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Window
import typingsSlinky.callsites.mod.CallSite
import typingsSlinky.jestConsole.mod.CustomConsole
import typingsSlinky.jestConsole.typesMod.LogEntry
import typingsSlinky.jestFakeTimers.anon.Config
import typingsSlinky.jestFakeTimers.mod.JestFakeTimers
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.CodeCoverageFormatter
import typingsSlinky.jestTestResult.typesMod.CodeCoverageReporter
import typingsSlinky.jestTestResult.typesMod.FormattedTestResults
import typingsSlinky.jestTypes.configMod.ConfigGlobals
import typingsSlinky.jestTypes.configMod.Glob
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestUtil.anon.FnCall
import typingsSlinky.jestUtil.anon.FnCallResultsCodeCoverageFormatterReporter
import typingsSlinky.jestUtil.anon.FnCallValueOptionsCycles
import typingsSlinky.jestUtil.anon.TypeofBufferedConsole
import typingsSlinky.jestUtil.anon.TypeofpreRunMessage
import typingsSlinky.jestUtil.anon.TypeofspecialChars
import typingsSlinky.jestUtil.deepCyclicCopyMod.DeepCyclicCopyOptions
import typingsSlinky.jestUtil.errorWithStackMod.default
import typingsSlinky.node.NodeJS.Global
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.std.Record
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Console protected () extends CustomConsole {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
  }
  
  @js.native
  class ErrorWithStack protected () extends default {
    def this(message: js.UndefOr[String], callsite: js.Function) = this()
  }
  
  @js.native
  class FakeTimers[TimerRef] protected () extends JestFakeTimers[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ _]) = this()
  }
  
  @js.native
  class NullConsole ()
    extends typingsSlinky.jestConsole.mod.NullConsole
  
  var BufferedConsole: TypeofBufferedConsole = js.native
  @JSName("convertDescriptorToString")
  var convertDescriptorToString_Original: FnCall = js.native
  @JSName("createDirectory")
  var createDirectory_Original: js.Function1[/* path */ Path, Unit] = js.native
  @JSName("deepCyclicCopy")
  var deepCyclicCopy_Original: FnCallValueOptionsCycles = js.native
  @JSName("formatTestResults")
  var formatTestResults_Original: FnCallResultsCodeCoverageFormatterReporter = js.native
  @JSName("getFailedSnapshotTests")
  var getFailedSnapshotTests_Original: js.Function1[/* testResults */ AggregatedResult, js.Array[String]] = js.native
  @JSName("installCommonGlobals")
  var installCommonGlobals_Original: js.Function2[/* globalObject */ Global, /* globals */ ConfigGlobals, Global with ConfigGlobals] = js.native
  @JSName("interopRequireDefault")
  var interopRequireDefault_Original: js.Function1[/* obj */ js.Any, _] = js.native
  var isInteractive: Boolean = js.native
  @JSName("pluralize")
  var pluralize_Original: js.Function2[/* word */ String, /* count */ Double, String] = js.native
  var preRunMessage: TypeofpreRunMessage = js.native
  @JSName("replacePathSepForGlob")
  var replacePathSepForGlob_Original: js.Function1[/* path */ Path, Glob] = js.native
  var specialChars: TypeofspecialChars = js.native
  def clearLine(stream: WritableStream): Unit = js.native
  def convertDescriptorToString(): js.UndefOr[String] = js.native
  def convertDescriptorToString(descriptor: String): String = js.native
  def convertDescriptorToString(descriptor: js.Function): js.Function | String = js.native
  def convertDescriptorToString(descriptor: Double): Double | String = js.native
  def createDirectory(path: Path): Unit = js.native
  def deepCyclicCopy[T](value: T): T = js.native
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def getCallsite(level: Double): CallSite = js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
  def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
  def getFailedSnapshotTests(testResults: AggregatedResult): js.Array[String] = js.native
  def installCommonGlobals(globalObject: Global, globals: ConfigGlobals): Global with ConfigGlobals = js.native
  def interopRequireDefault(obj: js.Any): js.Any = js.native
  def isPromise(candidate: js.Any): /* is std.Promise<unknown> */ Boolean = js.native
  def pluralize(word: String, count: Double): String = js.native
  def replacePathSepForGlob(path: Path): Glob = js.native
  def setGlobal(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  def setGlobal(globalToMutate: Window, key: String, value: js.Any): Unit = js.native
  def testPathPatternToRegExp(testPathPattern: String): js.RegExp = js.native
  @js.native
  object Console extends TopLevel[
          Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, CustomConsole]
        ]
  
  @js.native
  object ErrorWithStack
    extends TopLevel[
          Instantiable2[js.UndefOr[/* message */ String], /* callsite */ js.Function, default]
        ]
  
  @js.native
  object FakeTimers
    extends TopLevel[
          Instantiable1[
            /* hasGlobalModuleMockerTimerConfigConfigMaxLoops */ Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ js.Any], 
            JestFakeTimers[js.Object]
          ]
        ]
  
  @js.native
  object NullConsole
    extends TopLevel[Instantiable0[typingsSlinky.jestConsole.mod.NullConsole]]
  
}

