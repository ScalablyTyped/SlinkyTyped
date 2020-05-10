package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dimension filter specifies the filtering options on a dimension.
  */
@js.native
trait SchemaSegmentDimensionFilter extends js.Object {
  /**
    * Should the match be case sensitive, ignored for `IN_LIST` operator.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Name of the dimension for which the filter is being applied.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The list of expressions, only the first element is used for all operators
    */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum comparison values for `BETWEEN` match type.
    */
  var maxComparisonValue: js.UndefOr[String] = js.native
  /**
    * Minimum comparison values for `BETWEEN` match type.
    */
  var minComparisonValue: js.UndefOr[String] = js.native
  /**
    * The operator to use to match the dimension with the expressions.
    */
  var operator: js.UndefOr[String] = js.native
}

object SchemaSegmentDimensionFilter {
  @scala.inline
  def apply(): SchemaSegmentDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentDimensionFilter]
  }
  @scala.inline
  implicit class SchemaSegmentDimensionFilterOps[Self <: SchemaSegmentDimensionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionName")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxComparisonValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComparisonValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxComparisonValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComparisonValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinComparisonValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minComparisonValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinComparisonValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minComparisonValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
  }
  
}

