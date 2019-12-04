package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDiDependencyMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsSlinky.atAngularCompiler.srcCoreMod.NodeFlags
import typingsSlinky.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
import typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAst
import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/provider_compiler", JSImport.Namespace)
@js.native
object srcViewUnderscoreCompilerProviderUnderscoreCompilerMod extends js.Object {
  def componentFactoryResolverProviderDef(
    reflector: CompileReflector,
    ctx: OutputContext,
    flags: NodeFlags,
    entryComponents: js.Array[CompileEntryComponentMetadata]
  ): Anon_DepsExpr = js.native
  def depDef(ctx: OutputContext, dep: CompileDiDependencyMetadata): Expression = js.native
  def lifecycleHookToNodeFlag(lifecycleHook: LifecycleHooks): NodeFlags = js.native
  def providerDef(ctx: OutputContext, providerAst: ProviderAst): Anon_DepsExpr = js.native
}

