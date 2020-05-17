package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.SchemaExtensionNode
  - typingsSlinky.graphql.astMod.TypeExtensionNode
*/
trait TypeSystemExtensionNode extends DefinitionNode

object TypeSystemExtensionNode {
  @scala.inline
  implicit def apply(value: SchemaExtensionNode): TypeSystemExtensionNode = value.asInstanceOf[TypeSystemExtensionNode]
  @scala.inline
  implicit def apply(value: TypeExtensionNode): TypeSystemExtensionNode = value.asInstanceOf[TypeSystemExtensionNode]
}

