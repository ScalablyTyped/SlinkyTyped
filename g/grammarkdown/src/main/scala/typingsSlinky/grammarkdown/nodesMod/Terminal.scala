package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Terminal")
@js.native
class Terminal ()
  extends OptionalSymbolBase[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Terminal]
     with TextContent {
  def this(text: String) = this()
  def this(text: js.UndefOr[scala.Nothing], questionToken: Token[QuestionToken]) = this()
  def this(text: String, questionToken: Token[QuestionToken]) = this()
}
