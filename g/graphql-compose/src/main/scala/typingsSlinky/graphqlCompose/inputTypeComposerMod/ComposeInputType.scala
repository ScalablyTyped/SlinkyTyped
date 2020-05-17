package typingsSlinky.graphqlCompose.inputTypeComposerMod

import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any]
  - typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any]
  - typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any]
  - typingsSlinky.graphql.definitionMod.GraphQLInputType
  - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  - js.Array[
typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | typingsSlinky.graphql.definitionMod.GraphQLInputType | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString]
*/
trait ComposeInputType extends ComposeInputFieldConfig

object ComposeInputType {
  @scala.inline
  implicit def apply(
    value: js.Array[
      InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | GraphQLInputType | TypeAsString
    ]
  ): ComposeInputType = value.asInstanceOf[ComposeInputType]
  @scala.inline
  implicit def apply(value: EnumTypeComposer[js.Any]): ComposeInputType = value.asInstanceOf[ComposeInputType]
  @scala.inline
  implicit def apply(value: GraphQLInputType): ComposeInputType = value.asInstanceOf[ComposeInputType]
  @scala.inline
  implicit def apply(value: InputTypeComposer[js.Any]): ComposeInputType = value.asInstanceOf[ComposeInputType]
  @scala.inline
  implicit def apply(value: ScalarTypeComposer[js.Any]): ComposeInputType = value.asInstanceOf[ComposeInputType]
  @scala.inline
  implicit def apply(value: TypeAsString): ComposeInputType = value.asInstanceOf[ComposeInputType]
}

