package typingsSlinky.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfaceTypeComposerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.graphql.graphqlMod.GraphQLInterfaceType
  import typingsSlinky.graphql.graphqlMod.GraphQLObjectType
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typingsSlinky.graphqlDashCompose.Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer
  import typingsSlinky.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer
  import typingsSlinky.graphqlDashCompose.libTypeMapperMod.TypeAsString
  import typingsSlinky.graphqlDashCompose.libTypeMapperMod.TypeDefinitionString
  import typingsSlinky.graphqlDashCompose.libUtilsDefinitionsMod.MaybePromise
  import typingsSlinky.std.Map

  type ComposeInterfaceType = (InterfaceTypeComposer[js.Any, js.Any]) | GraphQLInterfaceType | TypeDefinitionString | TypeAsString
  type GraphQLInterfaceTypeExtended[TSource, TContext] = GraphQLInterfaceType with (Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext])
  type InterfaceTypeComposeDefinition[TSource, TContext] = TypeAsString | (ComposeInterfaceTypeConfig[TSource, TContext])
  type InterfaceTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    MaybePromise[js.UndefOr[Boolean | Null]]
  ]
  type InterfaceTypeResolversMap[TContext] = Map[
    (ObjectTypeComposer[js.Any, TContext]) | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]), 
    InterfaceTypeResolverCheckFn[js.Any, TContext]
  ]
}
