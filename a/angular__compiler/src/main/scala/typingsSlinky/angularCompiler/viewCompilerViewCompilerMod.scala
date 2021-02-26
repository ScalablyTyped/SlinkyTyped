package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewCompilerViewCompilerMod {
  
  @JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompileResult")
  @js.native
  class ViewCompileResult protected () extends StObject {
    def this(viewClassVar: String, rendererTypeVar: String) = this()
    
    var rendererTypeVar: String = js.native
    
    var viewClassVar: String = js.native
  }
  
  @JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompiler")
  @js.native
  class ViewCompiler protected () extends StObject {
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
  
  @JSImport("@angular/compiler/src/view_compiler/view_compiler", "elementEventFullName")
  @js.native
  def elementEventFullName(target: String, name: String): String = js.native
  @JSImport("@angular/compiler/src/view_compiler/view_compiler", "elementEventFullName")
  @js.native
  def elementEventFullName(target: Null, name: String): String = js.native
}
