package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends typingsSlinky.grammarkdown.nodesMod.ArgumentList {
  def this(openParenToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.Argument]
  ) = this()
  def this(
    openParenToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.Argument],
    closeParenToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}

