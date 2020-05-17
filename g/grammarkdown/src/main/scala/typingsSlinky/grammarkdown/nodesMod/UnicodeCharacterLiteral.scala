package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterLiteral")
@js.native
class UnicodeCharacterLiteral ()
  extends OptionalSymbolBase[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterLiteral]
     with TextContent {
  def this(text: String) = this()
  def this(text: String, questionToken: Token[QuestionToken]) = this()
}

