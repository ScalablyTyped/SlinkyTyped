package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPipes extends js.Object {
  var pipes: js.Array[CompilePipeSummary]
  var template: js.Array[TemplateAst]
}

object AnonPipes {
  @scala.inline
  def apply(pipes: js.Array[CompilePipeSummary], template: js.Array[TemplateAst]): AnonPipes = {
    val __obj = js.Dynamic.literal(pipes = pipes.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPipes]
  }
}

