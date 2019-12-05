package typingsSlinky.apolloDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaResolveObjectMod {
  import typingsSlinky.graphql.languageAstMod.FieldNode
  import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typingsSlinky.std.Record

  type GraphQLObjectResolver[TSource, TContext] = js.Function4[
    /* source */ TSource, 
    /* fields */ Record[String, js.Array[FieldNode]], 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
}
