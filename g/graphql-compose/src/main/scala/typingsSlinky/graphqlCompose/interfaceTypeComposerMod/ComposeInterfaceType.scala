package typingsSlinky.graphqlCompose.interfaceTypeComposerMod

import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, js.Any]
  - typingsSlinky.graphql.mod.GraphQLInterfaceType
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
*/
trait ComposeInterfaceType extends js.Object

object ComposeInterfaceType {
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): ComposeInterfaceType = value.asInstanceOf[ComposeInterfaceType]
  @scala.inline
  implicit def apply(value: InterfaceTypeComposer[js.Any, js.Any]): ComposeInterfaceType = value.asInstanceOf[ComposeInterfaceType]
  @scala.inline
  implicit def apply(value: TypeAsString): ComposeInterfaceType = value.asInstanceOf[ComposeInterfaceType]
  @scala.inline
  implicit def apply(value: TypeDefinitionString): ComposeInterfaceType = value.asInstanceOf[ComposeInterfaceType]
}

