package typingsSlinky.jestUtil

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Window
import typingsSlinky.callsites.mod.CallSite
import typingsSlinky.jestConsole.mod.CustomConsole
import typingsSlinky.jestConsole.typesMod.LogEntry
import typingsSlinky.jestFakeTimers.anon.Config
import typingsSlinky.jestFakeTimers.mod.JestFakeTimers
import typingsSlinky.jestSourceMap.typesMod.SourceMapRegistry
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "BufferedConsole")
  @js.native
  class BufferedConsole protected ()
    extends typingsSlinky.jestConsole.mod.BufferedConsole {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  @JSImport("jest-util", "BufferedConsole")
  @js.native
  def BufferedConsole: TypeofBufferedConsole = js.native
  @scala.inline
  def BufferedConsole_=(x: TypeofBufferedConsole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BufferedConsole")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "Console")
  @js.native
  class Console protected () extends CustomConsole {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
  }
  @JSImport("jest-util", "Console")
  @js.native
  def Console: Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, CustomConsole] = js.native
  @scala.inline
  def Console_=(x: Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, CustomConsole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Console")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "ErrorWithStack")
  @js.native
  class ErrorWithStack protected () extends default {
    def this(message: js.UndefOr[scala.Nothing], callsite: js.Function) = this()
    def this(message: String, callsite: js.Function) = this()
  }
  @JSImport("jest-util", "ErrorWithStack")
  @js.native
  def ErrorWithStack: Instantiable2[/* message */ js.UndefOr[String], /* callsite */ js.Function, default] = js.native
  @scala.inline
  def ErrorWithStack_=(x: Instantiable2[/* message */ js.UndefOr[String], /* callsite */ js.Function, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ErrorWithStack")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "FakeTimers")
  @js.native
  class FakeTimers[TimerRef] protected () extends JestFakeTimers[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ _]) = this()
  }
  @JSImport("jest-util", "FakeTimers")
  @js.native
  def FakeTimers: Instantiable1[
    /* hasGlobalModuleMockerTimerConfigConfigMaxLoops */ Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ js.Any], 
    JestFakeTimers[js.Object]
  ] = js.native
  @scala.inline
  def FakeTimers_=(
    x: Instantiable1[
      /* hasGlobalModuleMockerTimerConfigConfigMaxLoops */ Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ js.Any], 
      JestFakeTimers[js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FakeTimers")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "NullConsole")
  @js.native
  class NullConsole ()
    extends typingsSlinky.jestConsole.mod.NullConsole
  @JSImport("jest-util", "NullConsole")
  @js.native
  def NullConsole: Instantiable0[typingsSlinky.jestConsole.mod.NullConsole] = js.native
  @scala.inline
  def NullConsole_=(x: Instantiable0[typingsSlinky.jestConsole.mod.NullConsole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullConsole")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "clearLine")
  @js.native
  def clearLine(stream: WritableStream): Unit = js.native
  
  @JSImport("jest-util", "convertDescriptorToString")
  @js.native
  def convertDescriptorToString: FnCall = js.native
  @JSImport("jest-util", "convertDescriptorToString")
  @js.native
  def convertDescriptorToString(descriptor: js.UndefOr[scala.Nothing]): js.UndefOr[String] = js.native
  @JSImport("jest-util", "convertDescriptorToString")
  @js.native
  def convertDescriptorToString(descriptor: String): String = js.native
  @JSImport("jest-util", "convertDescriptorToString")
  @js.native
  def convertDescriptorToString(descriptor: js.Function): js.Function | String = js.native
  @JSImport("jest-util", "convertDescriptorToString")
  @js.native
  def convertDescriptorToString(descriptor: Double): Double | String = js.native
  @scala.inline
  def convertDescriptorToString_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertDescriptorToString")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "createDirectory")
  @js.native
  def createDirectory: js.Function1[/* path */ Path, Unit] = js.native
  @JSImport("jest-util", "createDirectory")
  @js.native
  def createDirectory(path: Path): Unit = js.native
  @scala.inline
  def createDirectory_=(x: js.Function1[/* path */ Path, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDirectory")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "deepCyclicCopy")
  @js.native
  def deepCyclicCopy: FnCallValueOptionsCycles = js.native
  @JSImport("jest-util", "deepCyclicCopy")
  @js.native
  def deepCyclicCopy[T](value: T): T = js.native
  @JSImport("jest-util", "deepCyclicCopy")
  @js.native
  def deepCyclicCopy[T](value: T, options: js.UndefOr[scala.Nothing], cycles: WeakMap[_, _]): T = js.native
  @JSImport("jest-util", "deepCyclicCopy")
  @js.native
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  @JSImport("jest-util", "deepCyclicCopy")
  @js.native
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
  @scala.inline
  def deepCyclicCopy_=(x: FnCallValueOptionsCycles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepCyclicCopy")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "formatTestResults")
  @js.native
  def formatTestResults: FnCallResultsCodeCoverageFormatterReporter = js.native
  @JSImport("jest-util", "formatTestResults")
  @js.native
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  @JSImport("jest-util", "formatTestResults")
  @js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: js.UndefOr[scala.Nothing],
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  @JSImport("jest-util", "formatTestResults")
  @js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  @JSImport("jest-util", "formatTestResults")
  @js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  @scala.inline
  def formatTestResults_=(x: FnCallResultsCodeCoverageFormatterReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatTestResults")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "getCallsite")
  @js.native
  def getCallsite(level: Double): CallSite = js.native
  @JSImport("jest-util", "getCallsite")
  @js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
  
  @JSImport("jest-util", "getConsoleOutput")
  @js.native
  def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
  
  @JSImport("jest-util", "getFailedSnapshotTests")
  @js.native
  def getFailedSnapshotTests: js.Function1[/* testResults */ AggregatedResult, js.Array[String]] = js.native
  @JSImport("jest-util", "getFailedSnapshotTests")
  @js.native
  def getFailedSnapshotTests(testResults: AggregatedResult): js.Array[String] = js.native
  @scala.inline
  def getFailedSnapshotTests_=(x: js.Function1[/* testResults */ AggregatedResult, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFailedSnapshotTests")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "installCommonGlobals")
  @js.native
  def installCommonGlobals: js.Function2[/* globalObject */ Global, /* globals */ ConfigGlobals, Global with ConfigGlobals] = js.native
  @JSImport("jest-util", "installCommonGlobals")
  @js.native
  def installCommonGlobals(globalObject: Global, globals: ConfigGlobals): Global with ConfigGlobals = js.native
  @scala.inline
  def installCommonGlobals_=(x: js.Function2[/* globalObject */ Global, /* globals */ ConfigGlobals, Global with ConfigGlobals]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installCommonGlobals")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "interopRequireDefault")
  @js.native
  def interopRequireDefault: js.Function1[/* obj */ js.Any, js.Any] = js.native
  @JSImport("jest-util", "interopRequireDefault")
  @js.native
  def interopRequireDefault(obj: js.Any): js.Any = js.native
  @scala.inline
  def interopRequireDefault_=(x: js.Function1[/* obj */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interopRequireDefault")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "isInteractive")
  @js.native
  def isInteractive: Boolean = js.native
  @scala.inline
  def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "isPromise")
  @js.native
  def isPromise(candidate: js.Any): /* is std.Promise<unknown> */ Boolean = js.native
  
  @JSImport("jest-util", "pluralize")
  @js.native
  def pluralize: js.Function2[/* word */ String, /* count */ Double, String] = js.native
  @JSImport("jest-util", "pluralize")
  @js.native
  def pluralize(word: String, count: Double): String = js.native
  @scala.inline
  def pluralize_=(x: js.Function2[/* word */ String, /* count */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluralize")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "preRunMessage")
  @js.native
  def preRunMessage: TypeofpreRunMessage = js.native
  @scala.inline
  def preRunMessage_=(x: TypeofpreRunMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preRunMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "replacePathSepForGlob")
  @js.native
  def replacePathSepForGlob: js.Function1[/* path */ Path, Glob] = js.native
  @JSImport("jest-util", "replacePathSepForGlob")
  @js.native
  def replacePathSepForGlob(path: Path): Glob = js.native
  @scala.inline
  def replacePathSepForGlob_=(x: js.Function1[/* path */ Path, Glob]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replacePathSepForGlob")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "setGlobal")
  @js.native
  def setGlobal(globalToMutate: Window, key: String, value: js.Any): Unit = js.native
  @JSImport("jest-util", "setGlobal")
  @js.native
  def setGlobal(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  
  @JSImport("jest-util", "specialChars")
  @js.native
  def specialChars: TypeofspecialChars = js.native
  @scala.inline
  def specialChars_=(x: TypeofspecialChars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specialChars")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "testPathPatternToRegExp")
  @js.native
  def testPathPatternToRegExp(testPathPattern: String): js.RegExp = js.native
}
