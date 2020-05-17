package typingsSlinky.graphqlImport.definitionMod

import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.astMod.TypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.DirectiveDefinitionNode
  - typingsSlinky.graphql.astMod.TypeDefinitionNode
*/
trait ValidDefinitionNode extends js.Object

object ValidDefinitionNode {
  @scala.inline
  implicit def apply(value: DirectiveDefinitionNode): ValidDefinitionNode = value.asInstanceOf[ValidDefinitionNode]
  @scala.inline
  implicit def apply(value: TypeDefinitionNode): ValidDefinitionNode = value.asInstanceOf[ValidDefinitionNode]
}

