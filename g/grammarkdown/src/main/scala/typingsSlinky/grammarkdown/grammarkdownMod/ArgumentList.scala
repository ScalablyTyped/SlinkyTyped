package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseParenToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.ArgumentList {
  def this(openParenToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.distNodesMod.Argument]
  ) = this()
  def this(
    openParenToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.distNodesMod.Argument],
    closeParenToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}

