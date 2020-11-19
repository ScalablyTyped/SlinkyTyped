package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the category of error indicators. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ChartErrorCategory extends js.Object
object ChartErrorCategory {
  
  /**
    * displays the same lower and upper error indicators for all data points.
    *
    * The values for these are given as absolute numbers in {@link ChartStatistics.ConstantErrorLow} and {@link ChartStatistics.ConstantErrorHigh}
    * @see ChartStatistics
    */
  @scala.inline
  def CONSTANT_VALUE: `5` = 5.asInstanceOf[`5`]
  
  /**
    * The length of the error indicators for all data points is calculated by taking the percentage given as {@link ChartStatistics.ErrorMargin} of the
    * largest data point value.
    * @see ChartStatistics
    */
  @scala.inline
  def ERROR_MARGIN: `4` = 4.asInstanceOf[`4`]
  
  /**
    * error indicators are not displayed.
    *
    * displays no error indicators.
    *
    * no chart legend is displayed. <p>To disable the legend you should set the property
    *
    * ChartDocument::HasLegend to `FALSE` instead
    *
    * of setting this value.</p>
    *
    *
    *
    * displays no regression curve.
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The length of the error indicators is calculated for each data point by taking the percentage given as {@link ChartStatistics.PercentageError} of its
    * value.
    * @see ChartStatistics
    */
  @scala.inline
  def PERCENT: `3` = 3.asInstanceOf[`3`]
  
  /** displays error indicators for the standard deviation (square root of variance) of the data row. */
  @scala.inline
  def STANDARD_DEVIATION: `2` = 2.asInstanceOf[`2`]
  
  /** displays error indicators for the variance of the data row. */
  @scala.inline
  def VARIANCE: `1` = 1.asInstanceOf[`1`]
}
