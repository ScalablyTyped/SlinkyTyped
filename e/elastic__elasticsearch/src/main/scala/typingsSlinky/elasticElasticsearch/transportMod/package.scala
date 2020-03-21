package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transportMod {
  type ApiResponse[T, C] = typingsSlinky.elasticElasticsearch.transportMod.RequestEvent[T, C]
  type anyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type emitFn = js.Function2[/* event */ java.lang.String | js.Symbol, /* repeated */ js.Any, scala.Boolean]
  type generateRequestIdFn = js.Function2[
    /* params */ typingsSlinky.elasticElasticsearch.transportMod.TransportRequestParams, 
    /* options */ typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions, 
    js.Any
  ]
  type nodeFilterFn = js.Function1[
    /* connection */ typingsSlinky.elasticElasticsearch.connectionMod.default, 
    scala.Boolean
  ]
  type nodeSelectorFn = js.Function1[
    /* connections */ js.Array[typingsSlinky.elasticElasticsearch.connectionMod.default], 
    typingsSlinky.elasticElasticsearch.connectionMod.default
  ]
  type noopFn = js.Function1[/* repeated */ js.Any, scala.Unit]
}
