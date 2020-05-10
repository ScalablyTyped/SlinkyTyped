package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPipes extends js.Object {
  var pipes: js.Array[CompilePipeSummary] = js.native
  var template: js.Array[TemplateAst] = js.native
}

object AnonPipes {
  @scala.inline
  def apply(pipes: js.Array[CompilePipeSummary], template: js.Array[TemplateAst]): AnonPipes = {
    val __obj = js.Dynamic.literal(pipes = pipes.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPipes]
  }
  @scala.inline
  implicit class AnonPipesOps[Self <: AnonPipes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipes(value: js.Array[CompilePipeSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: js.Array[TemplateAst]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

