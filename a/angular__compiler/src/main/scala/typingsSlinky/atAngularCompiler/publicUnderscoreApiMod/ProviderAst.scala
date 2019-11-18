package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTokenMetadata
import typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ProviderAst")
@js.native
class ProviderAst protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.ProviderAst {
  def this(
    token: CompileTokenMetadata,
    multiProvider: Boolean,
    eager: Boolean,
    providers: js.Array[CompileProviderMetadata],
    providerType: typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType,
    lifecycleHooks: js.Array[LifecycleHooks],
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    isModule: Boolean
  ) = this()
}

