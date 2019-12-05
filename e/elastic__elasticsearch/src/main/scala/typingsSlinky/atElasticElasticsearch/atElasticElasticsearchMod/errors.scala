package typingsSlinky.atElasticElasticsearch.atElasticElasticsearchMod

import typingsSlinky.atElasticElasticsearch.libTransportMod.ApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "errors")
@js.native
object errors extends js.Object {
  @js.native
  class ConfigurationError protected ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.ConfigurationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ConnectionError protected ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.ConnectionError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class DeserializationError protected ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.DeserializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ElasticsearchClientError ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.ElasticsearchClientError
  
  @js.native
  class NoLivingConnectionsError protected ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.NoLivingConnectionsError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class ResponseError protected ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.ResponseError {
    def this(meta: ApiResponse[_, _]) = this()
  }
  
  @js.native
  class SerializationError protected ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.SerializationError {
    def this(message: String) = this()
  }
  
  @js.native
  class TimeoutError protected ()
    extends typingsSlinky.atElasticElasticsearch.libErrorsMod.TimeoutError {
    def this(message: String, meta: ApiResponse[_, _]) = this()
  }
  
}

