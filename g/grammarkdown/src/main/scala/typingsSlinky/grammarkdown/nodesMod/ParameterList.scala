package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "ParameterList")
@js.native
class ParameterList protected ()
  extends Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ParameterList] {
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
