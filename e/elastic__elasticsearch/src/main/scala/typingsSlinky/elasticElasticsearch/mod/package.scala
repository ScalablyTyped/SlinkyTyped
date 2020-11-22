package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type callbackFn[TResponse, TContext] = js.Function2[
    /* err */ typingsSlinky.elasticElasticsearch.transportMod.ApiError, 
    /* result */ typingsSlinky.elasticElasticsearch.transportMod.ApiResponse[TResponse, TContext], 
    scala.Unit
  ]
  
  type extendsCallback = js.Function1[
    /* options */ typingsSlinky.elasticElasticsearch.mod.ClientExtendsCallbackOptions, 
    js.Any
  ]
}
