package typingsSlinky.babelCore.mod

import typingsSlinky.babelTraverse.mod.Hub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "NodePath")
@js.native
class NodePath[T] protected ()
  extends typingsSlinky.babelTraverse.mod.NodePath[T] {
  def this(hub: Hub, parent: typingsSlinky.babelTraverse.mod.Node) = this()
}

