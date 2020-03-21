package typingsSlinky.elasticElasticsearch.mod

import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
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
  class ConnectionError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.ConnectionError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class DeserializationError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.DeserializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ElasticsearchClientError ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.ElasticsearchClientError
  
  @js.native
  class NoLivingConnectionsError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.NoLivingConnectionsError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class ResponseError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.ResponseError {
    def this(meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class SerializationError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.SerializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class TimeoutError protected ()
    extends typingsSlinky.elasticElasticsearch.errorsMod.TimeoutError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
}

