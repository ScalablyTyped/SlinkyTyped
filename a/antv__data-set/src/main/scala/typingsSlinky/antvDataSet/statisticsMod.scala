package typingsSlinky.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticsMod {
  
  @js.native
  trait StatisticsApi extends StObject {
    
    def average(column: String): Double = js.native
    
    def extent(column: String): Double = js.native
    
    def max(column: String): Double = js.native
    
    def mean(column: String): Double = js.native
    
    def median(column: String): Double = js.native
    
    def min(column: String): Double = js.native
    
    def mode(column: String): Double = js.native
    
    def product(column: String): Double = js.native
    
    def quantile(column: String, percent: Double): Double = js.native
    
    def quantiles(column: String, percents: js.Array[Double]): js.Array[Double] = js.native
    
    def quantilesByFraction(column: String, fraction: Double): Double = js.native
    
    def range(column: String): js.Tuple2[Double, Double] = js.native
    
    def standardDeviation(column: String): Double = js.native
    
    def sum(column: String): Double = js.native
    
    def sumSimple(column: String): Double = js.native
    
    def variance(column: String): Double = js.native
  }
  object StatisticsApi {
    
    @scala.inline
    def apply(
      average: String => Double,
      extent: String => Double,
      max: String => Double,
      mean: String => Double,
      median: String => Double,
      min: String => Double,
      mode: String => Double,
      product: String => Double,
      quantile: (String, Double) => Double,
      quantiles: (String, js.Array[Double]) => js.Array[Double],
      quantilesByFraction: (String, Double) => Double,
      range: String => js.Tuple2[Double, Double],
      standardDeviation: String => Double,
      sum: String => Double,
      sumSimple: String => Double,
      variance: String => Double
    ): StatisticsApi = {
      val __obj = js.Dynamic.literal(average = js.Any.fromFunction1(average), extent = js.Any.fromFunction1(extent), max = js.Any.fromFunction1(max), mean = js.Any.fromFunction1(mean), median = js.Any.fromFunction1(median), min = js.Any.fromFunction1(min), mode = js.Any.fromFunction1(mode), product = js.Any.fromFunction1(product), quantile = js.Any.fromFunction2(quantile), quantiles = js.Any.fromFunction2(quantiles), quantilesByFraction = js.Any.fromFunction2(quantilesByFraction), range = js.Any.fromFunction1(range), standardDeviation = js.Any.fromFunction1(standardDeviation), sum = js.Any.fromFunction1(sum), sumSimple = js.Any.fromFunction1(sumSimple), variance = js.Any.fromFunction1(variance))
      __obj.asInstanceOf[StatisticsApi]
    }
    
    @scala.inline
    implicit class StatisticsApiMutableBuilder[Self <: StatisticsApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAverage(value: String => Double): Self = StObject.set(x, "average", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtent(value: String => Double): Self = StObject.set(x, "extent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMax(value: String => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMean(value: String => Double): Self = StObject.set(x, "mean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMedian(value: String => Double): Self = StObject.set(x, "median", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMin(value: String => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMode(value: String => Double): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProduct(value: String => Double): Self = StObject.set(x, "product", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuantile(value: (String, Double) => Double): Self = StObject.set(x, "quantile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQuantiles(value: (String, js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "quantiles", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQuantilesByFraction(value: (String, Double) => Double): Self = StObject.set(x, "quantilesByFraction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRange(value: String => js.Tuple2[Double, Double]): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStandardDeviation(value: String => Double): Self = StObject.set(x, "standardDeviation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSum(value: String => Double): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSumSimple(value: String => Double): Self = StObject.set(x, "sumSimple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVariance(value: String => Double): Self = StObject.set(x, "variance", js.Any.fromFunction1(value))
    }
  }
}
