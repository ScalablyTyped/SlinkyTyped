package typingsSlinky.bullArena

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.bullArena.bullArenaStrings.bee
import typingsSlinky.bullArena.bullArenaStrings.bq
import typingsSlinky.bullArena.bullArenaStrings.bull
import typingsSlinky.bullArena.bullArenaStrings.bullmq
import typingsSlinky.bullArena.mod.BullArena.MiddlewareListenOptions
import typingsSlinky.bullArena.mod.BullArena.MiddlewareOptions
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.redis.mod.ClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bull-arena", JSImport.Namespace)
  @js.native
  def apply(options: MiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("bull-arena", JSImport.Namespace)
  @js.native
  def apply(options: MiddlewareOptions, listenOptions: MiddlewareListenOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  object BullArena {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.bullArena.mod.BullArena.PortHostConnectionOptions
      - typingsSlinky.bullArena.mod.BullArena.RedisUrlConnectionOptions
      - typingsSlinky.bullArena.mod.BullArena.RedisClientConnectionOptions
    */
    trait ConnectionOptions extends StObject
    object ConnectionOptions {
      
      @scala.inline
      def PortHostConnectionOptions(host: String): typingsSlinky.bullArena.mod.BullArena.PortHostConnectionOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.bullArena.mod.BullArena.PortHostConnectionOptions]
      }
      
      @scala.inline
      def RedisClientConnectionOptions(redis: ClientOpts): typingsSlinky.bullArena.mod.BullArena.RedisClientConnectionOptions = {
        val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.bullArena.mod.BullArena.RedisClientConnectionOptions]
      }
      
      @scala.inline
      def RedisUrlConnectionOptions(url: String): typingsSlinky.bullArena.mod.BullArena.RedisUrlConnectionOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.bullArena.mod.BullArena.RedisUrlConnectionOptions]
      }
    }
    
    @js.native
    trait MiddlewareListenOptions extends StObject {
      
      var basePath: js.UndefOr[String] = js.native
      
      var disableListen: js.UndefOr[Boolean] = js.native
      
      var host: js.UndefOr[String] = js.native
      
      var port: js.UndefOr[Double] = js.native
      
      var useCdn: js.UndefOr[Boolean] = js.native
    }
    object MiddlewareListenOptions {
      
      @scala.inline
      def apply(): MiddlewareListenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MiddlewareListenOptions]
      }
      
      @scala.inline
      implicit class MiddlewareListenOptionsMutableBuilder[Self <: MiddlewareListenOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
        
        @scala.inline
        def setDisableListen(value: Boolean): Self = StObject.set(x, "disableListen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableListenUndefined: Self = StObject.set(x, "disableListen", js.undefined)
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setUseCdn(value: Boolean): Self = StObject.set(x, "useCdn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseCdnUndefined: Self = StObject.set(x, "useCdn", js.undefined)
      }
    }
    
    @js.native
    trait MiddlewareOptions extends StObject {
      
      var Bee: js.UndefOr[QueueConstructor] = js.native
      
      var Bull: js.UndefOr[QueueConstructor] = js.native
      
      var BullMQ: js.UndefOr[QueueConstructor] = js.native
      
      var queues: js.Array[QueueOptions with ConnectionOptions] = js.native
    }
    object MiddlewareOptions {
      
      @scala.inline
      def apply(queues: js.Array[QueueOptions with ConnectionOptions]): MiddlewareOptions = {
        val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
        __obj.asInstanceOf[MiddlewareOptions]
      }
      
      @scala.inline
      implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBee(value: QueueConstructor): Self = StObject.set(x, "Bee", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeeUndefined: Self = StObject.set(x, "Bee", js.undefined)
        
        @scala.inline
        def setBull(value: QueueConstructor): Self = StObject.set(x, "Bull", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBullMQ(value: QueueConstructor): Self = StObject.set(x, "BullMQ", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBullMQUndefined: Self = StObject.set(x, "BullMQ", js.undefined)
        
        @scala.inline
        def setBullUndefined: Self = StObject.set(x, "Bull", js.undefined)
        
        @scala.inline
        def setQueues(value: js.Array[QueueOptions with ConnectionOptions]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueuesVarargs(value: (QueueOptions with ConnectionOptions)*): Self = StObject.set(x, "queues", js.Array(value :_*))
      }
    }
    
    @js.native
    trait PortHostConnectionOptions extends ConnectionOptions {
      
      var db: js.UndefOr[String] = js.native
      
      var host: String = js.native
      
      var password: js.UndefOr[String] = js.native
      
      var port: js.UndefOr[Double] = js.native
    }
    object PortHostConnectionOptions {
      
      @scala.inline
      def apply(host: String): PortHostConnectionOptions = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
        __obj.asInstanceOf[PortHostConnectionOptions]
      }
      
      @scala.inline
      implicit class PortHostConnectionOptionsMutableBuilder[Self <: PortHostConnectionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      }
    }
    
    @js.native
    trait Queue extends StObject {
      
      // Interface of Queue is much larger and
      // inconsistent between different packages.
      // We are using an example method here
      // that is consistent across all providers.
      def getJob(jobId: String): js.Promise[_] = js.native
    }
    object Queue {
      
      @scala.inline
      def apply(getJob: String => js.Promise[_]): Queue = {
        val __obj = js.Dynamic.literal(getJob = js.Any.fromFunction1(getJob))
        __obj.asInstanceOf[Queue]
      }
      
      @scala.inline
      implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetJob(value: String => js.Promise[_]): Self = StObject.set(x, "getJob", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait QueueConstructor
      extends Instantiable1[/* queueName */ String, Queue]
         with Instantiable2[/* queueName */ String, /* opts */ QueueOptions, Queue]
    
    @js.native
    trait QueueOptions extends StObject {
      
      var hostId: js.UndefOr[String] = js.native
      
      var name: String = js.native
      
      var prefix: js.UndefOr[bull | bq | String] = js.native
      
      var `type`: js.UndefOr[bull | bee | bullmq | String] = js.native
    }
    object QueueOptions {
      
      @scala.inline
      def apply(name: String): QueueOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[QueueOptions]
      }
      
      @scala.inline
      implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefix(value: bull | bq | String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setType(value: bull | bee | bullmq | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait RedisClientConnectionOptions extends ConnectionOptions {
      
      var redis: ClientOpts = js.native
    }
    object RedisClientConnectionOptions {
      
      @scala.inline
      def apply(redis: ClientOpts): RedisClientConnectionOptions = {
        val __obj = js.Dynamic.literal(redis = redis.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisClientConnectionOptions]
      }
      
      @scala.inline
      implicit class RedisClientConnectionOptionsMutableBuilder[Self <: RedisClientConnectionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRedis(value: ClientOpts): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RedisUrlConnectionOptions extends ConnectionOptions {
      
      var url: String = js.native
    }
    object RedisUrlConnectionOptions {
      
      @scala.inline
      def apply(url: String): RedisUrlConnectionOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[RedisUrlConnectionOptions]
      }
      
      @scala.inline
      implicit class RedisUrlConnectionOptionsMutableBuilder[Self <: RedisUrlConnectionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
