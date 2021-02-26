package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityPointOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
    * datetime axes when describing them to screen reader users.
    *
    * Defaults to the same format as in tooltip.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var dateFormat: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
    * the date/time format used with points on datetime axes when describing
    * them to screen reader users. Receives one argument, `point`, referring to
    * the point to describe. Should return a date format string compatible with
    * dateFormat.
    */
  var dateFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for point descriptions.
    *
    * Receives one argument, `point`, referring to the point to describe.
    * Should return a string with the description of the point for a screen
    * reader user. If `false` is returned, the default formatter will be used
    * for that point.
    *
    * Note: Prefer using accessibility.point.valueDescriptionFormat instead if
    * possible, as default functionality such as describing annotations will be
    * preserved.
    */
  var descriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
    * in the point descriptions. Uses tooltip.valueDecimals if not defined.
    */
  var valueDecimals: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
    * values of data points to assistive technology - including screen readers.
    * The point context is available as `{point}`.
    *
    * Additionally, the series name, annotation info, and description added in
    * `point.accessibility.description` is added by default if relevant. To
    * override this, use the accessibility.point.descriptionFormatter option.
    */
  var valueDescriptionFormat: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
    * the point descriptions. Uses tooltip.valuePrefix if not defined.
    */
  var valuePrefix: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
    * the point descriptions. Uses tooltip.valueSuffix if not defined.
    */
  var valueSuffix: js.UndefOr[String] = js.native
}
object AccessibilityPointOptions {
  
  @scala.inline
  def apply(): AccessibilityPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityPointOptions]
  }
  
  @scala.inline
  implicit class AccessibilityPointOptionsMutableBuilder[Self <: AccessibilityPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDateFormatter(value: Point => String): Self = StObject.set(x, "dateFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateFormatterUndefined: Self = StObject.set(x, "dateFormatter", js.undefined)
    
    @scala.inline
    def setDescriptionFormatter(value: Point => String): Self = StObject.set(x, "descriptionFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescriptionFormatterUndefined: Self = StObject.set(x, "descriptionFormatter", js.undefined)
    
    @scala.inline
    def setValueDecimals(value: Double): Self = StObject.set(x, "valueDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDecimalsUndefined: Self = StObject.set(x, "valueDecimals", js.undefined)
    
    @scala.inline
    def setValueDescriptionFormat(value: String): Self = StObject.set(x, "valueDescriptionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDescriptionFormatUndefined: Self = StObject.set(x, "valueDescriptionFormat", js.undefined)
    
    @scala.inline
    def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
    
    @scala.inline
    def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
  }
}
