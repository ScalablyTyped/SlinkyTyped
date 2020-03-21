package typingsSlinky.apolloGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolveObjectMod {
  type GraphQLObjectResolver[TSource, TContext] = js.Function4[
    /* source */ TSource, 
    /* fields */ typingsSlinky.std.Record[java.lang.String, js.Array[typingsSlinky.graphql.astMod.FieldNode]], 
    /* context */ TContext, 
    /* info */ typingsSlinky.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
}
