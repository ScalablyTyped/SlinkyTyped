package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helpersMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.elasticElasticsearch.helpersMod.IndexAction
    - typingsSlinky.elasticElasticsearch.helpersMod.CreateAction
    - typingsSlinky.elasticElasticsearch.helpersMod.UpdateAction
    - typingsSlinky.elasticElasticsearch.helpersMod.DeleteAction
  */
  type Action = typingsSlinky.elasticElasticsearch.helpersMod._Action | typingsSlinky.elasticElasticsearch.helpersMod.UpdateAction
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type UpdateAction = js.Tuple2[
    typingsSlinky.elasticElasticsearch.helpersMod.UpdateActionOperation, 
    typingsSlinky.std.Record[java.lang.String, js.Any]
  ]
  type callbackFn[Response, Context] = js.Function2[
    /* err */ typingsSlinky.elasticElasticsearch.transportMod.ApiError, 
    /* result */ typingsSlinky.elasticElasticsearch.transportMod.ApiResponse[Response, Context], 
    scala.Unit
  ]
}
