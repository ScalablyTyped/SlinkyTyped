package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Metrics](https://support.google.com/analytics/answer/1033861) are the
  * quantitative measurements. For example, the metric `ga:users` indicates the
  * total number of users for the requested time period.
  */
@js.native
trait SchemaMetric extends StObject {
  
  /**
    * An alias for the metric expression is an alternate name for the
    * expression. The alias can be used for filtering and sorting. This field
    * is optional and is useful if the expression is not a single metric but a
    * complex expression which cannot be used in filtering and sorting. The
    * alias is also used in the response column header.
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * A metric expression in the request. An expression is constructed from one
    * or more metrics and numbers. Accepted operators include: Plus (+), Minus
    * (-), Negation (Unary -), Divided by (/), Multiplied by (*), Parenthesis,
    * Positive cardinal numbers (0-9), can include decimals and is limited to
    * 1024 characters. Example `ga:totalRefunds/ga:users`, in most cases the
    * metric expression is just a single metric name like `ga:users`. Adding
    * mixed `MetricType` (E.g., `CURRENCY` + `PERCENTAGE`) metrics will result
    * in unexpected results.
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * Specifies how the metric expression should be formatted, for example
    * `INTEGER`.
    */
  var formattingType: js.UndefOr[String] = js.native
}
object SchemaMetric {
  
  @scala.inline
  def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  
  @scala.inline
  implicit class SchemaMetricMutableBuilder[Self <: SchemaMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setFormattingType(value: String): Self = StObject.set(x, "formattingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattingTypeUndefined: Self = StObject.set(x, "formattingType", js.undefined)
  }
}
