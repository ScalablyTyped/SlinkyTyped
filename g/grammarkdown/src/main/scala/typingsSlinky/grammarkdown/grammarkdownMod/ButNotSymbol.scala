package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ButKeyword
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.NotKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "ButNotSymbol")
@js.native
class ButNotSymbol protected ()
  extends LexicalSymbolBase[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ButNotSymbol] {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: Token[ButKeyword]) = this()
  def this(left: LexicalSymbol, butKeyword: js.UndefOr[scala.Nothing], notKeyword: Token[NotKeyword]) = this()
  def this(left: LexicalSymbol, butKeyword: Token[ButKeyword], notKeyword: Token[NotKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Token[ButKeyword],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Token[ButKeyword],
    notKeyword: Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  
  val butKeyword: js.UndefOr[Token[ButKeyword]] = js.native
  
  val left: LexicalSymbol = js.native
  
  val notKeyword: js.UndefOr[Token[NotKeyword]] = js.native
  
  val right: js.UndefOr[LexicalSymbol] = js.native
  
  def update(left: LexicalSymbol): ButNotSymbol = js.native
  def update(left: LexicalSymbol, right: LexicalSymbol): ButNotSymbol = js.native
}
