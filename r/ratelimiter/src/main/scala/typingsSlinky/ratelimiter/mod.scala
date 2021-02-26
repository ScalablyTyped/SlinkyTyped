package typingsSlinky.ratelimiter

import typingsSlinky.redis.mod.RedisClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ratelimiter", JSImport.Namespace)
  @js.native
  class ^ protected () extends Limiter {
    def this(opts: LimiterOption) = this()
  }
  
  @js.native
  trait Limiter extends StObject {
    
    /**
      * Get values and header / status code and invoke `fn(err, info)`.
      */
    def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit]): Unit = js.native
    
    /**
      * Inspect implementation
      */
    def inspect(): String = js.native
  }
  object Limiter {
    
    @scala.inline
    def apply(get: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit] => Unit, inspect: () => String): Limiter = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), inspect = js.Any.fromFunction0(inspect))
      __obj.asInstanceOf[Limiter]
    }
    
    @scala.inline
    implicit class LimiterMutableBuilder[Self <: Limiter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Result Object
    */
  @js.native
  trait LimiterInfo extends StObject {
    
    /**
      * number of calls left in current `duration` without decreasing current `get`
      */
    var remaining: Double = js.native
    
    /**
      * time since epoch in seconds at which the rate limiting period will end (or already ended)
      */
    var reset: Double = js.native
    
    /**
      * time since epoch in milliseconds at which the rate limiting period will end (or already ended)
      */
    var resetMs: Double = js.native
    
    /**
      * `max` value
      */
    var total: Double = js.native
  }
  object LimiterInfo {
    
    @scala.inline
    def apply(remaining: Double, reset: Double, resetMs: Double, total: Double): LimiterInfo = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resetMs = resetMs.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimiterInfo]
    }
    
    @scala.inline
    implicit class LimiterInfoMutableBuilder[Self <: LimiterInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: Double): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetMs(value: Double): Self = StObject.set(x, "resetMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LimiterOption extends StObject {
    
    /**
      * Redis connection instance
      */
    var db: RedisClient = js.native
    
    /**
      * Duration of limit in milliseconds
      * @default 3600000
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The identifier to limit against (typically a user id)
      */
    var id: String = js.native
    
    /**
      * Max requests within duration
      * @default 2500
      */
    var max: js.UndefOr[Double] = js.native
  }
  object LimiterOption {
    
    @scala.inline
    def apply(db: RedisClient, id: String): LimiterOption = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimiterOption]
    }
    
    @scala.inline
    implicit class LimiterOptionMutableBuilder[Self <: LimiterOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(value: RedisClient): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
}
