package typingsSlinky.grammarkdown.distNodesMod

import typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "PlaceholderSymbol")
@js.native
class PlaceholderSymbol protected ()
  extends Node[typingsSlinky.grammarkdown.distTokensMod.SyntaxKind.PlaceholderSymbol] {
  def this(placeholderToken: Token[AtToken]) = this()
  val placeholderToken: Token[AtToken] = js.native
}

