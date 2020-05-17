package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ParameterList")
@js.native
class ParameterList protected ()
  extends typingsSlinky.grammarkdown.nodesMod.ParameterList {
  def this(openParenToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.Parameter]
  ) = this()
  def this(
    openParenToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.Parameter],
    closeParenToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}

