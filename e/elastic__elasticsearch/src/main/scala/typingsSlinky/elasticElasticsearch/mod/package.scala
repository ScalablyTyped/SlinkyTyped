package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type anyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type callbackFn[T] = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsSlinky.elasticElasticsearch.transportMod.ApiResponse[T, js.Any], 
    scala.Unit
  ]
  type extendsCallback = js.Function1[
    /* options */ typingsSlinky.elasticElasticsearch.mod.ClientExtendsCallbackOptions, 
    js.Any
  ]
}
