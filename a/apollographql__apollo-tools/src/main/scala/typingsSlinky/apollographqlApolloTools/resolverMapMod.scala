package typingsSlinky.apollographqlApolloTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apollographqlApolloTools.anon.Requires
import typingsSlinky.apollographqlApolloTools.anon.Resolve
import typingsSlinky.apollographqlApolloTools.anon.Subscribe
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollographql/apollo-tools/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object resolverMapMod extends js.Object {
  
  type GraphQLResolverMap[TContext] = StringDictionary[
    StringDictionary[
      (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | Requires[TContext] | Resolve[TContext] | Subscribe[TContext]
    ]
  ]
}
