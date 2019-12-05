package typingsSlinky.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputTypeComposerMod {
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
  import typingsSlinky.graphqlDashCompose.Anon_GqcExtensionsGqcFields
  import typingsSlinky.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer
  import typingsSlinky.graphqlDashCompose.libGraphqlMod.GraphQLInputObjectType
  import typingsSlinky.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer
  import typingsSlinky.graphqlDashCompose.libTypeMapperMod.TypeAsString
  import typingsSlinky.graphqlDashCompose.libUtilsDefinitionsMod.ObjMap

  type ComposeInputFieldConfig = ComposeInputFieldConfigAsObject | ComposeInputType | (js.Function0[ComposeInputFieldConfigAsObject | ComposeInputType])
  type ComposeInputFieldConfigMap = ObjMap[ComposeInputFieldConfig]
  type ComposeInputType = InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | GraphQLInputType | TypeAsString | (js.Array[
    InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | GraphQLInputType | TypeAsString
  ])
  type GraphQLInputObjectTypeExtended = GraphQLInputObjectType with Anon_GqcExtensionsGqcFields
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
    - typings.graphqlDashCompose.libInputTypeComposerMod.ComposeInputObjectTypeConfig
    - typings.graphqlDashCompose.libGraphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = _InputTypeComposeDefinition | TypeAsString
}
