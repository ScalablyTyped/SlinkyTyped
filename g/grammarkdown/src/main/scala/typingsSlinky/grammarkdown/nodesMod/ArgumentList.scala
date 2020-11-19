package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ArgumentList] {
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken]) = this()
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken], elements: js.Array[Argument]) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[Argument],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  
  val closeParenToken: js.UndefOr[Token[CloseParenToken | CloseBracketToken]] = js.native
  
  val elements: js.UndefOr[js.Array[Argument]] = js.native
  
  val openParenToken: Token[OpenParenToken | OpenBracketToken] = js.native
  
  def update(): ArgumentList = js.native
  def update(elements: js.Array[Argument]): ArgumentList = js.native
}
