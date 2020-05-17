package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.NamedTypeNode
  - typingsSlinky.graphql.astMod.ListTypeNode
  - typingsSlinky.graphql.astMod.NonNullTypeNode
*/
trait TypeNode extends js.Object

object TypeNode {
  @scala.inline
  implicit def apply(value: ListTypeNode): TypeNode = value.asInstanceOf[TypeNode]
  @scala.inline
  implicit def apply(value: NamedTypeNode): TypeNode = value.asInstanceOf[TypeNode]
  @scala.inline
  implicit def apply(value: NonNullTypeNode): TypeNode = value.asInstanceOf[TypeNode]
}

