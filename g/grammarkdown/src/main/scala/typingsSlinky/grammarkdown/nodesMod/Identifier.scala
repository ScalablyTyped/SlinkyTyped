package typingsSlinky.grammarkdown.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Identifier")
@js.native
class Identifier ()
  extends Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.Identifier]
     with TextContent {
  def this(text: String) = this()
}
