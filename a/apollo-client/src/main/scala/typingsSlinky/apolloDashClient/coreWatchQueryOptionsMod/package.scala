package typingsSlinky.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreWatchQueryOptionsMod {
  import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy
  import typingsSlinky.apolloDashClient.Anon_SubscriptionData
  import typingsSlinky.apolloDashClient.coreTypesMod.PureQueryOptions
  import typingsSlinky.apolloDashLink.libTypesMod.FetchResult
  import typingsSlinky.std.Record

  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ DataProxy, 
    /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]], 
    Unit
  ]
  type RefetchQueryDescription = js.Array[String | PureQueryOptions]
  type UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData] = js.Function2[
    /* previousQueryResult */ TData, 
    /* options */ Anon_SubscriptionData[TSubscriptionData, TSubscriptionVariables], 
    TData
  ]
}
