package typingsSlinky.graphqlCompose.enumTypeComposerMod

import typingsSlinky.graphqlCompose.graphqlMod.GraphQLEnumType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
  - typingsSlinky.graphqlCompose.graphqlMod.GraphQLEnumType
*/
trait EnumTypeComposeDefinition extends js.Object

object EnumTypeComposeDefinition {
  @scala.inline
  implicit def apply(value: ComposeEnumTypeConfig): EnumTypeComposeDefinition = value.asInstanceOf[EnumTypeComposeDefinition]
  @scala.inline
  implicit def apply(value: GraphQLEnumType): EnumTypeComposeDefinition = value.asInstanceOf[EnumTypeComposeDefinition]
  @scala.inline
  implicit def apply(value: TypeAsString): EnumTypeComposeDefinition = value.asInstanceOf[EnumTypeComposeDefinition]
}

