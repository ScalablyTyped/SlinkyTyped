package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A &lt;a
  * href=&quot;/chart/interactive/docs/gallery/histogram&quot;&gt;histogram
  * chart&lt;/a&gt;. A histogram chart groups data items into bins, displaying
  * each bin as a column of stacked items.  Histograms are used to display the
  * distribution of a dataset.  Each column of items represents a range into
  * which those items fall.  The number of bins can be chosen automatically or
  * specified explicitly.
  */
@js.native
trait SchemaHistogramChartSpec extends js.Object {
  /**
    * By default the bucket size (the range of values stacked in a single
    * column) is chosen automatically, but it may be overridden here. E.g., A
    * bucket size of 1.5 results in buckets from 0 - 1.5, 1.5 - 3.0, etc.
    * Cannot be negative. This field is optional.
    */
  var bucketSize: js.UndefOr[Double] = js.native
  /**
    * The position of the chart legend.
    */
  var legendPosition: js.UndefOr[String] = js.native
  /**
    * The outlier percentile is used to ensure that outliers do not adversely
    * affect the calculation of bucket sizes.  For example, setting an outlier
    * percentile of 0.05 indicates that the top and bottom 5% of values when
    * calculating buckets.  The values are still included in the chart, they
    * will be added to the first or last buckets instead of their own buckets.
    * Must be between 0.0 and 0.5.
    */
  var outlierPercentile: js.UndefOr[Double] = js.native
  /**
    * The series for a histogram may be either a single series of values to be
    * bucketed or multiple series, each of the same length, containing the name
    * of the series followed by the values to be bucketed for that series.
    */
  var series: js.UndefOr[js.Array[SchemaHistogramSeries]] = js.native
  /**
    * Whether horizontal divider lines should be displayed between items in
    * each column.
    */
  var showItemDividers: js.UndefOr[Boolean] = js.native
}

object SchemaHistogramChartSpec {
  @scala.inline
  def apply(): SchemaHistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramChartSpec]
  }
  @scala.inline
  implicit class SchemaHistogramChartSpecOps[Self <: SchemaHistogramChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlierPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlierPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlierPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlierPercentile")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[SchemaHistogramSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withShowItemDividers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showItemDividers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowItemDividers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showItemDividers")(js.undefined)
        ret
    }
  }
  
}

