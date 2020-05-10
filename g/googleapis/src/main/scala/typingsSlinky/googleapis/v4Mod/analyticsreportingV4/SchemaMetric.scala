package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Metrics](https://support.google.com/analytics/answer/1033861) are the
  * quantitative measurements. For example, the metric `ga:users` indicates the
  * total number of users for the requested time period.
  */
@js.native
trait SchemaMetric extends js.Object {
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
  implicit class SchemaMetricOps[Self <: SchemaMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattingType")(js.undefined)
        ret
    }
  }
  
}

