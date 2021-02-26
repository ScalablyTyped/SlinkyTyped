package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Typeofts
import typingsSlinky.forkTsCheckerWebpackPlugin.controlledTypeScriptSystemMod.ControlledTypeScriptSystem
import typingsSlinky.forkTsCheckerWebpackPlugin.typeScriptExtensionMod.TypeScriptHostExtension
import typingsSlinky.typescript.mod.BuilderProgram
import typingsSlinky.typescript.mod.CreateProgram_
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.DiagnosticReporter
import typingsSlinky.typescript.mod.ParsedCommandLine
import typingsSlinky.typescript.mod.SolutionBuilderWithWatchHost
import typingsSlinky.typescript.mod.WatchStatusReporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlledWatchSolutionBuilderHostMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/ControlledWatchSolutionBuilderHost", "createControlledWatchSolutionBuilderHost")
  @js.native
  def createControlledWatchSolutionBuilderHost[TProgram /* <: BuilderProgram */](
    typescript: Typeofts,
    parsedCommandLine: ParsedCommandLine,
    system: ControlledTypeScriptSystem,
    createProgram: js.UndefOr[CreateProgram_[TProgram]],
    reportDiagnostic: js.UndefOr[DiagnosticReporter],
    reportWatchStatus: js.UndefOr[WatchStatusReporter],
    reportSolutionBuilderStatus: js.UndefOr[js.Function1[/* diagnostic */ Diagnostic, Unit]],
    afterProgramCreate: js.UndefOr[js.Function1[/* program */ TProgram, Unit]],
    afterProgramEmitAndDiagnostics: js.UndefOr[js.Function1[/* program */ TProgram, Unit]],
    hostExtensions: js.UndefOr[js.Array[TypeScriptHostExtension]]
  ): SolutionBuilderWithWatchHost[TProgram] = js.native
}
