package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object enumTypeComposerMod {
  
  type ComposeEnumType = typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsSlinky.graphqlCompose.graphqlMod.GraphQLEnumType | typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  
  type ComposeEnumValueConfigMap = typingsSlinky.graphqlCompose.definitionsMod.ObjMap[typingsSlinky.graphqlCompose.enumTypeComposerMod.ComposeEnumValueConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
    - typingsSlinky.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
    - typingsSlinky.graphqlCompose.graphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = typingsSlinky.graphqlCompose.enumTypeComposerMod._EnumTypeComposeDefinition | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
}
