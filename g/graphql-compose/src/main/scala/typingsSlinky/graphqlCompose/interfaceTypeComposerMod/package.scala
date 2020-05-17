package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceTypeComposerMod {
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
