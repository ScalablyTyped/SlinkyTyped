package typingsSlinky.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUnionTypeComposerMod {
  import typingsSlinky.graphql.graphqlMod.GraphQLUnionType
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typingsSlinky.graphqlDashCompose.Anon_GqcExtensionsGqcTypeMap
  import typingsSlinky.graphqlDashCompose.libObjectTypeComposerMod.ComposeObjectType
  import typingsSlinky.graphqlDashCompose.libTypeMapperMod.TypeAsString
  import typingsSlinky.graphqlDashCompose.libTypeMapperMod.TypeDefinitionString
  import typingsSlinky.graphqlDashCompose.libUtilsDefinitionsMod.MaybePromise
  import typingsSlinky.std.Map

  type ComposeUnionType = (UnionTypeComposer[js.Any, js.Any]) | GraphQLUnionType | TypeDefinitionString | TypeAsString
  type GraphQLUnionTypeExtended[TSource, TContext] = GraphQLUnionType with (Anon_GqcExtensionsGqcTypeMap[TSource, TContext])
  type UnionTypeComposeDefinition[TSource, TContext] = TypeAsString | (ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    MaybePromise[Boolean | Null | Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = Map[ComposeObjectType, UnionTypeResolverCheckFn[TSource, TContext]]
}
