package typingsSlinky.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transportMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.elasticElasticsearch.errorsMod.ConfigurationError
    - typingsSlinky.elasticElasticsearch.errorsMod.ConnectionError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]
    - typingsSlinky.elasticElasticsearch.errorsMod.DeserializationError
    - typingsSlinky.elasticElasticsearch.errorsMod.SerializationError
    - typingsSlinky.elasticElasticsearch.errorsMod.NoLivingConnectionsError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]
    - typingsSlinky.elasticElasticsearch.errorsMod.ResponseError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]
    - typingsSlinky.elasticElasticsearch.errorsMod.TimeoutError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]
    - typingsSlinky.elasticElasticsearch.errorsMod.RequestAbortedError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]
  */
  type ApiError = typingsSlinky.elasticElasticsearch.transportMod._ApiError | (typingsSlinky.elasticElasticsearch.errorsMod.ConnectionError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]) | (typingsSlinky.elasticElasticsearch.errorsMod.NoLivingConnectionsError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]) | (typingsSlinky.elasticElasticsearch.errorsMod.ResponseError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]) | (typingsSlinky.elasticElasticsearch.errorsMod.TimeoutError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]) | (typingsSlinky.elasticElasticsearch.errorsMod.RequestAbortedError[typingsSlinky.std.Record[java.lang.String, js.Any], js.Any])
  
  type ApiResponse[TResponse, TContext] = typingsSlinky.elasticElasticsearch.transportMod.RequestEvent[TResponse, TContext]
  
  type RequestBody[T] = T | java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.node.streamMod.Readable
  
  type RequestNDBody[T] = T | java.lang.String | js.Array[java.lang.String] | typingsSlinky.node.Buffer | typingsSlinky.node.streamMod.Readable
  
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
}
