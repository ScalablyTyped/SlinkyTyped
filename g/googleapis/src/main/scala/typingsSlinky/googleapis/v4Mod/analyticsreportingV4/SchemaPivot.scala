package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Pivot describes the pivot section in the request. The Pivot helps
  * rearrange the information in the table for certain reports by pivoting your
  * data on a second dimension.
  */
@js.native
trait SchemaPivot extends js.Object {
  /**
    * DimensionFilterClauses are logically combined with an `AND` operator:
    * only data that is included by all these DimensionFilterClauses
    * contributes to the values in this pivot region. Dimension filters can be
    * used to restrict the columns shown in the pivot region. For example if
    * you have `ga:browser` as the requested dimension in the pivot region, and
    * you specify key filters to restrict `ga:browser` to only &quot;IE&quot;
    * or &quot;Firefox&quot;, then only those two browsers would show up as
    * columns.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[SchemaDimensionFilterClause]] = js.native
  /**
    * A list of dimensions to show as pivot columns. A Pivot can have a maximum
    * of 4 dimensions. Pivot dimensions are part of the restriction on the
    * total number of dimensions allowed in the request.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * Specifies the maximum number of groups to return. The default value is
    * 10, also the maximum value is 1,000.
    */
  var maxGroupCount: js.UndefOr[Double] = js.native
  /**
    * The pivot metrics. Pivot metrics are part of the restriction on total
    * number of metrics allowed in the request.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * If k metrics were requested, then the response will contain some
    * data-dependent multiple of k columns in the report.  E.g., if you pivoted
    * on the dimension `ga:browser` then you&#39;d get k columns for
    * &quot;Firefox&quot;, k columns for &quot;IE&quot;, k columns for
    * &quot;Chrome&quot;, etc. The ordering of the groups of columns is
    * determined by descending order of &quot;total&quot; for the first of the
    * k values.  Ties are broken by lexicographic ordering of the first pivot
    * dimension, then lexicographic ordering of the second pivot dimension, and
    * so on.  E.g., if the totals for the first value for Firefox, IE, and
    * Chrome were 8, 2, 8, respectively, the order of columns would be Chrome,
    * Firefox, IE.  The following let you choose which of the groups of k
    * columns are included in the response.
    */
  var startGroup: js.UndefOr[Double] = js.native
}

object SchemaPivot {
  @scala.inline
  def apply(): SchemaPivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivot]
  }
  @scala.inline
  implicit class SchemaPivotOps[Self <: SchemaPivot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionFilterClauses(value: js.Array[SchemaDimensionFilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilterClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionFilterClauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilterClauses")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: js.Array[SchemaDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxGroupCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGroupCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxGroupCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGroupCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[SchemaMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withStartGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startGroup")(js.undefined)
        ret
    }
  }
  
}

