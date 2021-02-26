package typingsSlinky.circuitBreakerJs

import typingsSlinky.circuitBreakerJs.circuitBreakerJsNumbers.`0`
import typingsSlinky.circuitBreakerJs.circuitBreakerJsNumbers.`1`
import typingsSlinky.circuitBreakerJs.circuitBreakerJsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("circuit-breaker-js", JSImport.Namespace)
  @js.native
  class ^ () extends CircuitBreaker {
    def this(options: Options) = this()
  }
  @JSImport("circuit-breaker-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("circuit-breaker-js", "CLOSED")
  @js.native
  def CLOSED: `2` = js.native
  @scala.inline
  def CLOSED_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("circuit-breaker-js", "HALF_OPEN")
  @js.native
  def HALF_OPEN: `1` = js.native
  @scala.inline
  def HALF_OPEN_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HALF_OPEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("circuit-breaker-js", "OPEN")
  @js.native
  def OPEN: `0` = js.native
  @scala.inline
  def OPEN_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CircuitBreaker extends StObject {
    
    def forceClose(): Unit = js.native
    
    def forceOpen(): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def run(command: js.Function2[/* success */ js.Function0[Unit], /* failure */ js.Function0[Unit], Unit]): Unit = js.native
    def run(
      command: js.Function2[/* success */ js.Function0[Unit], /* failure */ js.Function0[Unit], Unit],
      fallback: js.Function0[Unit]
    ): Unit = js.native
    
    def unforce(): Unit = js.native
  }
  
  @js.native
  trait Metrics extends StObject {
    
    var errorCount: Double = js.native
    
    var errorPercentage: Double = js.native
    
    var totalCount: Double = js.native
  }
  object Metrics {
    
    @scala.inline
    def apply(errorCount: Double, errorPercentage: Double, totalCount: Double): Metrics = {
      val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], errorPercentage = errorPercentage.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorPercentage(value: Double): Self = StObject.set(x, "errorPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var errorThreshold: js.UndefOr[Double] = js.native
    
    var numBuckets: js.UndefOr[Double] = js.native
    
    var onCircuitClose: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.native
    
    var onCircuitOpen: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.native
    
    var timeoutDuration: js.UndefOr[Double] = js.native
    
    var volumeThreshold: js.UndefOr[Double] = js.native
    
    var windowDuration: js.UndefOr[Double] = js.native
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
      def setErrorThreshold(value: Double): Self = StObject.set(x, "errorThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorThresholdUndefined: Self = StObject.set(x, "errorThreshold", js.undefined)
      
      @scala.inline
      def setNumBuckets(value: Double): Self = StObject.set(x, "numBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumBucketsUndefined: Self = StObject.set(x, "numBuckets", js.undefined)
      
      @scala.inline
      def setOnCircuitClose(value: /* m */ Metrics => Unit): Self = StObject.set(x, "onCircuitClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCircuitCloseUndefined: Self = StObject.set(x, "onCircuitClose", js.undefined)
      
      @scala.inline
      def setOnCircuitOpen(value: /* m */ Metrics => Unit): Self = StObject.set(x, "onCircuitOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCircuitOpenUndefined: Self = StObject.set(x, "onCircuitOpen", js.undefined)
      
      @scala.inline
      def setTimeoutDuration(value: Double): Self = StObject.set(x, "timeoutDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutDurationUndefined: Self = StObject.set(x, "timeoutDuration", js.undefined)
      
      @scala.inline
      def setVolumeThreshold(value: Double): Self = StObject.set(x, "volumeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeThresholdUndefined: Self = StObject.set(x, "volumeThreshold", js.undefined)
      
      @scala.inline
      def setWindowDuration(value: Double): Self = StObject.set(x, "windowDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowDurationUndefined: Self = StObject.set(x, "windowDuration", js.undefined)
    }
  }
}
