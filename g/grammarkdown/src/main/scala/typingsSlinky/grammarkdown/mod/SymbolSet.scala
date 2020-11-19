package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBraceToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBraceToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends typingsSlinky.grammarkdown.nodesMod.SymbolSet {
  def this(openBraceToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBraceToken]) = this()
  def this(
    openBraceToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.SymbolSpan]
  ) = this()
  def this(
    openBraceToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.UndefOr[scala.Nothing],
    closeBraceToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBraceToken]
  ) = this()
  def this(
    openBraceToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBraceToken],
    elements: js.Array[typingsSlinky.grammarkdown.nodesMod.SymbolSpan],
    closeBraceToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBraceToken]
  ) = this()
}
