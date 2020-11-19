package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/view_compiler/view_compiler", JSImport.Namespace)
@js.native
object viewCompilerViewCompilerMod extends js.Object {
  
  def elementEventFullName(target: String, name: String): String = js.native
  def elementEventFullName(target: Null, name: String): String = js.native
  
  @js.native
  class ViewCompileResult protected () extends js.Object {
    def this(viewClassVar: String, rendererTypeVar: String) = this()
    
    var rendererTypeVar: String = js.native
    
    var viewClassVar: String = js.native
  }
  
  @js.native
  class ViewCompiler protected () extends js.Object {
    def this(_reflector: CompileReflector) = this()
    
    var _reflector: js.Any = js.native
    
    def compileComponent(
      outputCtx: OutputContext,
      component: CompileDirectiveMetadata,
      template: js.Array[TemplateAst],
      styles: Expression,
      usedPipes: js.Array[CompilePipeSummary]
    ): ViewCompileResult = js.native
  }
}
