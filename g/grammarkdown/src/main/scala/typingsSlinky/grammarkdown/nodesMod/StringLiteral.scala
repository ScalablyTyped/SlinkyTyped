package typingsSlinky.grammarkdown.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "StringLiteral")
@js.native
class StringLiteral ()
  extends Node[typingsSlinky.grammarkdown.tokensMod.SyntaxKind.StringLiteral]
     with TextContent {
  def this(text: String) = this()
}
