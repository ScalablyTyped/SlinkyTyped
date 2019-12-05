package typingsSlinky.graphqlDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashRelayMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.graphql.graphqlMod.GraphQLEnumType
  import typingsSlinky.graphql.graphqlMod.GraphQLInterfaceType
  import typingsSlinky.graphql.graphqlMod.GraphQLObjectType
  import typingsSlinky.graphql.graphqlMod.GraphQLScalarType
  import typingsSlinky.graphql.graphqlMod.GraphQLUnionType
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLNonNull
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo

  type ConnectionConfigNodeType = ConnectionConfigNodeTypeNullable | GraphQLNonNull[ConnectionConfigNodeTypeNullable]
  type ConnectionConfigNodeTypeNullable = GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType
  type ConnectionCursor = String
  type mutationFn = js.Function3[
    /* object */ js.Any, 
    /* ctx */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    js.Promise[js.Any] | js.Any
  ]
  type typeResolverFn = js.Function1[
    /* any */ js.Any, 
    (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | (js.Promise[GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]])
  ]
}
