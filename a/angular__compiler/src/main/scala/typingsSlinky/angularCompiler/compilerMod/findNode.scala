package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.mlParserAstMod.HtmlAstPath
import typingsSlinky.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "findNode")
@js.native
object findNode extends js.Object {
  def apply(nodes: js.Array[Node], position: Double): HtmlAstPath = js.native
}

