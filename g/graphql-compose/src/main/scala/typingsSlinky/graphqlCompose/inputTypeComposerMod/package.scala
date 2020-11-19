package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inputTypeComposerMod {
  
  type ComposeInputFieldConfig = typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigAsObject | typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputType | (js.Function0[
    typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigAsObject | typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputType
  ])
  
  type ComposeInputFieldConfigMap = typingsSlinky.graphqlCompose.definitionsMod.ObjMap[typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfig]
  
  type ComposeInputType = typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | typingsSlinky.graphql.definitionMod.GraphQLInputType | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | (js.Array[
    typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | typingsSlinky.graphql.definitionMod.GraphQLInputType | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
    - typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
    - typingsSlinky.graphqlCompose.graphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = typingsSlinky.graphqlCompose.inputTypeComposerMod._InputTypeComposeDefinition | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
}
