package typingsSlinky.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEnumTypeComposerMod {
  import typingsSlinky.graphqlDashCompose.Anon_GqcExtensions
  import typingsSlinky.graphqlDashCompose.libGraphqlMod.GraphQLEnumType
  import typingsSlinky.graphqlDashCompose.libTypeMapperMod.TypeAsString
  import typingsSlinky.graphqlDashCompose.libTypeMapperMod.TypeDefinitionString
  import typingsSlinky.graphqlDashCompose.libUtilsDefinitionsMod.ObjMap

  type ComposeEnumType = EnumTypeComposer[js.Any] | GraphQLEnumType | TypeDefinitionString | TypeAsString
  type ComposeEnumValueConfigMap = ObjMap[ComposeEnumValueConfig]
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
    - typings.graphqlDashCompose.libEnumTypeComposerMod.ComposeEnumTypeConfig
    - typings.graphqlDashCompose.libGraphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = _EnumTypeComposeDefinition | TypeAsString
  type GraphQLEnumTypeExtended = GraphQLEnumType with Anon_GqcExtensions
}
