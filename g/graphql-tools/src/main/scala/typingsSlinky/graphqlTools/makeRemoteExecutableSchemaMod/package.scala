package typingsSlinky.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object makeRemoteExecutableSchemaMod {
  type Fetcher = js.Function1[
    /* operation */ typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation, 
    js.Promise[
      typingsSlinky.graphql.executeMod.ExecutionResult[typingsSlinky.graphql.executeMod.ExecutionResultDataDefault]
    ]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLResolveInfo], 
    typingsSlinky.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]
  ]
}
