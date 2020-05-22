package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceTypeComposerMod {
  type ComposeInterfaceType = (typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, js.Any]) | typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphqlCompose.typeMapperMod.TypeDefinitionString | typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
  type InterfaceTypeComposeDefinition[TSource, TContext] = typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString | (typingsSlinky.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig[TSource, TContext])
  type InterfaceTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    typingsSlinky.graphqlCompose.definitionsMod.MaybePromise[js.UndefOr[scala.Boolean | scala.Null]]
  ]
  type InterfaceTypeResolversMap[TContext] = typingsSlinky.std.Map[
    (typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]), 
    typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeResolverCheckFn[js.Any, TContext]
  ]
}
