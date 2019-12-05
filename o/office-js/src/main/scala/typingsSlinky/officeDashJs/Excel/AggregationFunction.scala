package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AggregationFunction extends js.Object

/**
  *
  * Aggregation Function for the Data Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.AggregationFunction")
@js.native
object AggregationFunction extends js.Object {
  /**
    *
    * Excel will automatically select the aggregation based on the data items.
    *
    */
  @js.native
  sealed trait automatic extends AggregationFunction
  
  /**
    *
    * Aggregate using the average of the data, equivalent to the AVERAGE function.
    *
    */
  @js.native
  sealed trait average extends AggregationFunction
  
  /**
    *
    * Aggregate using the count of items in the data, equivalent to the COUNTA function.
    *
    */
  @js.native
  sealed trait count extends AggregationFunction
  
  /**
    *
    * Aggregate using the count of numbers in the data, equivalent to the COUNT function.
    *
    */
  @js.native
  sealed trait countNumbers extends AggregationFunction
  
  /**
    *
    * Aggregate using the maximum value of the data, equivalent to the MAX function.
    *
    */
  @js.native
  sealed trait max extends AggregationFunction
  
  /**
    *
    * Aggregate using the minimum value of the data, equivalent to the MIN function.
    *
    */
  @js.native
  sealed trait min extends AggregationFunction
  
  /**
    *
    * Aggregate using the product of the data, equivalent to the PRODUCT function.
    *
    */
  @js.native
  sealed trait product extends AggregationFunction
  
  /**
    *
    * Aggregate using the standard deviation of the data, equivalent to the STDEV function.
    *
    */
  @js.native
  sealed trait standardDeviation extends AggregationFunction
  
  /**
    *
    * Aggregate using the standard deviation of the data, equivalent to the STDEVP function.
    *
    */
  @js.native
  sealed trait standardDeviationP extends AggregationFunction
  
  /**
    *
    * Aggregate using the sum of the data, equivalent to the SUM function.
    *
    */
  @js.native
  sealed trait sum extends AggregationFunction
  
  /**
    *
    * Aggregation function is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends AggregationFunction
  
  /**
    *
    * Aggregate using the variance of the data, equivalent to the VAR function.
    *
    */
  @js.native
  sealed trait variance extends AggregationFunction
  
  /**
    *
    * Aggregate using the variance of the data, equivalent to the VARP function.
    *
    */
  @js.native
  sealed trait varianceP extends AggregationFunction
  
  /* "Automatic" */ val automatic: typingsSlinky.officeDashJs.Excel.AggregationFunction.automatic with String = js.native
  /* "Average" */ val average: typingsSlinky.officeDashJs.Excel.AggregationFunction.average with String = js.native
  /* "Count" */ val count: typingsSlinky.officeDashJs.Excel.AggregationFunction.count with String = js.native
  /* "CountNumbers" */ val countNumbers: typingsSlinky.officeDashJs.Excel.AggregationFunction.countNumbers with String = js.native
  /* "Max" */ val max: typingsSlinky.officeDashJs.Excel.AggregationFunction.max with String = js.native
  /* "Min" */ val min: typingsSlinky.officeDashJs.Excel.AggregationFunction.min with String = js.native
  /* "Product" */ val product: typingsSlinky.officeDashJs.Excel.AggregationFunction.product with String = js.native
  /* "StandardDeviation" */ val standardDeviation: typingsSlinky.officeDashJs.Excel.AggregationFunction.standardDeviation with String = js.native
  /* "StandardDeviationP" */ val standardDeviationP: typingsSlinky.officeDashJs.Excel.AggregationFunction.standardDeviationP with String = js.native
  /* "Sum" */ val sum: typingsSlinky.officeDashJs.Excel.AggregationFunction.sum with String = js.native
  /* "Unknown" */ val unknown: typingsSlinky.officeDashJs.Excel.AggregationFunction.unknown with String = js.native
  /* "Variance" */ val variance: typingsSlinky.officeDashJs.Excel.AggregationFunction.variance with String = js.native
  /* "VarianceP" */ val varianceP: typingsSlinky.officeDashJs.Excel.AggregationFunction.varianceP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AggregationFunction with String] = js.native
}

