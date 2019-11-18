package typingsSlinky.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typingsSlinky.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
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

