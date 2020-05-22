package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type callbackFn[Response, Context] = js.Function2[
    /* err */ typingsSlinky.elasticElasticsearch.transportMod.ApiError, 
    /* result */ typingsSlinky.elasticElasticsearch.transportMod.ApiResponse[Response, Context], 
    scala.Unit
  ]
  type extendsCallback = js.Function1[
    /* options */ typingsSlinky.elasticElasticsearch.mod.ClientExtendsCallbackOptions, 
    js.Any
  ]
}
