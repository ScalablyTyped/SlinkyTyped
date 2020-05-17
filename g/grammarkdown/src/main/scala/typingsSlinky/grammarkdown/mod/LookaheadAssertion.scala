package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.LookaheadOperatorKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LookaheadKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "LookaheadAssertion")
@js.native
class LookaheadAssertion protected ()
  extends typingsSlinky.grammarkdown.nodesMod.LookaheadAssertion {
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    lookaheadKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadKeyword]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    lookaheadKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadKeyword],
    operatorToken: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadOperatorKind]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    lookaheadKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadKeyword],
    operatorToken: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadOperatorKind],
    lookahead: typingsSlinky.grammarkdown.nodesMod.SymbolSet
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    lookaheadKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadKeyword],
    operatorToken: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadOperatorKind],
    lookahead: typingsSlinky.grammarkdown.nodesMod.SymbolSpan
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    lookaheadKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadKeyword],
    operatorToken: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadOperatorKind],
    lookahead: typingsSlinky.grammarkdown.nodesMod.SymbolSet,
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[OpenBracketToken],
    lookaheadKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadKeyword],
    operatorToken: typingsSlinky.grammarkdown.nodesMod.Token[LookaheadOperatorKind],
    lookahead: typingsSlinky.grammarkdown.nodesMod.SymbolSpan,
    closeBracketToken: typingsSlinky.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

