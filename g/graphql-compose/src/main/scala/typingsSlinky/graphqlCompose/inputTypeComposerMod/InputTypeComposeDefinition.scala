package typingsSlinky.graphqlCompose.inputTypeComposerMod

import typingsSlinky.graphqlCompose.graphqlMod.GraphQLInputObjectType
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
  - typingsSlinky.graphqlCompose.graphqlMod.GraphQLInputObjectType
*/
trait InputTypeComposeDefinition extends js.Object

object InputTypeComposeDefinition {
  @scala.inline
  implicit def apply(value: ComposeInputObjectTypeConfig): InputTypeComposeDefinition = value.asInstanceOf[InputTypeComposeDefinition]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): InputTypeComposeDefinition = value.asInstanceOf[InputTypeComposeDefinition]
  @scala.inline
  implicit def apply(value: TypeAsString): InputTypeComposeDefinition = value.asInstanceOf[InputTypeComposeDefinition]
}

