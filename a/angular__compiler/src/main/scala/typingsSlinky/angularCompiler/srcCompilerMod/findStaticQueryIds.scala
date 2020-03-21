package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import typingsSlinky.angularCompiler.viewCompilerViewCompilerMod.StaticAndDynamicQueryIds
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "findStaticQueryIds")
@js.native
object findStaticQueryIds extends js.Object {
  def apply(nodes: js.Array[TemplateAst]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
  def apply(nodes: js.Array[TemplateAst], result: Map[TemplateAst, StaticAndDynamicQueryIds]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
}

