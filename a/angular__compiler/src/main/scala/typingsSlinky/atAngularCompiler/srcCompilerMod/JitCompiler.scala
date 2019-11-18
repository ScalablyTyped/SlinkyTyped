package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typingsSlinky.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "JitCompiler")
@js.native
class JitCompiler protected ()
  extends typingsSlinky.atAngularCompiler.srcJitCompilerMod.JitCompiler {
  def this(
    _metadataResolver: typingsSlinky.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    _templateParser: typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser,
    _styleCompiler: typingsSlinky.atAngularCompiler.srcStyleUnderscoreCompilerMod.StyleCompiler,
    _viewCompiler: typingsSlinky.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.ViewCompiler,
    _ngModuleCompiler: typingsSlinky.atAngularCompiler.srcNgUnderscoreModuleUnderscoreCompilerMod.NgModuleCompiler,
    _summaryResolver: typingsSlinky.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typingsSlinky.atAngularCompiler.srcCoreMod.Type],
    _reflector: typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector,
    _jitEvaluator: typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreJitMod.JitEvaluator,
    _compilerConfig: typingsSlinky.atAngularCompiler.srcConfigMod.CompilerConfig,
    _console: Console,
    getExtraNgModuleProviders: js.Function1[/* ngModule */ js.Any, js.Array[CompileProviderMetadata]]
  ) = this()
}

