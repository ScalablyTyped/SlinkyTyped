package typingsSlinky.graphqlCompose.enumTypeComposerMod

import typingsSlinky.graphqlCompose.graphqlMod.GraphQLEnumType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any]
  - typingsSlinky.graphqlCompose.graphqlMod.GraphQLEnumType
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
*/
trait ComposeEnumType extends js.Object

object ComposeEnumType {
  @scala.inline
  implicit def apply(value: EnumTypeComposer[js.Any]): ComposeEnumType = value.asInstanceOf[ComposeEnumType]
  @scala.inline
  implicit def apply(value: GraphQLEnumType): ComposeEnumType = value.asInstanceOf[ComposeEnumType]
  @scala.inline
  implicit def apply(value: TypeAsString): ComposeEnumType = value.asInstanceOf[ComposeEnumType]
  @scala.inline
  implicit def apply(value: TypeDefinitionString): ComposeEnumType = value.asInstanceOf[ComposeEnumType]
}

