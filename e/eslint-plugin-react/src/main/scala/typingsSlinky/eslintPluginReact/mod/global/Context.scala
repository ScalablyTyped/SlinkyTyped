package typingsSlinky.eslintPluginReact.mod.global

import typingsSlinky.eslint.mod.SourceCode
import typingsSlinky.eslint.mod.SourceCode.CursorWithCountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends SourceCode {
  
  def getFirstTokens(node: ASTNode): js.Array[typingsSlinky.eslint.mod.AST.Token] = js.native
  def getFirstTokens(node: ASTNode, options: CursorWithCountOptions): js.Array[typingsSlinky.eslint.mod.AST.Token] = js.native
}
