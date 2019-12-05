package typingsSlinky.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: typingsSlinky.grammarkdown.distTokensMod.SyntaxKind */] protected ()
  extends typingsSlinky.grammarkdown.distNodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

