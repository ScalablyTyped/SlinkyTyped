package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "PlaceholderSymbol")
@js.native
class PlaceholderSymbol protected ()
  extends Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol] {
  def this(placeholderToken: Token[AtToken]) = this()
  
  val placeholderToken: Token[AtToken] = js.native
}
