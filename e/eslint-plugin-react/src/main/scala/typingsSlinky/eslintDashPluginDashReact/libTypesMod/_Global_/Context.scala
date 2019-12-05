package typingsSlinky.eslintDashPluginDashReact.libTypesMod._Global_

import typingsSlinky.eslint.eslintMod.SourceCode
import typingsSlinky.eslint.eslintMod.SourceCode.CursorWithCountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends SourceCode {
  def getFirstTokens(node: ASTNode): js.Array[typingsSlinky.eslint.eslintMod.AST.Token] = js.native
  def getFirstTokens(node: ASTNode, options: CursorWithCountOptions): js.Array[typingsSlinky.eslint.eslintMod.AST.Token] = js.native
}

