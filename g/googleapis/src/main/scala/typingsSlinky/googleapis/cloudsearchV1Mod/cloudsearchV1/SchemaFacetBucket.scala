package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bucket in a facet is the basic unit of operation. A bucket can comprise
  * either a single value OR a contiguous range of values, depending on the
  * type of the field bucketed. FacetBucket is currently used only for
  * returning the response object.
  */
@js.native
trait SchemaFacetBucket extends js.Object {
  /**
    * Number of results that match the bucket value. Counts are only returned
    * for searches when count accuracy is ensured. Can be empty.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Percent of results that match the bucket value. This value is between
    * (0-100]. Percentages are returned for all searches, but are an estimate.
    * Because percentages are always returned, you should render percentages
    * instead of counts.
    */
  var percentage: js.UndefOr[Double] = js.native
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaFacetBucket {
  @scala.inline
  def apply(): SchemaFacetBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetBucket]
  }
  @scala.inline
  implicit class SchemaFacetBucketOps[Self <: SchemaFacetBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SchemaValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

