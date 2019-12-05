package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.CloseBraceToken
import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.OpenBraceToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.SymbolSet {
  def this(openBraceToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBraceToken]) = this()
  def this(
    openBraceToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsSlinky.grammarkdown.distNodesMod.SymbolSpan]
  ) = this()
  def this(
    openBraceToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.UndefOr[scala.Nothing],
    closeBraceToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: typingsSlinky.grammarkdown.distNodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsSlinky.grammarkdown.distNodesMod.SymbolSpan],
    closeBraceToken: typingsSlinky.grammarkdown.distNodesMod.Token[CloseBraceToken]
  ) = this()
}

