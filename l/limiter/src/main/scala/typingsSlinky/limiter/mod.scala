package typingsSlinky.limiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("limiter", "RateLimiter")
  @js.native
  class RateLimiter protected () extends StObject {
    def this(tokensPerInterval: Double, interval: Interval) = this()
    def this(tokensPerInterval: Double, interval: Interval, fireImmediately: Boolean) = this()
    
    def getTokensRemaining(): Double = js.native
    
    def removeTokens(count: Double, callback: RemoveTokensCallback): Unit = js.native
    
    def tryRemoveTokens(count: Double): Boolean = js.native
  }
  
  @JSImport("limiter", "TokenBucket")
  @js.native
  class TokenBucket protected () extends StObject {
    def this(bucketSize: Double, tokensPerInterval: Double, interval: Interval) = this()
    def this(bucketSize: Double, tokensPerInterval: Double, interval: Interval, parentBucket: TokenBucket) = this()
    
    def drip(): Boolean = js.native
    
    def removeTokens(count: Double, callback: RemoveTokensCallback): Unit = js.native
    
    def tryRemoveTokens(count: Double): Boolean = js.native
  }
  
  type Fail[T] = js.Function1[/* error */ T, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.limiter.limiterStrings.second
    - typingsSlinky.limiter.limiterStrings.sec
    - typingsSlinky.limiter.limiterStrings.minute
    - typingsSlinky.limiter.limiterStrings.min
    - typingsSlinky.limiter.limiterStrings.hour
    - typingsSlinky.limiter.limiterStrings.hr
    - typingsSlinky.limiter.limiterStrings.day
  */
  type Interval = _Interval | Double
  
  type RemoveTokensCallback = Fail[TokenBucketError] | Success[Double]
  
  type Success[T] = js.Function2[/* error */ Null, /* data */ T, Unit]
  
  type TokenBucketError = String
  
  trait _Interval extends StObject
}
