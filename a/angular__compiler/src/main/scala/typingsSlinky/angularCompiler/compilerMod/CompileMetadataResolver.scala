package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.metadataResolverMod.ErrorCollector
import typingsSlinky.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "CompileMetadataResolver")
@js.native
class CompileMetadataResolver protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.CompileMetadataResolver {
  def this(
    _config: typingsSlinky.angularCompiler.configMod.CompilerConfig,
    _htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser,
    _ngModuleResolver: typingsSlinky.angularCompiler.ngModuleResolverMod.NgModuleResolver,
    _directiveResolver: typingsSlinky.angularCompiler.directiveResolverMod.DirectiveResolver,
    _pipeResolver: typingsSlinky.angularCompiler.pipeResolverMod.PipeResolver,
    _summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[_],
    _schemaRegistry: typingsSlinky.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typingsSlinky.angularCompiler.directiveNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbolCache,
    _reflector: typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
  ) = this()
  def this(
    _config: typingsSlinky.angularCompiler.configMod.CompilerConfig,
    _htmlParser: typingsSlinky.angularCompiler.htmlParserMod.HtmlParser,
    _ngModuleResolver: typingsSlinky.angularCompiler.ngModuleResolverMod.NgModuleResolver,
    _directiveResolver: typingsSlinky.angularCompiler.directiveResolverMod.DirectiveResolver,
    _pipeResolver: typingsSlinky.angularCompiler.pipeResolverMod.PipeResolver,
    _summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[_],
    _schemaRegistry: typingsSlinky.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typingsSlinky.angularCompiler.directiveNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbolCache,
    _reflector: typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector,
    _errorCollector: ErrorCollector
  ) = this()
}
