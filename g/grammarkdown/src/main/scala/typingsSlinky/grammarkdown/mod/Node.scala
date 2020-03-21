package typingsSlinky.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: typingsSlinky.grammarkdown.tokensMod.SyntaxKind */] protected ()
  extends typingsSlinky.grammarkdown.nodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

