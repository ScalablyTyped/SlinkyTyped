package typingsSlinky.koaRatelimit

import typingsSlinky.ioredis.mod.Redis
import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaRatelimit.koaRatelimitBooleans.`false`
import typingsSlinky.koaRatelimit.koaRatelimitStrings.memory
import typingsSlinky.koaRatelimit.koaRatelimitStrings.redis
import typingsSlinky.redis.mod.RedisClient
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-ratelimit", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-ratelimit", JSImport.Namespace)
  @js.native
  def apply(options: MiddlewareOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait HeaderNameOptions extends StObject {
    
    /**
      * The amount of requests remaining in the current limiting period.
      */
    var remaining: String = js.native
    
    /**
      * The time, expressed as a UNIX epoch timestamp, at which your rate-limit expires.
      */
    var reset: String = js.native
    
    /**
      * The total amount of requests a client may make during a limiting period.
      */
    var total: String = js.native
  }
  object HeaderNameOptions {
    
    @scala.inline
    def apply(remaining: String, reset: String, total: String): HeaderNameOptions = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNameOptions]
    }
    
    @scala.inline
    implicit class HeaderNameOptionsMutableBuilder[Self <: HeaderNameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemaining(value: String): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MiddlewareOptions extends StObject {
    
    /**
      * If function returns true, 403 error is thrown
      */
    var blacklist: js.UndefOr[js.Function1[/* context */ Context, Boolean | js.Promise[Boolean]]] = js.native
    
    /**
      * The database powering the backing rate-limiter package.
      */
    var db: Redis | RedisClient | (Map[_, _]) = js.native
    
    /**
      * Whether or not to disable the usage of rate limit headers. This defaults
      * to **false**.
      */
    var disableHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * Driver to use ("redis" or "memory").
      */
    var driver: redis | memory = js.native
    
    /**
      * The length of a single limiting period. This value is expressed
      * in milliseconds, defaulting to one hour.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The message used on the response body if a client is rate-limited. There is
      * a default message; which includes when they should try again.
      */
    var errorMessage: js.UndefOr[String] = js.native
    
    /**
      * A relation of header to the header's display name.
      */
    var headers: js.UndefOr[HeaderNameOptions] = js.native
    
    /**
      * Get the unique-identifier for a request. This defaults to the
      * client's IP address. Returning "false" will skip rate-limiting.
      */
    var id: js.UndefOr[js.Function1[/* context */ Context, String | `false`]] = js.native
    
    /**
      * The maximum amount of requests a client (see the `id` field) may
      * make during a limiting period. (see `duration`)
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Whether or not to throw an error upon being rate-limited. This uses
      * the Koa context function "throw".
      */
    var `throw`: js.UndefOr[Boolean] = js.native
    
    /**
      * If function returns true, middleware exits before limiting
      */
    var whitelist: js.UndefOr[js.Function1[/* context */ Context, Boolean | js.Promise[Boolean]]] = js.native
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(db: Redis | RedisClient | (Map[_, _]), driver: redis | memory): MiddlewareOptions = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: /* context */ Context => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "blacklist", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setDb(value: Redis | RedisClient | (Map[_, _])): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHeader(value: Boolean): Self = StObject.set(x, "disableHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHeaderUndefined: Self = StObject.set(x, "disableHeader", js.undefined)
      
      @scala.inline
      def setDriver(value: redis | memory): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeaderNameOptions): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setId(value: /* context */ Context => String | `false`): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
      
      @scala.inline
      def setWhitelist(value: /* context */ Context => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    }
  }
}
