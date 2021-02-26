package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.CloseParenToken
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenBracketToken
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.OpenParenToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "ParameterList")
@js.native
class ParameterList protected ()
  extends Node2[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.ParameterList] {
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken]) = this()
  def this(openParenToken: Token[OpenParenToken | OpenBracketToken], elements: js.Array[Parameter]) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[Parameter],
    closeParenToken: Token[CloseParenToken | CloseBracketToken]
  ) = this()
  
  val closeParenToken: js.UndefOr[Token[CloseParenToken | CloseBracketToken]] = js.native
  
  val elements: js.UndefOr[js.Array[Parameter]] = js.native
  
  val openParenToken: Token[OpenParenToken | OpenBracketToken] = js.native
  
  def update(): ParameterList = js.native
  def update(elements: js.Array[Parameter]): ParameterList = js.native
}
