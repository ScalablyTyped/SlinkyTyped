package typingsSlinky.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object watchQueryOptionsMod {
  
  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ typingsSlinky.apolloCache.dataProxyMod.DataProxy, 
    /* mutationResult */ typingsSlinky.apolloLink.typesMod.FetchResult[
      T, 
      typingsSlinky.std.Record[java.lang.String, js.Any], 
      typingsSlinky.std.Record[java.lang.String, js.Any]
    ], 
    scala.Unit
  ]
  
  type RefetchQueryDescription = js.Array[java.lang.String | typingsSlinky.apolloClient.typesMod.PureQueryOptions]
  
  type UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData] = js.Function2[
    /* previousQueryResult */ TData, 
    /* options */ typingsSlinky.apolloClient.anon.SubscriptionData[TSubscriptionData, TSubscriptionVariables], 
    TData
  ]
}
