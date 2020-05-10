package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pivot extends js.Object {
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  var maxGroupCount: js.UndefOr[Double] = js.native
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  var startGroup: js.UndefOr[Double] = js.native
}

object Pivot {
  @scala.inline
  def apply(): Pivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pivot]
  }
  @scala.inline
  implicit class PivotOps[Self <: Pivot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = {
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
    def withDimensions(value: js.Array[Dimension]): Self = {
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
    def withMetrics(value: js.Array[Metric]): Self = {
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

