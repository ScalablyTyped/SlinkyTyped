package typingsSlinky.graphqlCompose.objectTypeComposerMod

import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLInputType
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any]
  - typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any]
  - typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any]
  - js.Array[
typingsSlinky.graphql.definitionMod.GraphQLInputType | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any]]
*/
trait ComposeArgumentType extends ComposeArgumentConfig

object ComposeArgumentType {
  @scala.inline
  implicit def apply(
    value: js.Array[
      GraphQLInputType | TypeAsString | InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any]
    ]
  ): ComposeArgumentType = value.asInstanceOf[ComposeArgumentType]
  @scala.inline
  implicit def apply(value: EnumTypeComposer[js.Any]): ComposeArgumentType = value.asInstanceOf[ComposeArgumentType]
  @scala.inline
  implicit def apply(value: GraphQLInputType): ComposeArgumentType = value.asInstanceOf[ComposeArgumentType]
  @scala.inline
  implicit def apply(value: InputTypeComposer[js.Any]): ComposeArgumentType = value.asInstanceOf[ComposeArgumentType]
  @scala.inline
  implicit def apply(value: ScalarTypeComposer[js.Any]): ComposeArgumentType = value.asInstanceOf[ComposeArgumentType]
  @scala.inline
  implicit def apply(value: TypeAsString): ComposeArgumentType = value.asInstanceOf[ComposeArgumentType]
}

