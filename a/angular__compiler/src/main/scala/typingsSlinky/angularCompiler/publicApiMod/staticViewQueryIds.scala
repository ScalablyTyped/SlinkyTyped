package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import typingsSlinky.angularCompiler.viewCompilerViewCompilerMod.StaticAndDynamicQueryIds
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "staticViewQueryIds")
@js.native
object staticViewQueryIds extends js.Object {
  def apply(nodeStaticQueryIds: Map[TemplateAst, StaticAndDynamicQueryIds]): StaticAndDynamicQueryIds = js.native
}

