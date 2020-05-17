package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Constraints")
@js.native
class Constraints protected ()
  extends typingsSlinky.grammarkdown.nodesMod.Constraints {
  def this(openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.Argument]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.Argument],
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

