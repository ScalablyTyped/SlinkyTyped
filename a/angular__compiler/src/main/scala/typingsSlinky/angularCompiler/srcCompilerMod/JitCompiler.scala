package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsSlinky.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "JitCompiler")
@js.native
class JitCompiler protected ()
  extends typingsSlinky.angularCompiler.jitCompilerMod.JitCompiler {
  def this(
    _metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    _templateParser: typingsSlinky.angularCompiler.templateParserMod.TemplateParser,
    _styleCompiler: typingsSlinky.angularCompiler.styleCompilerMod.StyleCompiler,
    _viewCompiler: typingsSlinky.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler,
    _ngModuleCompiler: typingsSlinky.angularCompiler.ngModuleCompilerMod.NgModuleCompiler,
    _summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.coreMod.Type],
    _reflector: typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector,
    _jitEvaluator: typingsSlinky.angularCompiler.outputJitMod.JitEvaluator,
    _compilerConfig: typingsSlinky.angularCompiler.configMod.CompilerConfig,
    _console: Console,
    getExtraNgModuleProviders: js.Function1[/* ngModule */ js.Any, js.Array[CompileProviderMetadata]]
  ) = this()
}
