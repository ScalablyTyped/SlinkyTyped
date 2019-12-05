package typingsSlinky.apolloDashGraphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLScalarType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/resolverMap", JSImport.Namespace)
@js.native
object libSchemaResolverMapMod extends js.Object {
  type GraphQLResolverMap[TContext] = StringDictionary[
    (StringDictionary[
      Anon_ArgName[TContext] | Double | (GraphQLFieldResolver[js.Any, TContext, StringDictionary[js.Any]]) | String
    ]) | GraphQLScalarType
  ]
}

