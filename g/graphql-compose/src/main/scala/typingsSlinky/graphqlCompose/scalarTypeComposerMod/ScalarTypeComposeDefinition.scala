package typingsSlinky.graphqlCompose.scalarTypeComposerMod

import typingsSlinky.graphqlCompose.graphqlMod.GraphQLScalarType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
  - typingsSlinky.graphqlCompose.graphqlMod.GraphQLScalarType
*/
trait ScalarTypeComposeDefinition extends js.Object

object ScalarTypeComposeDefinition {
  @scala.inline
  implicit def apply(value: ComposeScalarTypeConfig): ScalarTypeComposeDefinition = value.asInstanceOf[ScalarTypeComposeDefinition]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): ScalarTypeComposeDefinition = value.asInstanceOf[ScalarTypeComposeDefinition]
  @scala.inline
  implicit def apply(value: TypeAsString): ScalarTypeComposeDefinition = value.asInstanceOf[ScalarTypeComposeDefinition]
}

