package typingsSlinky.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unionTypeComposerMod {
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    typingsSlinky.graphqlCompose.definitionsMod.MaybePromise[scala.Boolean | scala.Null | scala.Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = typingsSlinky.std.Map[
    typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectType, 
    typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeResolverCheckFn[TSource, TContext]
  ]
}
