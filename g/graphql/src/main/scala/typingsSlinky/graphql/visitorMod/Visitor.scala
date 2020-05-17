package typingsSlinky.graphql.visitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.visitorMod.EnterLeaveVisitor[KindToNode, Nodes]
  - typingsSlinky.graphql.visitorMod.ShapeMapVisitor[KindToNode, Nodes]
*/
trait Visitor[KindToNode, Nodes] extends js.Object

object Visitor {
  @scala.inline
  implicit def apply[KindToNode, Nodes](value: EnterLeaveVisitor[KindToNode, Nodes]): Visitor[KindToNode, Nodes] = value.asInstanceOf[Visitor[KindToNode, Nodes]]
  @scala.inline
  implicit def apply[KindToNode, Nodes](value: ShapeMapVisitor[KindToNode, Nodes]): Visitor[KindToNode, Nodes] = value.asInstanceOf[Visitor[KindToNode, Nodes]]
}

