package typingsSlinky.angularCompiler.viewCompilerViewCompilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsSlinky.angularCompiler.compileReflectorMod.CompileReflector
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompiler")
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

