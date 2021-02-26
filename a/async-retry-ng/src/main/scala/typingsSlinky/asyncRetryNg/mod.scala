package typingsSlinky.asyncRetryNg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-retry-ng/lib", JSImport.Namespace)
  @js.native
  def apply[A](fn: RetryFunction[A]): js.Promise[A] = js.native
  @JSImport("async-retry-ng/lib", JSImport.Namespace)
  @js.native
  def apply[A](fn: RetryFunction[A], opts: Options): js.Promise[A] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var factor: js.UndefOr[Double] = js.native
    
    var maxTimeout: js.UndefOr[Double] = js.native
    
    var minTimeout: js.UndefOr[Double] = js.native
    
    var onRetry: js.UndefOr[js.Function1[/* e */ js.Error, _]] = js.native
    
    var randomize: js.UndefOr[Boolean] = js.native
    
    var retries: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      @scala.inline
      def setMinTimeout(value: Double): Self = StObject.set(x, "minTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeoutUndefined: Self = StObject.set(x, "minTimeout", js.undefined)
      
      @scala.inline
      def setOnRetry(value: /* e */ js.Error => _): Self = StObject.set(x, "onRetry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      @scala.inline
      def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ js.Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
