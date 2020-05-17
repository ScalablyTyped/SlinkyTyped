package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.DepsExpr
import typingsSlinky.angularCompiler.compileMetadataMod.CompileDiDependencyMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.coreMod.NodeFlags
import typingsSlinky.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import typingsSlinky.angularCompiler.templateAstMod.ProviderAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/provider_compiler", JSImport.Namespace)
@js.native
object providerCompilerMod extends js.Object {
  def componentFactoryResolverProviderDef(
    reflector: CompileReflector,
    ctx: OutputContext,
    flags: NodeFlags,
    entryComponents: js.Array[CompileEntryComponentMetadata]
  ): DepsExpr = js.native
  def depDef(ctx: OutputContext, dep: CompileDiDependencyMetadata): Expression = js.native
  def lifecycleHookToNodeFlag(lifecycleHook: LifecycleHooks): NodeFlags = js.native
  def providerDef(ctx: OutputContext, providerAst: ProviderAst): DepsExpr = js.native
}

