package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Constraints")
@js.native
class Constraints protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.Constraints {
  def this(openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.distNodesMod.Argument]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.distNodesMod.Argument],
    closeBracketToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}

