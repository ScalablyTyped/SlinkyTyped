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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerCompilerMod {
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "componentFactoryResolverProviderDef")
  @js.native
  def componentFactoryResolverProviderDef(
    reflector: CompileReflector,
    ctx: OutputContext,
    flags: NodeFlags,
    entryComponents: js.Array[CompileEntryComponentMetadata]
  ): DepsExpr = js.native
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "depDef")
  @js.native
  def depDef(ctx: OutputContext, dep: CompileDiDependencyMetadata): Expression = js.native
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "lifecycleHookToNodeFlag")
  @js.native
  def lifecycleHookToNodeFlag(lifecycleHook: LifecycleHooks): NodeFlags = js.native
  
  @JSImport("@angular/compiler/src/view_compiler/provider_compiler", "providerDef")
  @js.native
  def providerDef(ctx: OutputContext, providerAst: ProviderAst): DepsExpr = js.native
}
