package typingsSlinky.eslintPluginReact.mod._Global_

import typingsSlinky.eslint.mod.SourceCode
import typingsSlinky.eslint.mod.SourceCode.CursorWithCountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends SourceCode {
  def getFirstTokens(node: ASTNode): js.Array[typingsSlinky.eslint.mod.AST.Token] = js.native
  def getFirstTokens(node: ASTNode, options: CursorWithCountOptions): js.Array[typingsSlinky.eslint.mod.AST.Token] = js.native
}

