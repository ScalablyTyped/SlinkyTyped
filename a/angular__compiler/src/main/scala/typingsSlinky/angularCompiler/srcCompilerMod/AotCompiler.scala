package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.abstractEmitterMod.OutputEmitter
import typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost
import typingsSlinky.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typingsSlinky.angularCompiler.injectableCompilerMod.InjectableCompiler
import typingsSlinky.angularCompiler.typeCheckCompilerMod.TypeCheckCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "AotCompiler")
@js.native
class AotCompiler protected ()
  extends typingsSlinky.angularCompiler.aotCompilerMod.AotCompiler {
  def this(
    _config: typingsSlinky.angularCompiler.configMod.CompilerConfig,
    _options: AotCompilerOptions,
    _host: AotCompilerHost,
    reflector: typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector,
    _metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    _templateParser: typingsSlinky.angularCompiler.templateParserMod.TemplateParser,
    _styleCompiler: typingsSlinky.angularCompiler.styleCompilerMod.StyleCompiler,
    _viewCompiler: typingsSlinky.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler,
    _typeCheckCompiler: TypeCheckCompiler,
    _ngModuleCompiler: typingsSlinky.angularCompiler.ngModuleCompilerMod.NgModuleCompiler,
    _injectableCompiler: InjectableCompiler,
    _outputEmitter: OutputEmitter,
    _summaryResolver: typingsSlinky.angularCompiler.srcSummaryResolverMod.SummaryResolver[typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol],
    _symbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
}
