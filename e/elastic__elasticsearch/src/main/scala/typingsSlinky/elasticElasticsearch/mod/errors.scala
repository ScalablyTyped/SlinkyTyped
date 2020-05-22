package typingsSlinky.elasticElasticsearch.mod

import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "errors")
@js.native
object errors extends js.Object {
  @js.native
  class ConfigurationError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.ConfigurationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ConnectionError[TResponse, TContext] protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.ConnectionError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class DeserializationError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.DeserializationError {
    def this(message: String, data: String) = this()
  }
  
  @js.native
  class ElasticsearchClientError ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.ElasticsearchClientError
  
  @js.native
  class NoLivingConnectionsError[TResponse, TContext] protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.NoLivingConnectionsError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class RequestAbortedError[TResponse, TContext] protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.RequestAbortedError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class ResponseError[TResponse, TContext] protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.ResponseError[TResponse, TContext] {
    def this(meta: ApiResponse[Record[String, _], _]) = this()
  }
  
  @js.native
  class SerializationError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.SerializationError {
    def this(message: String, data: js.Any) = this()
  }
  
  @js.native
  class TimeoutError[TResponse, TContext] protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.TimeoutError[TResponse, TContext] {
    def this(message: String, meta: ApiResponse[Record[String, _], _]) = this()
  }
  
}

