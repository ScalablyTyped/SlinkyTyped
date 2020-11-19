package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTokenMetadata
import typingsSlinky.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ProviderAst")
@js.native
class ProviderAst protected ()
  extends typingsSlinky.angularCompiler.templateAstMod.ProviderAst {
  def this(
    token: CompileTokenMetadata,
    multiProvider: Boolean,
    eager: Boolean,
    providers: js.Array[CompileProviderMetadata],
    providerType: typingsSlinky.angularCompiler.templateAstMod.ProviderAstType,
    lifecycleHooks: js.Array[LifecycleHooks],
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    isModule: Boolean
  ) = this()
}
