package typingsSlinky.graphqlRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConnectionConfigNodeType = typingsSlinky.graphqlRelay.mod.ConnectionConfigNodeTypeNullable | typingsSlinky.graphql.definitionMod.GraphQLNonNull[typingsSlinky.graphqlRelay.mod.ConnectionConfigNodeTypeNullable]
  type ConnectionConfigNodeTypeNullable = typingsSlinky.graphql.mod.GraphQLScalarType | (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsSlinky.graphql.mod.GraphQLInterfaceType | typingsSlinky.graphql.mod.GraphQLUnionType | typingsSlinky.graphql.mod.GraphQLEnumType
  type ConnectionCursor = java.lang.String
  type mutationFn = js.Function3[
    /* object */ js.Any, 
    /* ctx */ js.Any, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Promise[js.Any] | js.Any
  ]
  type typeResolverFn = js.Function1[
    /* any */ js.Any, 
    (typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | (js.Promise[
      typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ])
  ]
}
