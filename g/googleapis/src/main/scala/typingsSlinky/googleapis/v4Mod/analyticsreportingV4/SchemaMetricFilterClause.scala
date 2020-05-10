package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a group of metric filters. Set the operator value to specify how
  * the filters are logically combined.
  */
@js.native
trait SchemaMetricFilterClause extends js.Object {
  /**
    * The repeated set of filters. They are logically combined based on the
    * operator specified.
    */
  var filters: js.UndefOr[js.Array[SchemaMetricFilter]] = js.native
  /**
    * The operator for combining multiple metric filters. If unspecified, it is
    * treated as an `OR`.
    */
  var operator: js.UndefOr[String] = js.native
}

object SchemaMetricFilterClause {
  @scala.inline
  def apply(): SchemaMetricFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricFilterClause]
  }
  @scala.inline
  implicit class SchemaMetricFilterClauseOps[Self <: SchemaMetricFilterClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[SchemaMetricFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
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

