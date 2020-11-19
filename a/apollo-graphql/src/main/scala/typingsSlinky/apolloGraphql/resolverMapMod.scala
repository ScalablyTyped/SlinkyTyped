package typingsSlinky.apolloGraphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloGraphql.anon.Requires
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.mod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object resolverMapMod extends js.Object {
  
  type GraphQLResolverMap[TContext] = StringDictionary[
    (StringDictionary[
      Double | (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | Requires[TContext] | String
    ]) | GraphQLScalarType
  ]
}
